package com.example.kitkat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class KonverternyActivity extends AppCompatActivity {

    ListView menu2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konverterny);

        menu2 = (ListView) findViewById(R.id.menu2);

        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(
                this, R.array.uchastkiKonverterny, android.R.layout.simple_list_item_1);
        menu2.setAdapter(adapter2);

        menu2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if(id == 0){
                    Intent intent = new Intent(KonverternyActivity.this, PressovyActivity.class);
                    startActivity(intent);}

            }
        });
    }

}
