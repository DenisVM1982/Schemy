package com.example.kitkat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PressovyActivity extends AppCompatActivity {

    ListView pressovy;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pressovy);

        pressovy= (ListView) findViewById(R.id.pressovy);

        ArrayAdapter<CharSequence> adapterPressovy = ArrayAdapter.createFromResource(
                this, R.array.pressovy, android.R.layout.simple_list_item_1);
        pressovy.setAdapter(adapterPressovy);

        pressovy.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if(id == 0){
                    Intent intent = new Intent(PressovyActivity.this, PictureActivity.class);
                    startActivity(intent);}
                if(id == 3){
                    Intent intent = new Intent(PressovyActivity.this, PerekachkaActivity.class);
                    startActivity(intent);}
                if(id == 4){
                    Intent intent = new Intent(PressovyActivity.this, VentilyaciiActivity.class);
                    startActivity(intent);}

            }
        });
    }

}
