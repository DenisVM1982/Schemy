package com.example.kitkat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.chrisbanes.photoview.PhotoView;

public class HodMostaActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hod_mosta);

        PhotoView photoView = (PhotoView) findViewById(R.id.hod_mosta);
        photoView.setImageResource(R.drawable.hod_mosta);
    }
}
