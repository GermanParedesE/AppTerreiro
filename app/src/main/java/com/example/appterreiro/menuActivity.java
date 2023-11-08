package com.example.appterreiro;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menuActivity extends AppCompatActivity {

    private Button createButton;
    private Button viewEventsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        createButton = findViewById(R.id.create);


        viewEventsButton = findViewById(R.id.listaevento);


        createButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentCreate = new Intent(menuActivity.this, createActivity.class);
                startActivity(intentCreate);
            }
        });


        viewEventsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentList = new Intent(menuActivity.this, ListActivity.class);
                startActivity(intentList);
            }
        });
    }
}

