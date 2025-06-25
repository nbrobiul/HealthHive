package com.dalazu.addprescription.utils;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dalazu.addprescription.model.Feature;
import com.dalazu.addprescription.R;

import java.util.List;

public class FeatureAdapter extends RecyclerView.Adapter<FeatureAdapter.FeatureViewHolder> {

    private List<Feature> featureList;
    private OnFeatureClickListener listener;


    public FeatureAdapter(List<Feature> featureList, OnFeatureClickListener listener) {
        this.featureList = featureList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public FeatureViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_grid, parent, false);
        return new FeatureViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FeatureViewHolder holder, int position) {
        Feature feature = featureList.get(position);

        holder.bind(feature);
    }

    @Override
    public int getItemCount() {
        return featureList.size();
    }

    public class FeatureViewHolder extends RecyclerView.ViewHolder {

        private ImageView icon;
        private TextView title;

        public FeatureViewHolder(@NonNull View itemView) {
            super(itemView);

            icon = itemView.findViewById(R.id.grid_image);
            title = itemView.findViewById(R.id.title);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.OnFeatureItemClick(getAdapterPosition(), featureList.get(getAdapterPosition()));
                }
            });

        }

        public void bind(Feature feature) {
            icon.setImageResource(feature.getIcon());
            title.setText(feature.getTitle());
        }
    }

    public interface OnFeatureClickListener {

        void OnFeatureItemClick(int position, Feature feature);

    }
}
