package com.example.kitkat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Kran_10_3Activity extends AppCompatActivity {

    ListView kran10_3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obrabotka);

        kran10_3= (ListView) findViewById(R.id.menu2);

        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(
                this, R.array.kran_10_3, android.R.layout.simple_list_item_1);
        kran10_3.setAdapter(adapter2);

        kran10_3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if(id == 0){
                    Intent intent = new Intent(Kran_10_3Activity.this, HodMaloyTelegiActivity.class);
                    startActivity(intent);}

            }
        });
    }
}
