package com.example.receptapp;

import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecepieListAdapter extends RecyclerView.Adapter {

    List<Recept> recepieList;
    public static class RecepieViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;
        public TextView textView2;
        public ImageView imageView;
        public ImageView favoriteButton;
       // public Button favoriteButton
        public RecepieViewHolder(@NonNull View itemView) {

            super(itemView);
            textView = itemView.findViewById(R.id.recepieSquareTitle);
            textView2 = itemView.findViewById(R.id.recepieSquareDesc);
            imageView = itemView.findViewById(R.id.recepieSquareImage);
            favoriteButton = itemView.findViewById(R.id.favoriteButton);
            //Button = itemView.findViewById((R.id.favoriteButton));

        }


    }

    public RecepieListAdapter(List<Recept> recepieList) {
        this.recepieList = recepieList;

    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = (View) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recepie_square, viewGroup, false);

        RecepieViewHolder recepieViewHolder = new RecepieViewHolder(view);
        return recepieViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        RecepieViewHolder vh = (RecepieViewHolder) viewHolder;
        vh.textView.setText(recepieList.get(i).getTitle());
        vh.textView2.setText(recepieList.get(i).getDescription());
        vh.imageView.setImageResource(recepieList.get(i).getImage());
        vh.favoriteButton.setImageResource(recepieList.get(i).getFavoriteImage());
        //vh.favoriteButton.setBackground(R.drawable.ic_favorite_border_black_24dp);



    }

    @Override
    public int getItemCount() {
        return recepieList.size();
    }
}
