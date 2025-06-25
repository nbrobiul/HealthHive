package com.dalazu.addprescription.ui.MedicineReminderActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.dalazu.addprescription.ui.AppointmentReminderActivity.AddMReminder;
import com.dalazu.addprescription.R;
import com.dalazu.addprescription.model.MyItem;
import com.dalazu.addprescription.utils.MedicineReminderAdapter;

import java.util.ArrayList;
import java.util.List;

public class MedicineReminderActivity extends AppCompatActivity {

    Button btnAddReminder;
    private List<MyItem> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicine_reminder);

        btnAddReminder = findViewById(R.id.btn_add_reminder);


        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        itemList = new ArrayList<>();
        itemList.add(new MyItem("Camlodin Plus 120 mg", "Duration: 1 Month", "Frequency: Daily", "Start Date: 2025-01-01", "End Date: 2025-01-01", "Take with water after meals. Avoid taking it on an empty stomach."));
        itemList.add(new MyItem("Napa", "Duration: 2 Month", "Frequency: weekly", "Start Date: 2024-01-01", "End Date: 2024-09-01", "Take with water after dinner. Avoid taking it on an empty stomach."));
        itemList.add(new MyItem("Camlodin Plus 120 mg", "Duration: 1 Month", "Frequency: Daily", "Start Date: 2025-01-01", "End Date: 2025-01-01", "Take with water after meals. Avoid taking it on an empty stomach."));
        itemList.add(new MyItem("Camlodin Plus 120 mg", "Duration: 1 Month", "Frequency: Daily", "Start Date: 2025-01-01", "End Date: 2025-01-01", "Take with water after meals. Avoid taking it on an empty stomach."));
        itemList.add(new MyItem("Camlodin Plus 120 mg", "Duration: 1 Month", "Frequency: Daily", "Start Date: 2025-01-01", "End Date: 2025-01-01", "Take with water after meals. Avoid taking it on an empty stomach."));
        itemList.add(new MyItem("Camlodin Plus 120 mg", "Duration: 1 Month", "Frequency: Daily", "Start Date: 2025-01-01", "End Date: 2025-01-01", "Take with water after meals. Avoid taking it on an empty stomach."));
        itemList.add(new MyItem("Camlodin Plus 120 mg", "Duration: 1 Month", "Frequency: Daily", "Start Date: 2025-01-01", "End Date: 2025-01-01", "Take with water after meals. Avoid taking it on an empty stomach."));
        itemList.add(new MyItem("Camlodin Plus 120 mg", "Duration: 1 Month", "Frequency: Daily", "Start Date: 2025-01-01", "End Date: 2025-01-01", "Take with water after meals. Avoid taking it on an empty stomach."));
        itemList.add(new MyItem("Camlodin Plus 120 mg", "Duration: 1 Month", "Frequency: Daily", "Start Date: 2025-01-01", "End Date: 2025-01-01", "Take with water after meals. Avoid taking it on an empty stomach."));
        itemList.add(new MyItem("Camlodin Plus 120 mg", "Duration: 1 Month", "Frequency: Daily", "Start Date: 2025-01-01", "End Date: 2025-01-01", "Take with water after meals. Avoid taking it on an empty stomach."));
        itemList.add(new MyItem("Camlodin Plus 120 mg", "Duration: 1 Month", "Frequency: Daily", "Start Date: 2025-01-01", "End Date: 2025-01-01", "Take with water after meals. Avoid taking it on an empty stomach."));
        itemList.add(new MyItem("Camlodin Plus 120 mg", "Duration: 1 Month", "Frequency: Daily", "Start Date: 2025-01-01", "End Date: 2025-01-01", "Take with water after meals. Avoid taking it on an empty stomach."));
        itemList.add(new MyItem("Camlodin Plus 120 mg", "Duration: 1 Month", "Frequency: Daily", "Start Date: 2025-01-01", "End Date: 2025-01-01", "Take with water after meals. Avoid taking it on an empty stomach."));
        itemList.add(new MyItem("Camlodin Plus 120 mg", "Duration: 1 Month", "Frequency: Daily", "Start Date: 2025-01-01", "End Date: 2025-01-01", "Take with water after meals. Avoid taking it on an empty stomach."));
        itemList.add(new MyItem("Camlodin Plus 120 mg", "Duration: 1 Month", "Frequency: Daily", "Start Date: 2025-01-01", "End Date: 2025-01-01", "Take with water after meals. Avoid taking it on an empty stomach."));
        itemList.add(new MyItem("Camlodin Plus 120 mg", "Duration: 1 Month", "Frequency: Daily", "Start Date: 2025-01-01", "End Date: 2025-01-01", "Take with water after meals. Avoid taking it on an empty stomach."));
        itemList.add(new MyItem("Camlodin Plus 120 mg", "Duration: 1 Month", "Frequency: Daily", "Start Date: 2025-01-01", "End Date: 2025-01-01", "Take with water after meals. Avoid taking it on an empty stomach."));
        itemList.add(new MyItem("Camlodin Plus 120 mg", "Duration: 1 Month", "Frequency: Daily", "Start Date: 2025-01-01", "End Date: 2025-01-01", "Take with water after meals. Avoid taking it on an empty stomach."));
        itemList.add(new MyItem("Camlodin Plus 120 mg", "Duration: 1 Month", "Frequency: Daily", "Start Date: 2025-01-01", "End Date: 2025-01-01", "Take with water after meals. Avoid taking it on an empty stomach."));
        itemList.add(new MyItem("Camlodin Plus 120 mg", "Duration: 1 Month", "Frequency: Daily", "Start Date: 2025-01-01", "End Date: 2025-01-01", "Take with water after meals. Avoid taking it on an empty stomach."));
        itemList.add(new MyItem("Camlodin Plus 120 mg", "Duration: 1 Month", "Frequency: Daily", "Start Date: 2025-01-01", "End Date: 2025-01-01", "Take with water after meals. Avoid taking it on an empty stomach."));
        itemList.add(new MyItem("Camlodin Plus 120 mg", "Duration: 1 Month", "Frequency: Daily", "Start Date: 2025-01-01", "End Date: 2025-01-01", "Take with water after meals. Avoid taking it on an empty stomach."));
        itemList.add(new MyItem("Camlodin Plus 120 mg", "Duration: 1 Month", "Frequency: Daily", "Start Date: 2025-01-01", "End Date: 2025-01-01", "Take with water after meals. Avoid taking it on an empty stomach."));
        itemList.add(new MyItem("Camlodin Plus 120 mg", "Duration: 1 Month", "Frequency: Daily", "Start Date: 2025-01-01", "End Date: 2025-01-01", "Take with water after meals. Avoid taking it on an empty stomach."));
        itemList.add(new MyItem("Camlodin Plus 120 mg", "Duration: 1 Month", "Frequency: Daily", "Start Date: 2025-01-01", "End Date: 2025-01-01", "Take with water after meals. Avoid taking it on an empty stomach."));
        itemList.add(new MyItem("Camlodin Plus 120 mg", "Duration: 1 Month", "Frequency: Daily", "Start Date: 2025-01-01", "End Date: 2025-01-01", "Take with water after meals. Avoid taking it on an empty stomach."));
        itemList.add(new MyItem("Camlodin Plus 120 mg", "Duration: 1 Month", "Frequency: Daily", "Start Date: 2025-01-01", "End Date: 2025-01-01", "Take with water after meals. Avoid taking it on an empty stomach."));
        itemList.add(new MyItem("Camlodin Plus 120 mg", "Duration: 1 Month", "Frequency: Daily", "Start Date: 2025-01-01", "End Date: 2025-01-01", "Take with water after meals. Avoid taking it on an empty stomach."));


        MedicineReminderAdapter adapter = new MedicineReminderAdapter(itemList);
        recyclerView.setAdapter(adapter);


        btnAddReminder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MedicineReminderActivity.this, AddMReminder.class));

            }
        });

    }
}