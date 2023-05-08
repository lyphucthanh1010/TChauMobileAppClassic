package com.example.projectnt109;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class PostActivity extends AppCompatActivity {
    ImageView cancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);
        cancel = findViewById(R.id.editrpic);
        cancel.setOnClickListener(v -> onBackPressed());
    }
}