package com.example.kitkat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PressovyActivity extends AppCompatActivity {

    ListView menu3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pressovy);

        menu3 = (ListView) findViewById(R.id.menu2);

        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(
                this, R.array.pressovy, android.R.layout.simple_list_item_1);
        menu3.setAdapter(adapter3);

        menu3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if(id == 0){
                    Intent intent = new Intent(PressovyActivity.this, PictureActivity.class);
                    startActivity(intent);}

            }
        });
    }

}
