package com.example.kitkat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.chrisbanes.photoview.PhotoView;

public class HodMaloyTelegiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hod_maloy_telegi);

        PhotoView photoView = (PhotoView) findViewById(R.id.hod_maloy_telegi);
        photoView.setImageResource(R.drawable.hod_maloy_telegi);
    }
}
