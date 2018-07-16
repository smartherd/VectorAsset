package com.annapurna.smartherd.vectorassets;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import static android.graphics.Color.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.iv2);
        imageView.setImageResource(R.drawable.ic_idea);
    }
}
