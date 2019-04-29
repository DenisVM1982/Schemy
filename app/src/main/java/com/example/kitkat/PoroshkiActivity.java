package com.example.kitkat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PoroshkiActivity extends AppCompatActivity {
    ListView poroshki;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poroshki);

        poroshki= (ListView) findViewById(R.id.poroshki);

        ArrayAdapter<CharSequence> adapterPoroshki = ArrayAdapter.createFromResource(
                this, R.array.poroshki, android.R.layout.simple_list_item_1);
        poroshki.setAdapter(adapterPoroshki);

        poroshki.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if(id == 0){
                    Intent intent = new Intent(PoroshkiActivity.this, GreyfernyeKranyActivity.class);
                    startActivity(intent);}

            }
        });
    }
}
