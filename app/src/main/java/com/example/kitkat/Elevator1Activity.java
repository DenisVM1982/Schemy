package com.example.kitkat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.chrisbanes.photoview.PhotoView;

public class Elevator1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elevator1);
        PhotoView photoView = (PhotoView) findViewById(R.id.elevator1);
        photoView.setImageResource(R.drawable.elevator4_);
    }
}
