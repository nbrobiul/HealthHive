package com.dalazu.addprescription.ui.AddPrescription;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.dalazu.addprescription.utils.PrescriptionFileAdapter;
import com.dalazu.addprescription.R;

import java.util.ArrayList;
import java.util.List;

public class PrescriptionFile extends AppCompatActivity {

    Button btnPrescription;

    private List<PrescriptionFileItems> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prescription_file);

        btnPrescription = findViewById(R.id.btn_prescription);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        btnPrescription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(PrescriptionFile.this, AddPrescription.class));

            }
        });


        itemList = new ArrayList<>();
        itemList.add(new PrescriptionFileItems("Doctor Amjad Hossain","12/12/2024","A,Block,House: 2,Halishohor,"));
        itemList.add(new PrescriptionFileItems("Dr. AKM Musa Bhuiyan Bablu","12/12/2024","A,Block,House: 2,Halishohor,"));
        itemList.add(new PrescriptionFileItems("Doctor Saimul Hoqe","12/12/2024","A,Block,House: 2,Halishohor,"));
        itemList.add(new PrescriptionFileItems("Doctor Amjad sarkar","12/12/2024","A,Block,House: 2,Halishohor,"));
        itemList.add(new PrescriptionFileItems("Doctor Obinash Roy","12/12/2024","A,Block,House: 2,Halishohor,"));
        itemList.add(new PrescriptionFileItems("Dr. Farhana Anam","12/12/2024","A,Block,House: 2,Halishohor,"));
        itemList.add(new PrescriptionFileItems("Dr. Golam Mostafa","12/12/2024","A,Block,House: 2,Halishohor,"));
        itemList.add(new PrescriptionFileItems("Dr. Nasir Uddin","12/12/2024","A,Block,House: 2,Halishohor,"));
        itemList.add(new PrescriptionFileItems("Dr. Mohammad Jamal Hussain","12/12/2024","A,Block,House: 2,Halishohor,"));
        itemList.add(new PrescriptionFileItems("Dr. Mohammad Muhsin","12/12/2024","A,Block,House: 2,Halishohor,"));
        itemList.add(new PrescriptionFileItems("Doctor Amjad Hossain","12/12/2024","A,Block,House: 2,Halishohor,"));
        itemList.add(new PrescriptionFileItems("Dr. Mohammad Muhsin","12/12/2024","A,Block,House: 2,Halishohor,"));
        itemList.add(new PrescriptionFileItems("Doctor Amjad Hossain","12/12/2024","A,Block,House: 2,Halishohor,"));
        itemList.add(new PrescriptionFileItems("Doctor Amjad Hossain","12/12/2024","A,Block,House: 2,Halishohor,"));
        itemList.add(new PrescriptionFileItems("Doctor Amjad Hossain","12/12/2024","A,Block,House: 2,Halishohor,"));

        PrescriptionFileAdapter adapter = new PrescriptionFileAdapter(itemList);
        recyclerView.setAdapter(adapter);

    }
}