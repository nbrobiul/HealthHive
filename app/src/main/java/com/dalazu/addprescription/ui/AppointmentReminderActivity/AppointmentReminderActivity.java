package com.dalazu.addprescription.ui.AppointmentReminderActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.dalazu.addprescription.utils.AppointmentReminderAdapter;
import com.dalazu.addprescription.R;
import com.dalazu.addprescription.model.AppointmentReminderItem;

import java.util.ArrayList;
import java.util.List;

public class AppointmentReminderActivity extends AppCompatActivity {


    private List<AppointmentReminderItem> itemList;

    Button btnPrescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appointment_reminder);

        btnPrescription = findViewById(R.id.btn_prescription);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        btnPrescription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(AppointmentReminderActivity.this, AddAppointmentReminder.class));

            }
        });

        itemList = new ArrayList<>();
        itemList.add(new AppointmentReminderItem("Md Saimul Hoque", "Date: 10/10/2025", "Time: 4.20pm", "Serial Number: 109", "Visited:5", "Contact Number: 018456781234", "Chamber:House No 15, ABlock Halishohor Chattogram"));
        itemList.add(new AppointmentReminderItem("Md Naimul Hasan", "Date: 10/10/2025", "Time: 4.20pm", "Serial Number: 109", "Visited:5", "Contact Number: 018456781234", "Chamber:House No 15, ABlock Halishohor Chattogram"));
        itemList.add(new AppointmentReminderItem("Md jomir", "Date: 10/10/2025", "Time: 4.20pm", "Serial Number: 109", "Visited:5", "Contact Number: 018456781234", "Chamber:House No 15, ABlock Halishohor Chattogram"));
        itemList.add(new AppointmentReminderItem("Halkat Chowdory", "Date: 10/10/2025", "Time: 4.20pm", "Serial Number: 109", "Visited:5", "Contact Number: 018456781234", "Chamber:House No 15, ABlock Halishohor Chattogram"));

        AppointmentReminderAdapter adapter = new AppointmentReminderAdapter(itemList);
        recyclerView.setAdapter(adapter);

    }
}