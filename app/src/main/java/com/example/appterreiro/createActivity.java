package com.example.appterreiro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;

public class createActivity extends AppCompatActivity {

    private EditText nameEventEditText, dateEventEditText, descriptionEventEditText;
    private Button saveEventButton, viewEventsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);


        nameEventEditText = findViewById(R.id.name_event);
        dateEventEditText = findViewById(R.id.date_event);
        descriptionEventEditText = findViewById(R.id.description_event);


        saveEventButton = findViewById(R.id.save_event);
        viewEventsButton = findViewById(R.id.ver_event);


        saveEventButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aquí guardarías los datos en la base de datos o SharedPreferences
                saveEventData();
            }
        });


        viewEventsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar a ListActivity
                Intent intent = new Intent(createActivity.this, ListActivity.class);
                startActivity(intent);
            }
        });
    }

    private void saveEventData() {
        String eventName = nameEventEditText.getText().toString();
        String eventDate = dateEventEditText.getText().toString();
        String eventDescription = descriptionEventEditText.getText().toString();


        if (!eventName.isEmpty() && !eventDate.isEmpty() && !eventDescription.isEmpty()) {

        } else {

        }
    }
}
