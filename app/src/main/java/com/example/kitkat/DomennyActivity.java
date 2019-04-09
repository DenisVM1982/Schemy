package com.example.kitkat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DomennyActivity extends AppCompatActivity {

    ListView uchastki_domenny;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_domenny);

        uchastki_domenny = (ListView) findViewById(R.id.uchastki_domenny);

        ArrayAdapter<CharSequence> uchastkiDomenny = ArrayAdapter.createFromResource(
                this, R.array.uchastkiDomenny, android.R.layout.simple_list_item_1);
        uchastki_domenny.setAdapter(uchastkiDomenny);

        uchastki_domenny.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if(id == 0){
                    Intent intent = new Intent(DomennyActivity.this, ObrabotkaActivity.class);
                    startActivity(intent);}

            }
        });
    }

}
