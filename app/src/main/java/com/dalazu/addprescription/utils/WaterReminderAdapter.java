package com.dalazu.addprescription.utils;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dalazu.addprescription.R;
import com.dalazu.addprescription.model.WaterReminderItems;

import java.util.List;

public class WaterReminderAdapter extends RecyclerView.Adapter<WaterReminderAdapter.MyViewHolder> {

    private final List<WaterReminderItems> itemList;

    public WaterReminderAdapter(List<WaterReminderItems> itemList) {
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public WaterReminderAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.water_reminder_items, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WaterReminderAdapter.MyViewHolder holder, int position) {

        WaterReminderItems item = itemList.get(position);
        holder.tvNextReminder.setText(item.getNextReminder());
        holder.tvDate.setText(item.getDate());

    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tvNextReminder, tvDate;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tvNextReminder = itemView.findViewById(R.id.tv_next_reminder);
            tvDate = itemView.findViewById(R.id.tv_date);

        }
    }
}
