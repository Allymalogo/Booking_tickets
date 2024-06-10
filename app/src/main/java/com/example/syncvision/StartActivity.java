package com.example.syncvision;

import android.content.Intent;
import android.os.Bundle;

import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Assuming EdgeToEdge.enable(this) is a valid function call
        // If not, remove it or replace it with the appropriate code
        // EdgeToEdge.enable(this);
        setContentView(R.layout.activity_start);

        Button button = findViewById(R.id.start_button);
        button.setOnClickListener(view -> {
            Intent intent = new Intent(StartActivity.this, SignupActivity.class);
            startActivity(intent);
        });
    }
}

