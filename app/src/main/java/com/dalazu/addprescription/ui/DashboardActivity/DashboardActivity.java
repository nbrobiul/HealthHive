package com.dalazu.addprescription.ui.DashboardActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.dalazu.addprescription.ui.AddPrescription.PrescriptionFile;
import com.dalazu.addprescription.ui.LoginSignupForget.ProfileActivity;
import com.dalazu.addprescription.R;
import com.dalazu.addprescription.model.Feature;
import com.dalazu.addprescription.ui.DiseasManagmentActivity.DiseaseManagementActivity;
import com.dalazu.addprescription.ui.EducationalResouresActivity.EducationalResourcesActivity;
import com.dalazu.addprescription.ui.LoginSignupForget.Login;
import com.dalazu.addprescription.ui.MedicineReminderActivity.MedicineReminderActivity;
import com.dalazu.addprescription.ui.NutritionDietPlaningActivity.NutritionDietPlaningActivity;
import com.dalazu.addprescription.ui.VaccinationReminderActiviy.VaccinationReminderActivity;
import com.dalazu.addprescription.ui.WomensHealthActivity.WomensHealthActivity;
import com.dalazu.addprescription.utils.FeatureAdapter;
import com.dalazu.addprescription.ui.AppointmentReminderActivity.AppointmentReminderActivity;
import com.dalazu.addprescription.ui.WaterReminderActivity.WaterReminderActivity;
import com.denzcoskun.imageslider.ImageSlider;

import java.util.ArrayList;

public class DashboardActivity extends AppCompatActivity {

    ImageSlider imageSlider;
    GridView gridView;
    Button logOut;
    private RecyclerView recyclerView;
    private ArrayList<Feature> featureList;
    private FeatureAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        logOut = findViewById(R.id.log_out);

        // ==================== Toolbar Setup =================================
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // ==================== Session Check =======================================
        SharedPreferences sharedPreferences = getSharedPreferences("UserSession", MODE_PRIVATE);
        boolean isLoggedIn = sharedPreferences.getBoolean("isLoggedIn", false);

        if (!isLoggedIn) {
            startActivity(new Intent(DashboardActivity.this, Login.class));
            finish(); // Close the current activity
        }

        // ==================== Logout Confirmation Alert Dialog =================
        logOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View customDialogView = getLayoutInflater().inflate(R.layout.card_alert_dialog, null);

                AlertDialog.Builder builder = new AlertDialog.Builder(DashboardActivity.this);
                builder.setView(customDialogView);
                builder.setCancelable(false);

                AlertDialog alertDialog = builder.create();

                Button btnYes = customDialogView.findViewById(R.id.btn_yes);
                Button btnNo = customDialogView.findViewById(R.id.btn_no);

                btnYes.setOnClickListener(v -> {
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putBoolean("isLoggedIn", false);
                    editor.apply();

                    Toast.makeText(DashboardActivity.this, "Logged out successfully", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(DashboardActivity.this, Login.class));
                    finish();
                });

                btnNo.setOnClickListener(v -> alertDialog.dismiss());
                alertDialog.show();
            }
        });

        // ==================== Feature List Setup ===============================
        recyclerView = findViewById(R.id.recyclerview);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3, RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(gridLayoutManager);

        featureList = new ArrayList<>();
        featureList.add(new Feature(R.drawable.appointment_icon, "Water\nReminder"));
        featureList.add(new Feature(R.drawable.add_icon, "Appointment\nReminder"));
        featureList.add(new Feature(R.drawable.appointment_icon, "Medicine\nReminder"));
        featureList.add(new Feature(R.drawable.appointment_icon, "Prescription\nFile"));
        featureList.add(new Feature(R.drawable.appointment_icon, "Vaccination\nReminder"));
        featureList.add(new Feature(R.drawable.appointment_icon, "Disease\nManagement"));
        featureList.add(new Feature(R.drawable.appointment_icon, "Nutrition @ Diet\nPlanning"));
        featureList.add(new Feature(R.drawable.appointment_icon, "Women's\nHealth"));
        featureList.add(new Feature(R.drawable.appointment_icon, "Educational\nResources"));

        adapter = new FeatureAdapter(featureList, new FeatureAdapter.OnFeatureClickListener() {
            @Override
            public void OnFeatureItemClick(int position, Feature feature) {
                Intent intent = null;
                switch (position) {
                    case 0:
                        intent = new Intent(DashboardActivity.this, WaterReminderActivity.class);
                        break;
                    case 1:
                        intent = new Intent(DashboardActivity.this, AppointmentReminderActivity.class);
                        break;
                    case 2:
                        intent = new Intent(DashboardActivity.this, MedicineReminderActivity.class);
                        break;
                    case 3:
                        intent = new Intent(DashboardActivity.this, PrescriptionFile.class);
                        break;
                    case 4:
                        intent = new Intent(DashboardActivity.this, VaccinationReminderActivity.class);
                        break;
                    case 5:
                        intent = new Intent(DashboardActivity.this, DiseaseManagementActivity.class);
                        break;
                    case 6:
                        intent = new Intent(DashboardActivity.this, NutritionDietPlaningActivity.class);
                        break;
                    case 7:
                        intent = new Intent(DashboardActivity.this, WomensHealthActivity.class);
                        break;
                    case 8:
                        intent = new Intent(DashboardActivity.this, EducationalResourcesActivity.class);
                        break;
                }
                if (intent != null) {
                    startActivity(intent);
                }
            }
        });

        recyclerView.setAdapter(adapter);
    }

    // ==================== Toolbar Menu ==========================================

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.menu_icon) {
            // Navigate to another activity
            Intent intent = new Intent(this, ProfileActivity.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }



    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Exit Confirmation");
        builder.setMessage("Are you sure you want to exit the app?");
        builder.setCancelable(false);

        builder.setPositiveButton("Yes", (dialog, which) -> {
            Toast.makeText(this, "Exiting app...", Toast.LENGTH_SHORT).show();
            finish();
        });

        builder.setNegativeButton("No", (dialog, which) -> dialog.dismiss());

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}
