package com.example.jsonrecycler2;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class twodeatailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twodeatail);
        Intent intent = getIntent();
        String imageUrl = intent.getStringExtra("image");
       String creatorName = intent.getStringExtra("text");
       // int likeCount = intent.getIntExtra(EXTRA_LIKES, 0);*/
        ImageView imageView = findViewById(R.id.image_view_detail);
        TextView textViewCreator = findViewById(R.id.text_view_creator_detail);
        TextView textViewLikes = findViewById(R.id.text_view_like_detail);
        Picasso.get().load(imageUrl).fit().centerInside().into(imageView);
       textViewCreator.setText(creatorName);
       // textViewLikes.setText("Likes: " + likeCount);
    }
}