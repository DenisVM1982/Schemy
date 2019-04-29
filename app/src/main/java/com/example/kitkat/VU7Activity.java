package com.example.kitkat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.chrisbanes.photoview.PhotoView;

public class VU7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vu7);

        PhotoView photoView = (PhotoView) findViewById(R.id.vu7);
        photoView.setImageResource(R.drawable.vu7_);
    }
}
