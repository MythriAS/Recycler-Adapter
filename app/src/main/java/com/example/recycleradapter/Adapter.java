package com.example.recycleradapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    Model[] models;
    public Adapter(Model[] models) {
        this.models = models;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.second_activity, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        Model model=models[position];
        holder.img.setImageResource(model.getImage());
        holder.describtion.setText(model.getDescribtion());
    }

    @Override
    public int getItemCount() {
        return models.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView describtion;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.img);
            describtion=itemView.findViewById(R.id.describtion);
        }
    }
}
