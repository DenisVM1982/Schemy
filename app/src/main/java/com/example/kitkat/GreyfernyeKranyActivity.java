package com.example.kitkat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class GreyfernyeKranyActivity extends AppCompatActivity {

    ListView greyfernyeKrany;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greyfernye_krany);

        greyfernyeKrany= (ListView) findViewById(R.id.greyfernyeKrany);

        ArrayAdapter<CharSequence> adaptergreyfernyeKrany = ArrayAdapter.createFromResource(
                this, R.array.greyfernyeKrany, android.R.layout.simple_list_item_1);
        greyfernyeKrany.setAdapter(adaptergreyfernyeKrany);

        greyfernyeKrany.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if(id == 0){
                    Intent intent = new Intent(GreyfernyeKranyActivity.this, GreyfernyeOperaActivity.class);
                    startActivity(intent);}
                if(id == 1){
                    Intent intent = new Intent(GreyfernyeKranyActivity.this, GreyfernySilaActivity.class);
                    startActivity(intent);}
                if(id == 2){
                    Intent intent = new Intent(GreyfernyeKranyActivity.this, GreyfernyPodyomActivity.class);
                    startActivity(intent);}

            }
        });
    }
}
