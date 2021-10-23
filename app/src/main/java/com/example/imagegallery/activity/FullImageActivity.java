package com.example.imagegallery.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.imagegallery.R;

public class FullImageActivity extends AppCompatActivity {
    ImageView image_preview;
    String regular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_image);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            regular = bundle.getString("regular");
        }

        image_preview = findViewById(R.id.image_preview);
        Glide.with(this).load(regular)
                .thumbnail(0.5f)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(image_preview);
    }
}