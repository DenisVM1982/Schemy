package com.example.kitkat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.chrisbanes.photoview.PhotoView;

public class Konveyer4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konveyer4);
        PhotoView photoView = (PhotoView) findViewById(R.id.konveyer4);
        photoView.setImageResource(R.drawable.konveyer4_);
    }
}
