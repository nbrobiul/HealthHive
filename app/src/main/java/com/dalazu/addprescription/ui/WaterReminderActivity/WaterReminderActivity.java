package com.dalazu.addprescription.ui.WaterReminderActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.dalazu.addprescription.R;
import com.dalazu.addprescription.utils.WaterReminderAdapter;
import com.dalazu.addprescription.model.WaterReminderItems;

import java.util.ArrayList;
import java.util.List;

public class WaterReminderActivity extends AppCompatActivity {

    private List<WaterReminderItems> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water_reminder);

        RecyclerView recyclerView = findViewById(R.id.water_reminder_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        itemList = new ArrayList<>();
        itemList.add(new WaterReminderItems("100 ml", "12:45"));
        itemList.add(new WaterReminderItems("150 ml", "01:45"));
        itemList.add(new WaterReminderItems("100 ml", "12:45"));
        itemList.add(new WaterReminderItems("100 ml", "12:45"));
        itemList.add(new WaterReminderItems("150 ml", "01:45"));
        itemList.add(new WaterReminderItems("100 ml", "12:45"));
        itemList.add(new WaterReminderItems("100 ml", "12:45"));
        itemList.add(new WaterReminderItems("150 ml", "01:45"));
        itemList.add(new WaterReminderItems("100 ml", "12:45"));
        itemList.add(new WaterReminderItems("100 ml", "12:45"));
        itemList.add(new WaterReminderItems("150 ml", "01:45"));
        itemList.add(new WaterReminderItems("100 ml", "12:45"));
        itemList.add(new WaterReminderItems("100 ml", "12:45"));
        itemList.add(new WaterReminderItems("150 ml", "01:45"));
        itemList.add(new WaterReminderItems("100 ml", "12:45"));
        itemList.add(new WaterReminderItems("100 ml", "12:45"));
        itemList.add(new WaterReminderItems("150 ml", "01:45"));
        itemList.add(new WaterReminderItems("100 ml", "12:45"));
        itemList.add(new WaterReminderItems("100 ml", "12:45"));
        itemList.add(new WaterReminderItems("150 ml", "01:45"));
        itemList.add(new WaterReminderItems("100 ml", "12:45"));
        itemList.add(new WaterReminderItems("100 ml", "12:45"));
        itemList.add(new WaterReminderItems("150 ml", "01:45"));
        itemList.add(new WaterReminderItems("100 ml", "12:45"));



        WaterReminderAdapter adapter = new WaterReminderAdapter(itemList);
        recyclerView.setAdapter(adapter);

    }
}