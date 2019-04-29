package com.example.kitkat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PerekachkaActivity extends AppCompatActivity {

    ListView perekachka;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perekachka);

        perekachka = (ListView) findViewById(R.id.perekachka);

        ArrayAdapter<CharSequence> perekachkaadapter = ArrayAdapter.createFromResource(
                this, R.array.perekachka, android.R.layout.simple_list_item_1);
        perekachka.setAdapter(perekachkaadapter);

        perekachka.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if(id == 0){
                    Intent intent = new Intent(PerekachkaActivity.this, ZapuskPerekachkiActivity.class);
                    startActivity(intent);}
                if(id == 1){
                    Intent intent = new Intent(PerekachkaActivity.this, Konveyer1Activity.class);
                    startActivity(intent);}
                if(id == 2){
                    Intent intent = new Intent(PerekachkaActivity.this, Konveyer2Activity.class);
                    startActivity(intent);}
                if(id == 3){
                    Intent intent = new Intent(PerekachkaActivity.this, Konveyer4Activity.class);
                    startActivity(intent);}

                if(id == 4){
                    Intent intent = new Intent(PerekachkaActivity.this, Elevator1Activity.class);
                    startActivity(intent);}
                if(id == 5){
                    Intent intent = new Intent(PerekachkaActivity.this, Konveyer5Activity.class);
                    startActivity(intent);}
                if(id == 6){
                    Intent intent = new Intent(PerekachkaActivity.this, Konveyer10Activity.class);
                    startActivity(intent);}


            }
        });
    }
}
