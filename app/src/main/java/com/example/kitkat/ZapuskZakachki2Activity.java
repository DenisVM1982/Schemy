package com.example.kitkat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.chrisbanes.photoview.PhotoView;

public class ZapuskZakachki2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zapusk_zakachki2);
        PhotoView photoView = (PhotoView) findViewById(R.id.zapusk_zakachki2);
        photoView.setImageResource(R.drawable.zapusk_zakachki2_);
    }
}
