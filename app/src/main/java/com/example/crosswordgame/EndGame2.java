package com.example.crosswordgame;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class EndGame2 extends AppCompatActivity {

    TextView home,playagain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_end_game);


        home = findViewById(R.id.home);
        playagain = findViewById(R.id.playagain);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EndGame2.this,MainActivity.class);
                startActivity(intent);
            }
        });

        playagain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EndGame2.this, GamePage2.class);
                startActivity(intent);
            }
        });
    }
}