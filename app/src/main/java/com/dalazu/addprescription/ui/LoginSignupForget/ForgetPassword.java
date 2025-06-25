package com.dalazu.addprescription.ui.LoginSignupForget;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.dalazu.addprescription.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class ForgetPassword extends AppCompatActivity {

    private TextInputLayout tiEmail;
    private TextInputEditText etEmail;
    private MaterialButton btnConfirm;
    private FirebaseAuth mAuth;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);  // Make sure the XML layout file name is correct

        // Initialize FirebaseAuth instance
        mAuth = FirebaseAuth.getInstance();

        // Initialize UI elements
        tiEmail = findViewById(R.id.ti_email);
        etEmail = findViewById(R.id.et_email);
        btnConfirm = findViewById(R.id.btn_sing_in);
        progressBar = findViewById(R.id.progress_bar);

        // Set onClick listener for the "Confirm" button
        btnConfirm.setOnClickListener(v -> {
            String email = etEmail.getText().toString().trim();

            // Check if the email field is empty
            if (TextUtils.isEmpty(email)) {
                tiEmail.setError("Please enter your email.");
                return;
            }

            // Show progress bar while sending the email
            progressBar.setVisibility(View.VISIBLE);

            // Send password reset email
            sendPasswordResetEmail(email);
        });
    }

    private void sendPasswordResetEmail(String email) {
        // Firebase password reset logic
        mAuth.sendPasswordResetEmail(email)
                .addOnCompleteListener(this, task -> {
                    progressBar.setVisibility(View.GONE); // Hide progress bar once task is completed

                    if (task.isSuccessful()) {
                        // Show success message
                        Toast.makeText(ForgetPassword.this, "Password reset email sent.", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(getApplicationContext(), Login.class));
                        finish();
                    } else {
                        // Show error message
                        Toast.makeText(ForgetPassword.this, "Failed to send reset email. Please try again.", Toast.LENGTH_SHORT).show();
                    }
                });
    }
}
