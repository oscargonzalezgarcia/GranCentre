package com.example.grancentre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btnNgci);
        btn.setOnClickListener(this);

        btn = findViewById(R.id.btnRest);
        btn.setOnClickListener(this);

        btn = findViewById(R.id.btnPrkng);
        btn.setOnClickListener(this);

        btn = findViewById(R.id.btnMvis);
        btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.btnNgci)
        {
            Intent intent = new Intent(this,Activity_Business.class);
        }
        else if(v.getId()==R.id.btnRest)
        {
            Intent intent = new Intent(this,Activity_Restaurant.class);
        }
        else if(v.getId()==R.id.btnPrkng)
        {
            Intent intent = new Intent(this,Activity_Parkings.class);
        }
        else if(v.getId()==R.id.btnMvis)
        {
            Intent intent = new Intent(this,Activity_Movies.class);
        }

    }
}