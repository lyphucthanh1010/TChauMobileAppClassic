package com.example.projectnt109;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class NotificationActivity extends AppCompatActivity {
    ImageView cancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        cancel = findViewById(R.id.editrpic);
        cancel.setOnClickListener(v -> onBackPressed());
    }
}