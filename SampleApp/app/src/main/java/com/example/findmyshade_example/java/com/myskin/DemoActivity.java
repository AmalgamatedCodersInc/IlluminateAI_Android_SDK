package com.example.findmyshade_example;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DemoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.demo_activity_layout);

        Button launchButton = findViewById(R.id.run_sdk);
        launchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchSDK();
            }
        });
    }

    protected void launchSDK() {
        Intent intent = new Intent("com.ringoai.findmyshade.SDKActivity");
        startActivity(intent);
    }
}
