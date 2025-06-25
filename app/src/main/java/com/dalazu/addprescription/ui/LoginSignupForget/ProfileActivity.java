package com.dalazu.addprescription.ui.LoginSignupForget;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.dalazu.addprescription.R;
import com.github.dhaval2404.imagepicker.ImagePicker;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener;
import com.google.android.material.textfield.TextInputEditText;

import java.util.Calendar;
import java.util.TimeZone;

import de.hdodenhof.circleimageview.CircleImageView;

public class ProfileActivity extends AppCompatActivity {

    private CircleImageView circleImageView;
    private ImageView imageView;
    private Button UpdateButton;
    private TextInputEditText etName, etBirthDate, etEmail, etContactNumber,etHeight,etWeight;
    private AutoCompleteTextView actGender,actBloodGroup;

    String[] gender_item = {"Man", "Woman", "others"};
    ArrayAdapter<String> adapterGenderItems;

    String[] bloodGroup_item = {"A positive (A+)", "A negative (A-)", "B positive (B+)", "B negative (B-)", "O positive (O+))", "O negative (O-)", "AB positive (AB+)", "AB negative (AB-)"} ;
    ArrayAdapter<String> adapterBloodGroupItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        actGender = findViewById(R.id.act_gender);
        adapterGenderItems = new ArrayAdapter<String>(this,R.layout.gender_dropdown_items,gender_item);
        actGender.setAdapter(adapterGenderItems);

        actBloodGroup = findViewById(R.id.act_blood_group);
        adapterBloodGroupItems = new ArrayAdapter<String>(this,R.layout.blood_group_dropdown_items,bloodGroup_item);
        actBloodGroup.setAdapter(adapterBloodGroupItems);

        imageView = findViewById(R.id.profile_edit_icon);
        circleImageView = findViewById(R.id.iv_profile);
        UpdateButton = findViewById(R.id.update_btn);

        etName = findViewById(R.id.et_name);
        etBirthDate = findViewById(R.id.et_birth_date);
        etEmail = findViewById(R.id.et_gmail);
        etContactNumber = findViewById(R.id.ac_contact_number);
        etHeight = findViewById(R.id.et_height);
        etWeight = findViewById(R.id.act_weight);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ImagePicker.with(ProfileActivity.this)
                        .crop()
                        .compress(1024)
                        .maxResultSize(1080, 1080)
                        .start();
            }
        });

        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.clear();
        long today = MaterialDatePicker.todayInUtcMilliseconds();

        MaterialDatePicker.Builder builder = MaterialDatePicker.Builder.datePicker();
        builder.setTitleText("SELECT DATE");
        builder.setSelection(today);
        MaterialDatePicker materialDatePicker = builder.build();

        etBirthDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                materialDatePicker.show(getSupportFragmentManager(),"JJJJJJJ");
            }
        });
        materialDatePicker.addOnPositiveButtonClickListener(new MaterialPickerOnPositiveButtonClickListener() {
            @Override
            public void onPositiveButtonClick(Object selection) {
                etBirthDate.setText(materialDatePicker.getHeaderText());
            }
        });



        UpdateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String userName = etName.getText().toString().trim();
                String userBirthDate = etBirthDate.getText().toString().trim();
                String userEmail = etEmail.getText().toString().trim();
                String userContactNumber = etContactNumber.getText().toString().trim();
                String userHeight = etHeight.getText().toString().trim();
                String userWeight = etWeight.getText().toString().trim();

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Uri uri = data.getData();
        circleImageView.setImageURI(uri);


    }

}