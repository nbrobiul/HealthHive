package com.dalazu.addprescription.utils;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dalazu.addprescription.R;
import com.dalazu.addprescription.model.AppointmentReminderItem;

import java.util.List;

public class AppointmentReminderAdapter extends RecyclerView.Adapter<AppointmentReminderAdapter.MyViewHolder>{

    private final List<AppointmentReminderItem> itemList;

    public AppointmentReminderAdapter(List<AppointmentReminderItem> itemList) {
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public AppointmentReminderAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.appointment_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AppointmentReminderAdapter.MyViewHolder holder, int position) {

        AppointmentReminderItem item = itemList.get(position);
        holder.name.setText(item.getName());
        holder.date.setText(item.getDate());
        holder.time.setText(item.getTime());
        holder.serialNumber.setText(item.getSerialNumber());
        holder.visit.setText(item.getVisit());
        holder.number.setText(item.getNumber());
        holder.chamber.setText(item.getChamber());


    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView name, date, time, serialNumber, visit, number, chamber;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.tv_doctor_name);
            date = itemView.findViewById(R.id.tv_nextap_date);
            time = itemView.findViewById(R.id.tv_appointment_time);
            serialNumber = itemView.findViewById(R.id.tv_apserial_number);
            visit = itemView.findViewById(R.id.tv_total_visit);
            number = itemView.findViewById(R.id.tv_contact_no);
            chamber = itemView.findViewById(R.id.tv_apchamber);

        }
    }
}
