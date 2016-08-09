package com.example.aswinipasham.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] countries  = new String[]{
            "Australia",
            "Brazil",
            "India",
            "USA",
            "SriLanka",
            "Africa",
            "UK",
            "Switerzland",
            "Germany",
            "France",
            "China",
            "Portugal"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lvCountries = (ListView)findViewById(R.id.lvCountries);

        ArrayAdapter adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,
                countries);

        lvCountries.setAdapter(adapter);

        lvCountries.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Position: " + position +", " +
                        "Item: " + countries[position],Toast.LENGTH_SHORT).show();
            }
        });








    }
}
