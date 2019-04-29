package com.example.kitkat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.chrisbanes.photoview.PhotoView;

public class GreyfernySilaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greyferny_sila);


        PhotoView photoView = (PhotoView) findViewById(R.id.greyferny_pzk_sila);
        photoView.setImageResource(R.drawable.greyferny_pzk_sila);
    }
}
