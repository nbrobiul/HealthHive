package com.dalazu.addprescription.utils;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dalazu.addprescription.R;
import com.dalazu.addprescription.model.MyItem;

import java.util.List;

public class MedicineReminderAdapter extends RecyclerView.Adapter<MedicineReminderAdapter.MyViewHolder>{

    private final List<MyItem> itemList;

    public MedicineReminderAdapter(List<MyItem> itemList) {
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public MedicineReminderAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.medicine_reminder_items, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MedicineReminderAdapter.MyViewHolder holder, int position) {

        MyItem item = itemList.get(position);
        holder.titleText.setText(item.getTitle_text());
        holder.duration.setText(item.getDuration_text());
        holder.frequencyText.setText(item.getFrequency_text());
        holder.startDate.setText(item.getStart_date());
        holder.endDate.setText(item.getEnd_date());
        holder.notesText.setText(item.getNotes_text());

    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView titleText, duration, frequencyText, startDate, endDate, notesText;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            titleText = itemView.findViewById(R.id.title_text);
            duration = itemView.findViewById(R.id.duration_text);
            frequencyText = itemView.findViewById(R.id.frequency_text);
            startDate = itemView.findViewById(R.id.start_date);
            endDate = itemView.findViewById(R.id.end_date);
            notesText = itemView.findViewById(R.id.notes_text);

        }
    }
}
