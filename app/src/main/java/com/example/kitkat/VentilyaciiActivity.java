package com.example.kitkat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class VentilyaciiActivity extends AppCompatActivity {

    ListView ventilyacii;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventilyacii);
        
        ventilyacii= (ListView) findViewById(R.id.ventilyacii);

        ArrayAdapter<CharSequence> adapterventilyacii = ArrayAdapter.createFromResource(
                this, R.array.ventilyacii, android.R.layout.simple_list_item_1);
        ventilyacii.setAdapter(adapterventilyacii);

        ventilyacii.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if(id == 0){
                    Intent intent = new Intent(VentilyaciiActivity.this, VU2Activity.class);
                    startActivity(intent);}
                if(id == 1){
                    Intent intent = new Intent(VentilyaciiActivity.this, VU3Activity.class);
                    startActivity(intent);}
                if(id == 2){
                    Intent intent = new Intent(VentilyaciiActivity.this, VU7Activity.class);
                    startActivity(intent);}
                if(id == 3){
                    Intent intent = new Intent(VentilyaciiActivity.this, VU24Activity.class);
                    startActivity(intent);}
                if(id == 4){
                    Intent intent = new Intent(VentilyaciiActivity.this, VU25Activity.class);
                    startActivity(intent);}

            }
        });
    }
}
