package com.example.kitkat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.chrisbanes.photoview.PhotoView;

public class GreyfernyeOperaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greyfernye_opera);


        PhotoView photoView = (PhotoView) findViewById(R.id.greyferny_pzk_opera);
        photoView.setImageResource(R.drawable.greyferny_pzk_opera);
    }
}
