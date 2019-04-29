package com.example.kitkat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ZakachkaActivity extends AppCompatActivity {

    ListView zakachka;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zakachka);

        zakachka = (ListView) findViewById(R.id.zakachka);

        ArrayAdapter<CharSequence> zakachkaadapter = ArrayAdapter.createFromResource(
                this, R.array.zakachka, android.R.layout.simple_list_item_1);
        zakachka.setAdapter(zakachkaadapter);

        zakachka.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if(id == 0){
                    Intent intent = new Intent(ZakachkaActivity.this, ZapuskZakachki1Activity.class);
                    startActivity(intent);}
                if(id == 1){
                    Intent intent = new Intent(ZakachkaActivity.this, ZapuskZakachki2Activity.class);
                    startActivity(intent);}
                if(id == 2){
                    Intent intent = new Intent(ZakachkaActivity.this, ZapuskZakachki3Activity.class);
                    startActivity(intent);}
                if(id == 3){
                    Intent intent = new Intent(ZakachkaActivity.this, ZapuskZakachki4Activity.class);
                    startActivity(intent);}


            }
        });
    }
}
