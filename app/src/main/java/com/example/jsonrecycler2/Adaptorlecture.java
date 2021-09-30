package com.example.jsonrecycler2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class Adaptorlecture extends RecyclerView.Adapter<viewholderlecture> {
    ArrayList<modulelecture>list;
    Context context;

    public Adaptorlecture(ArrayList<modulelecture> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewholderlecture onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.lecture, parent, false);
        return new viewholderlecture(v);}


    @Override
    public void onBindViewHolder(@NonNull viewholderlecture holder, int position) {
     modulelecture current = list.get(position);
        String imageUrl = current.getUrl();
        Picasso.get().load(imageUrl).fit().centerInside().into(holder.imageurl);
        holder.imageurl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(context,youtubeActivity.class);
                intent.putExtra("youtube",current.getYoutube());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
