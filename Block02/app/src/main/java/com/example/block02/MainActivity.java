package com.example.block02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listViewAnimal = (ListView) findViewById(R.id.listView);
        //Display the list view
        final ArrayAdapter <CharSequence> adapterAnimals = ArrayAdapter.createFromResource(this,
                R.array.animalArray,
                android.R.layout.simple_list_item_1);
        listViewAnimal.setAdapter(adapterAnimals);

        //Set up the action to be happen when clicking the button
        listViewAnimal.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String message = getString(R.string.toastMessage) + " " + adapterAnimals.getItem(position) ;
                // Display a popup message for a short time period
                Toast.makeText(getApplicationContext(),
                        message,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
