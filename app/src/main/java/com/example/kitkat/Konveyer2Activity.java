package com.example.kitkat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.chrisbanes.photoview.PhotoView;

public class Konveyer2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konveyer2);
        PhotoView photoView = (PhotoView) findViewById(R.id.konveyer2);
        photoView.setImageResource(R.drawable.konveyer2_);
    }
}
