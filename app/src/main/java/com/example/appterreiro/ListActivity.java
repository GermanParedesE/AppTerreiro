package com.example.appterreiro;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    private ListView eventsListView;
    private ArrayAdapter<String> eventsAdapter;
    private ArrayList<String> eventsList = new ArrayList<>();
    private Button returnButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        eventsListView = findViewById(R.id.list_view_events);
        returnButton = findViewById(R.id.volver_menu);


        loadEventData();

        eventsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, eventsList);
        eventsListView.setAdapter(eventsAdapter);


        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent returnIntent = new Intent(ListActivity.this, menuActivity.class);

                startActivity(returnIntent);

            }
        });
    }

    private void loadEventData() {

        eventsList.add("Evento de prueba");
    }
}

