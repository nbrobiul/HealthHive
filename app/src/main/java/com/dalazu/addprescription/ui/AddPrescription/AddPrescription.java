package com.dalazu.addprescription.ui.AddPrescription;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.dalazu.addprescription.R;
import com.github.dhaval2404.imagepicker.ImagePicker;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener;
import com.google.android.material.textfield.TextInputEditText;

import java.util.Calendar;
import java.util.TimeZone;

public class AddPrescription extends AppCompatActivity {

    private TextInputEditText etDoctorName, etAppointmentDate, etDoctorChamberAddress;
    private ImageView ivAddImage;
    private Button addPrescriptionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_prescription);

        etDoctorName = findViewById(R.id.et_doctor_name);
        etAppointmentDate = findViewById(R.id.et_Appointment_date);
        etDoctorChamberAddress = findViewById(R.id.et_doctor_chamber_address);
        ivAddImage = findViewById(R.id.iv_addImage);
        etAppointmentDate = findViewById(R.id.et_Appointment_date);
        addPrescriptionButton = findViewById(R.id.add_prescription_button);


        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.clear();
        long today = MaterialDatePicker.todayInUtcMilliseconds();

        MaterialDatePicker.Builder builder = MaterialDatePicker.Builder.datePicker();
        builder.setTitleText("SELECT DATE");
        builder.setSelection(today);
        MaterialDatePicker materialDatePicker = builder.build();

        etAppointmentDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                materialDatePicker.show(getSupportFragmentManager(),"JJJJJJJ");
            }
        });
        materialDatePicker.addOnPositiveButtonClickListener(new MaterialPickerOnPositiveButtonClickListener() {
            @Override
            public void onPositiveButtonClick(Object selection) {
                etAppointmentDate.setText(materialDatePicker.getHeaderText());
            }
        });

        ivAddImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ImagePicker.with(AddPrescription.this)
                        .crop()
                        .compress(1024)
                        .maxResultSize(1080, 1080)
                        .start();
            }
        });


        addPrescriptionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String userDoctorName = etDoctorName.getText().toString().trim();
                String userAppointmentDate = etAppointmentDate.getText().toString().trim();
                String userDoctorChamberAddress = etDoctorChamberAddress.getText().toString().trim();

            }
        });



    }
}