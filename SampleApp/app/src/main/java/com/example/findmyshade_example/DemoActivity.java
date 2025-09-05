package com.example.findmyshade_example;

import com.ringoai.findmyshade.FaceCapture;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DemoActivity extends AppCompatActivity {
    private String kLicenseKey = "736BDFC8-0D70-4C44-81B2-49E5114D64FA";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.demo_activity_layout);
        Error error = FaceCapture.setLicenseKey(getApplicationContext(), kLicenseKey);

        if (error != null) {
            Toast.makeText(this, error.toString(), Toast.LENGTH_SHORT).show();
            return;
        }

        Button launchButton = findViewById(R.id.run_sdk);
        launchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchSDK();
            }
        });
    }

    protected void launchSDK() {
        FaceCapture.FindMyShade(this);
    }
}
