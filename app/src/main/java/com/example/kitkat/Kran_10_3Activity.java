package com.example.kitkat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class KranActivity extends AppCompatActivity {


    ListView kran;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kran);

        kran= (ListView) findViewById(R.id.kran);

        ArrayAdapter<CharSequence> kranAdapter = ArrayAdapter.createFromResource(
                this, R.array.kran, android.R.layout.simple_list_item_1);
        kran.setAdapter(kranAdapter);

        kran.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if(id == 0){
                    Intent intent = new Intent(KranActivity.this, HodMaloyTelegiActivity.class);
                    startActivity(intent);}

            }
        });
    }
}