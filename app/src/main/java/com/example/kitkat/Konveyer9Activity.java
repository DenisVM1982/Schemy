package com.example.kitkat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.chrisbanes.photoview.PhotoView;

public class Konveyer9Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konveyer9);
        PhotoView photoView = (PhotoView) findViewById(R.id.konveyer9);
        photoView.setImageResource(R.drawable.konveyer9_);
    }
}
