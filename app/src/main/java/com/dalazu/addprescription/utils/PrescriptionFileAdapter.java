package com.dalazu.addprescription.utils;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dalazu.addprescription.R;
import com.dalazu.addprescription.ui.AddPrescription.PrescriptionFileItems;

import java.util.List;

public class PrescriptionFileAdapter extends  RecyclerView.Adapter<PrescriptionFileAdapter.MyViewHolder>{

    private final List<PrescriptionFileItems> itemList;

    public PrescriptionFileAdapter(List<PrescriptionFileItems> itemList) {
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public PrescriptionFileAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.prescription_items, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PrescriptionFileAdapter.MyViewHolder holder, int position) {

        PrescriptionFileItems item = itemList.get(position);
        holder.tvName.setText(item.getName());
        holder.tvDate.setText(item.getDate());
        holder.tvAddress.setText(item.getAddress());

    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tvName, tvDate, tvAddress;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tvName = itemView.findViewById(R.id.doctor_name);
            tvDate = itemView.findViewById(R.id.appointment_date);
            tvAddress = itemView.findViewById(R.id.doctor_address);

        }
    }
}
