package com.example.kitkat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class KonverternyActivity extends AppCompatActivity {

    ListView konverterny;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konverterny);

        konverterny = (ListView) findViewById(R.id.konverterny);

        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(
                this, R.array.uchastkiKonverterny, android.R.layout.simple_list_item_1);
        konverterny.setAdapter(adapter2);

        konverterny.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if(id == 0){
                    Intent intent = new Intent(KonverternyActivity.this, PressovyActivity.class);
                    startActivity(intent);}
                if(id == 1){
                    Intent intent = new Intent(KonverternyActivity.this, PoroshkiActivity.class);
                    startActivity(intent);}

            }
        });
    }

}
