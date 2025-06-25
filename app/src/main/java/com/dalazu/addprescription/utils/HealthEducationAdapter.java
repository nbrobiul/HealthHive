package com.dalazu.addprescription.utils;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dalazu.addprescription.model.HealthEducation;
import com.dalazu.addprescription.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class HealthEducationAdapter extends RecyclerView.Adapter<HealthEducationAdapter.HealthEducationViewHolder> {

    private List<HealthEducation> healthEducationList;
    private OnHealthEducationClickListener listener;

    public HealthEducationAdapter(List<HealthEducation> healthEducationList, OnHealthEducationClickListener listener) {
        this.healthEducationList = healthEducationList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public HealthEducationAdapter.HealthEducationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_health_education,parent,false);
        return new HealthEducationViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HealthEducationAdapter.HealthEducationViewHolder holder, int position) {
        HealthEducation healthEducation = healthEducationList.get(position);
        holder.bind(healthEducation);
    }

    @Override
    public int getItemCount() {
        return healthEducationList.size();
    }

    public class HealthEducationViewHolder extends RecyclerView.ViewHolder {

        private ImageView coverImage;


        public HealthEducationViewHolder(@NonNull View itemView) {
            super(itemView);

            coverImage = itemView.findViewById(R.id.cover_image);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.OnItemClick(healthEducationList.get(getAdapterPosition()));
                }
            });
        }

        public void bind(HealthEducation healthEducation) {
            Picasso.get().load(healthEducation.getImgUrl()).into(coverImage);
        }
    }


    public interface OnHealthEducationClickListener {
        void OnItemClick(HealthEducation healthEducation);
    }
}
