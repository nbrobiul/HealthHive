package com.dalazu.addprescription.ui.LoginSignupForget;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.dalazu.addprescription.R;
import com.dalazu.addprescription.ui.DashboardActivity.DashboardActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textview.MaterialTextView;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity {

    TextInputEditText etEmail, etPassword;
    MaterialButton btnLogin;
    MaterialTextView tvCreateNewAccount, tvForgetPassword;
    FirebaseAuth mAuth;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Linking views from XML
        etEmail = findViewById(R.id.et_email);
        etPassword = findViewById(R.id.et_password);
        tvCreateNewAccount = findViewById(R.id.tv_create_new_account);
        btnLogin = findViewById(R.id.btn_login);
        mAuth = FirebaseAuth.getInstance();
        progressBar = findViewById(R.id.progress_bar);
        tvForgetPassword = findViewById(R.id.tv_forget_password);

        // Check if already logged in, then skip login screen
        SharedPreferences sharedPreferences = getSharedPreferences("UserSession", MODE_PRIVATE);
        boolean isLoggedIn = sharedPreferences.getBoolean("isLoggedIn", false);

        if (isLoggedIn) {
            startActivity(new Intent(Login.this, DashboardActivity.class));
            finish();
        }

        // Redirecting to "Create New Account" screen
        tvCreateNewAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Login.this, RegisterAccount.class));
            }
        });

        // Login button click listener
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.VISIBLE);

                // Getting user inputs
                String email = etEmail.getText().toString().trim();
                String password = etPassword.getText().toString().trim();

                // Checking for empty fields
                if (TextUtils.isEmpty(email)) {
                    progressBar.setVisibility(View.GONE);
                    etEmail.setError("Email cannot be empty!");
                    etEmail.requestFocus();
                    return;
                }

                if (TextUtils.isEmpty(password)) {
                    progressBar.setVisibility(View.GONE);
                    etPassword.setError("Password cannot be empty!");
                    etPassword.requestFocus();
                    return;
                }

                // Firebase Authentication
                mAuth.signInWithEmailAndPassword(email, password)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                progressBar.setVisibility(View.GONE);
                                if (task.isSuccessful()) {
                                    // Store login status in SharedPreferences
                                    SharedPreferences sharedPreferences = getSharedPreferences("UserSession", MODE_PRIVATE);
                                    SharedPreferences.Editor editor = sharedPreferences.edit();
                                    editor.putBoolean("isLoggedIn", true);
                                    editor.apply();

                                    Toast.makeText(Login.this, "Login successful.", Toast.LENGTH_SHORT).show();
                                    startActivity(new Intent(Login.this, DashboardActivity.class));
                                    finish();
                                } else {
                                    etPassword.setError("Invalid email or password!");
                                    etPassword.requestFocus();
                                }
                            }
                        });
            }
        });


        tvForgetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(Login.this, ForgetPassword.class));

            }
        });

    }
}



