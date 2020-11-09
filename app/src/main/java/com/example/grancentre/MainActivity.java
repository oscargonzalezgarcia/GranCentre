package com.example.grancentre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

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
        Intent intent;

        if(v.getId()==R.id.btnNgci)
        {
            intent = new Intent(this,Activity_Business.class);
            startActivity(intent);
        }
        else if(v.getId()==R.id.btnRest)
        {
            intent = new Intent(this,Activity_Restaurant.class);
            startActivity(intent);
        }
        else if(v.getId()==R.id.btnPrkng)
        {
            intent = new Intent(this,Activity_Parkings.class);
            startActivity(intent);
        }
        else if(v.getId()==R.id.btnMvis)
        {
            intent = new Intent(this,Activity_Movies.class);
            startActivity(intent);
        }


    }
}