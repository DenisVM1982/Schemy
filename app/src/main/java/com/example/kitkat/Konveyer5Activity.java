package com.example.kitkat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.chrisbanes.photoview.PhotoView;

public class Konveyer5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konveyer5);
        PhotoView photoView = (PhotoView) findViewById(R.id.konveyer5);
        photoView.setImageResource(R.drawable.konveyer5_);
    }
}
