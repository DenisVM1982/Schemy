package com.example.kitkat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ObrabotkaActivity extends AppCompatActivity {

    ListView obrabotka;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obrabotka);

        obrabotka= (ListView) findViewById(R.id.menu2);

        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(
                this, R.array.obrabotka, android.R.layout.simple_list_item_1);
        obrabotka.setAdapter(adapter2);

        obrabotka.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if(id == 0){
                    Intent intent = new Intent(ObrabotkaActivity.this, PressovyActivity.class);
                    startActivity(intent);}

            }
        });
    }
}
