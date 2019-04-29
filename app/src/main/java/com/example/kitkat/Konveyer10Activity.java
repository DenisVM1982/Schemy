package com.example.kitkat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.chrisbanes.photoview.PhotoView;

public class Konveyer10Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konveyer10);
        PhotoView photoView = (PhotoView) findViewById(R.id.konveyer10);
        photoView.setImageResource(R.drawable.konveyer10_);
    }
}
