package com.example.kitkat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.chrisbanes.photoview.PhotoView;

public class MalyPodyomActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maly_podyom);

        PhotoView photoView = (PhotoView) findViewById(R.id.maly_podyom);
        photoView.setImageResource(R.drawable.maly_podyom);
    }
}
