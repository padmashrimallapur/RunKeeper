package com.example.raceroster.achievements;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;

import com.example.raceroster.R;
import com.example.raceroster.model.Achievements;

import java.util.List;
/**
Custom adapter helps to inflate the layout and assign data to each row of Recycler view.
Helper class to display the personal and virtual race records of the user.
 */
public class CustomAdapter extends Adapter {

    List<Achievements> achievementsList;

    public CustomAdapter(List<Achievements> achievementsList) {
        this.achievementsList = achievementsList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        TextView trophyName = holder.itemView.findViewById(R.id.trophyName);
        trophyName.setText(achievementsList.get(position).getTrophyName());
        TextView data = holder.itemView.findViewById(R.id.data);
        data.setText(achievementsList.get(position).getRunTime());
        ImageView imageView = holder.itemView.findViewById(R.id.trophyImage);
        imageView.setImageResource(achievementsList.get(position).getImageId());
    }

    @Override
    public int getItemCount() {
        return achievementsList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView achievementName;
        TextView data;
        ImageView medalImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            achievementName = itemView.findViewById(R.id.trophyName);
            data = itemView.findViewById(R.id.data);
            medalImage = itemView.findViewById(R.id.trophyImage);
        }
    }
}
