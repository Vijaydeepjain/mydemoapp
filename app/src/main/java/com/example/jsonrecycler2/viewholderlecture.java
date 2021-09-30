package com.example.jsonrecycler2;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class viewholderlecture extends RecyclerView.ViewHolder {
public ImageView imageurl;
    public viewholderlecture(@NonNull View itemView) {
        super(itemView);
        imageurl=itemView.findViewById(R.id.imageViewlecture);

    }
}
