package com.example.kitkat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.chrisbanes.photoview.PhotoView;

public class HodBolshoyTelegiActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hod_bolshoy_telegi);

        PhotoView photoView = (PhotoView) findViewById(R.id.hod_bolshoy_telegi);
        photoView.setImageResource(R.drawable.hod_bolshoy_telegi);
    }
}
