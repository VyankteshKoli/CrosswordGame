package com.example.crosswordgame;

import static androidx.core.content.ContentProviderCompat.requireContext;
import static java.security.AccessController.getContext;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class GamePage1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.game_page1);

        EditText ed1, ed2, ed3, ed4, ed5, ed6, ed7, ed8, ed9, ed10, ed11, ed12, ed13, ed14, ed15, ed16, ed17, ed18, ed19, ed20,
                ed21, ed22, ed23, ed24, ed25, ed26, ed27, ed28, ed29, ed30, ed31, ed32, ed33, ed34, ed35, ed36, ed37;

        TextView images, submitGame;

        Drawable greenDrawable = ContextCompat.getDrawable(GamePage1.this, R.drawable.border_with_green_bg);


        int count =0;

        ed1 = findViewById(R.id.ed1);
        ed2 = findViewById(R.id.ed2);
        ed3 = findViewById(R.id.ed3);
        ed4 = findViewById(R.id.ed4);
        ed5 = findViewById(R.id.ed5);
        ed6 = findViewById(R.id.ed6);
        ed7 = findViewById(R.id.ed7);
        ed8 = findViewById(R.id.ed8);
        ed9 = findViewById(R.id.ed9);
        ed10 = findViewById(R.id.ed10);
        ed11 = findViewById(R.id.ed11);
        ed12 = findViewById(R.id.ed12);
        ed13 = findViewById(R.id.ed13);
        ed14 = findViewById(R.id.ed14);
        ed15 = findViewById(R.id.ed15);
        ed16 = findViewById(R.id.ed16);
        ed17 = findViewById(R.id.ed17);
        ed18 = findViewById(R.id.ed18);
        ed19 = findViewById(R.id.ed19);
        ed20 = findViewById(R.id.ed20);
        ed21 = findViewById(R.id.ed21);
        ed22 = findViewById(R.id.ed22);
        ed23 = findViewById(R.id.ed23);
        ed24 = findViewById(R.id.ed24);
        ed25 = findViewById(R.id.ed25);
        ed26 = findViewById(R.id.ed26);
        ed27 = findViewById(R.id.ed27);
        ed28 = findViewById(R.id.ed28);
        ed29 = findViewById(R.id.ed29);
   //     ed30 = findViewById(R.id.ed30);
        ed31 = findViewById(R.id.ed31);
        ed32 = findViewById(R.id.ed32);
        ed33 = findViewById(R.id.ed33);
        ed34 = findViewById(R.id.ed34);
        ed35 = findViewById(R.id.ed35);
        ed36 = findViewById(R.id.ed36);
        ed37 = findViewById(R.id.ed37);

        images = findViewById(R.id.images);
        images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open the fragment
                YourFragment fragment = new YourFragment();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, fragment)
                        .addToBackStack(null)
                        .commit();
            }
        });

        submitGame = findViewById(R.id.submitGame);

        submitGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text1 = ed1.getText().toString().trim();
                String text2 = ed2.getText().toString().trim();
                String text3 = ed3.getText().toString().trim();
                String text4 = ed4.getText().toString().trim();
                String text5 = ed5.getText().toString().trim();
                String text6 = ed6.getText().toString().trim();
                String text7 = ed7.getText().toString().trim();
                String text8 = ed8.getText().toString().trim();
                String text9 = ed9.getText().toString().trim();
                String text10 = ed10.getText().toString().trim();
                String text11 = ed11.getText().toString().trim();
                String text12 = ed12.getText().toString().trim();
                String text13 = ed13.getText().toString().trim();
                String text14 = ed14.getText().toString().trim();
                String text15 = ed15.getText().toString().trim();
                String text16 = ed16.getText().toString().trim();
                String text17 = ed17.getText().toString().trim();
                String text18 = ed18.getText().toString().trim();
                String text19 = ed19.getText().toString().trim();
                String text20 = ed20.getText().toString().trim();
                String text21 = ed21.getText().toString().trim();
                String text22 = ed22.getText().toString().trim();
                String text23 = ed23.getText().toString().trim();
                String text24 = ed24.getText().toString().trim();
                String text25 = ed25.getText().toString().trim();
                String text26 = ed26.getText().toString().trim();
                String text27 = ed27.getText().toString().trim();
                String text28 = ed28.getText().toString().trim();
                String text29 = ed29.getText().toString().trim();
      //          String text30 = ed30.getText().toString().trim();
                String text31 = ed31.getText().toString().trim();
                String text32 = ed32.getText().toString().trim();
                String text33 = ed33.getText().toString().trim();
                String text34 = ed34.getText().toString().trim();
                String text35 = ed35.getText().toString().trim();
                String text36 = ed36.getText().toString().trim();
                String text37 = ed37.getText().toString().trim();

                boolean allAreGreen = false;
                boolean allGreen = text1.equals("F") && text2.equals("C") && text3.equals("A") &&
                        text4.equals("T") && text5.equals("M") && text6.equals("I") &&
                        text7.equals("R") && text8.equals("A") && text9.equals("R") &&
                        text10.equals("I") && text11.equals("A") && text12.equals("G") &&
                        text13.equals("E") && text14.equals("M") && text15.equals("L") &&
                        text16.equals("I") && text17.equals("W") && text18.equals("S") &&
                        text19.equals("I") && text20.equals("C") && text21.equals("H") &&
                        text22.equals("O") && text23.equals("C") && text24.equals("O") &&
                        text25.equals("L") && text26.equals("A") && text27.equals("T") &&
                        text28.equals("E") && text29.equals("R") && text31.equals("N") &&
                        text32.equals("N") && text33.equals("C") && text34.equals("A") &&
                        text35.equals("K") && text36.equals("E") && text37.equals("S");

                if (allGreen) {
                    Intent intent = new Intent(GamePage1.this, EndGame.class);
                    startActivity(intent);
                } else {

                    Toast.makeText(GamePage1.this, "Please fill all fields correctly", Toast.LENGTH_SHORT).show();
                }

//               use all Codition's

                if (text1.isEmpty()) {
                    ed1.setBackgroundColor(Color.WHITE);
                    ed1.setBackgroundResource(R.drawable.border_with_white_bg);
                } else {
                    if (text1.equals("F")) {
                        ed1.setBackgroundColor(Color.GREEN);
                        ed1.setBackgroundResource(R.drawable.border_with_green_bg);
                    } else {
                        ed1.setBackgroundColor(Color.WHITE);
                        ed1.setBackgroundResource(R.drawable.border_with_white_bg);
                        ed1.getText().clear();
                    }
                }

                if (text2.isEmpty()) {
                    ed2.setBackgroundColor(Color.WHITE);
                    ed2.setBackgroundResource(R.drawable.border_with_white_bg);
                } else {
                    if (text2.equals("C")) {
                        ed2.setBackgroundColor(Color.GREEN);
                        ed2.setBackgroundResource(R.drawable.border_with_green_bg);
                    } else {
                        ed2.setBackgroundColor(Color.WHITE);
                        ed2.setBackgroundResource(R.drawable.border_with_white_bg);
                        ed2.getText().clear();
                    }
                }

                if (text3.isEmpty()) {
                    ed3.setBackgroundColor(Color.WHITE);
                    ed3.setBackgroundResource(R.drawable.border_with_white_bg);
                } else {
                    if (text3.equals("A")) {
                        ed3.setBackgroundColor(Color.GREEN);
                        ed3.setBackgroundResource(R.drawable.border_with_green_bg);
                    } else {
                        ed3.setBackgroundColor(Color.WHITE);
                        ed3.setBackgroundResource(R.drawable.border_with_white_bg);
                        ed3.getText().clear();
                    }
                }

                if (text4.isEmpty()) {
                    ed4.setBackgroundColor(Color.WHITE);
                    ed4.setBackgroundResource(R.drawable.border_with_white_bg);
                } else {
                    if (text4.equals("T")) {
                        ed4.setBackgroundColor(Color.GREEN);
                        ed4.setBackgroundResource(R.drawable.border_with_green_bg);
                    } else {
                        ed4.setBackgroundColor(Color.WHITE);
                        ed4.setBackgroundResource(R.drawable.border_with_white_bg);
                        ed4.getText().clear();
                    }
                }

                if (text5.isEmpty()) {
                    ed5.setBackgroundColor(Color.WHITE);
                    ed5.setBackgroundResource(R.drawable.border_with_white_bg);
                } else {
                    if (text5.equals("M")) {
                        ed5.setBackgroundColor(Color.GREEN);
                        ed5.setBackgroundResource(R.drawable.border_with_green_bg);
                    } else {
                        ed5.setBackgroundColor(Color.WHITE);
                        ed5.setBackgroundResource(R.drawable.border_with_white_bg);
                        ed5.getText().clear();
                    }
                }

                if (text6.isEmpty()) {
                    ed6.setBackgroundColor(Color.WHITE);
                    ed6.setBackgroundResource(R.drawable.border_with_white_bg);
                } else {
                    if (text6.equals("I")) {
                        ed6.setBackgroundColor(Color.GREEN);
                        ed6.setBackgroundResource(R.drawable.border_with_green_bg);
                    } else {
                        ed6.setBackgroundColor(Color.WHITE);
                        ed6.setBackgroundResource(R.drawable.border_with_white_bg);
                        ed6.getText().clear();
                    }
                }

                if (text7.isEmpty()) {
                    ed7.setBackgroundColor(Color.WHITE);
                    ed7.setBackgroundResource(R.drawable.border_with_white_bg);
                } else {
                    if (text7.equals("R")) {
                        ed7.setBackgroundColor(Color.GREEN);
                        ed7.setBackgroundResource(R.drawable.border_with_green_bg);
                    } else {
                        ed7.setBackgroundColor(Color.WHITE);
                        ed7.setBackgroundResource(R.drawable.border_with_white_bg);
                        ed7.getText().clear();
                    }
                }

                if (text8.isEmpty()) {
                    ed8.setBackgroundColor(Color.WHITE);
                    ed8.setBackgroundResource(R.drawable.border_with_white_bg);
                } else {
                    if (text8.equals("A")) {
                        ed8.setBackgroundColor(Color.GREEN);
                        ed8.setBackgroundResource(R.drawable.border_with_green_bg);
                    } else {
                        ed8.setBackgroundColor(Color.WHITE);
                        ed8.setBackgroundResource(R.drawable.border_with_white_bg);
                        ed8.getText().clear();
                    }
                }

                if (text9.isEmpty()) {
                    ed9.setBackgroundColor(Color.WHITE);
                    ed9.setBackgroundResource(R.drawable.border_with_white_bg);
                } else {
                    if (text9.equals("R")) {
                        ed9.setBackgroundColor(Color.GREEN);
                        ed9.setBackgroundResource(R.drawable.border_with_green_bg);
                    } else {
                        ed9.setBackgroundColor(Color.WHITE);
                        ed9.setBackgroundResource(R.drawable.border_with_white_bg);
                        ed9.getText().clear();
                    }
                }

                if (text10.isEmpty()) {
                    ed10.setBackgroundColor(Color.WHITE);
                    ed10.setBackgroundResource(R.drawable.border_with_white_bg);
                } else {
                    if (text10.equals("I")) {
                        ed10.setBackgroundColor(Color.GREEN);
                        ed10.setBackgroundResource(R.drawable.border_with_green_bg);
                    } else {
                        ed10.setBackgroundColor(Color.WHITE);
                        ed10.setBackgroundResource(R.drawable.border_with_white_bg);
                        ed10.getText().clear();
                    }
                }

                if (text11.isEmpty()) {
                    ed11.setBackgroundColor(Color.WHITE);
                    ed11.setBackgroundResource(R.drawable.border_with_white_bg);
                } else {
                    if (text11.equals("A")) {
                        ed11.setBackgroundColor(Color.GREEN);
                        ed11.setBackgroundResource(R.drawable.border_with_green_bg);
                    } else {
                        ed11.setBackgroundColor(Color.WHITE);
                        ed11.setBackgroundResource(R.drawable.border_with_white_bg);
                        ed11.getText().clear();
                    }
                }

                if (text12.isEmpty()) {
                    ed12.setBackgroundColor(Color.WHITE);
                    ed12.setBackgroundResource(R.drawable.border_with_white_bg);
                } else {
                    if (text12.equals("G")) {
                        ed12.setBackgroundColor(Color.GREEN);
                        ed12.setBackgroundResource(R.drawable.border_with_green_bg);
                    } else {
                        ed12.setBackgroundColor(Color.WHITE);
                        ed12.setBackgroundResource(R.drawable.border_with_white_bg);
                        ed12.getText().clear();
                    }
                }

                if (text13.isEmpty()) {
                    ed13.setBackgroundColor(Color.WHITE);
                    ed13.setBackgroundResource(R.drawable.border_with_white_bg);
                } else {
                    if (text13.equals("E")) {
                        ed13.setBackgroundColor(Color.GREEN);
                        ed13.setBackgroundResource(R.drawable.border_with_green_bg);
                    } else {
                        ed13.setBackgroundColor(Color.WHITE);
                        ed13.setBackgroundResource(R.drawable.border_with_white_bg);
                        ed13.getText().clear();
                    }
                }

                if (text14.isEmpty()) {
                    ed14.setBackgroundColor(Color.WHITE);
                    ed14.setBackgroundResource(R.drawable.border_with_white_bg);
                } else {
                    if (text14.equals("M")) {
                        ed14.setBackgroundColor(Color.GREEN);
                        ed14.setBackgroundResource(R.drawable.border_with_green_bg);
                    } else {
                        ed14.setBackgroundColor(Color.WHITE);
                        ed14.setBackgroundResource(R.drawable.border_with_white_bg);
                        ed14.getText().clear();
                    }
                }

                if (text15.isEmpty()) {
                    ed15.setBackgroundColor(Color.WHITE);
                    ed15.setBackgroundResource(R.drawable.border_with_white_bg);
                } else {
                    if (text15.equals("L")) {
                        ed15.setBackgroundColor(Color.GREEN);
                        ed15.setBackgroundResource(R.drawable.border_with_green_bg);
                    } else {
                        ed15.setBackgroundColor(Color.WHITE);
                        ed15.setBackgroundResource(R.drawable.border_with_white_bg);
                        ed15.getText().clear();
                    }
                }

                if (text16.isEmpty()) {
                    ed16.setBackgroundColor(Color.WHITE);
                    ed16.setBackgroundResource(R.drawable.border_with_white_bg);
                } else {
                    if (text16.equals("I")) {
                        ed16.setBackgroundColor(Color.GREEN);
                        ed16.setBackgroundResource(R.drawable.border_with_green_bg);
                    } else {
                        ed16.setBackgroundColor(Color.WHITE);
                        ed16.setBackgroundResource(R.drawable.border_with_white_bg);
                        ed16.getText().clear();
                    }
                }

                if (text17.isEmpty()) {
                    ed17.setBackgroundColor(Color.WHITE);
                    ed17.setBackgroundResource(R.drawable.border_with_white_bg);
                } else {
                    if (text17.equals("W")) {
                        ed17.setBackgroundColor(Color.GREEN);
                        ed17.setBackgroundResource(R.drawable.border_with_green_bg);
                    } else {
                        ed17.setBackgroundColor(Color.WHITE);
                        ed17.setBackgroundResource(R.drawable.border_with_white_bg);
                        ed17.getText().clear();
                    }
                }

                if (text18.isEmpty()) {
                    ed18.setBackgroundColor(Color.WHITE);
                    ed18.setBackgroundResource(R.drawable.border_with_white_bg);
                } else {
                    if (text18.equals("S")) {
                        ed18.setBackgroundColor(Color.GREEN);
                        ed18.setBackgroundResource(R.drawable.border_with_green_bg);
                    } else {
                        ed18.setBackgroundColor(Color.WHITE);
                        ed18.setBackgroundResource(R.drawable.border_with_white_bg);
                        ed18.getText().clear();
                    }
                }

                if (text19.isEmpty()) {
                    ed19.setBackgroundColor(Color.WHITE);
                    ed19.setBackgroundResource(R.drawable.border_with_white_bg);
                } else {
                    if (text19.equals("I")) {
                        ed19.setBackgroundColor(Color.GREEN);
                        ed19.setBackgroundResource(R.drawable.border_with_green_bg);
                    } else {
                        ed19.setBackgroundColor(Color.WHITE);
                        ed19.setBackgroundResource(R.drawable.border_with_white_bg);
                        ed19.getText().clear();
                    }
                }

                if (text20.isEmpty()) {
                    ed20.setBackgroundColor(Color.WHITE);
                    ed20.setBackgroundResource(R.drawable.border_with_white_bg);
                } else {
                    if (text20.equals("C")) {
                        ed20.setBackgroundColor(Color.GREEN);
                        ed20.setBackgroundResource(R.drawable.border_with_green_bg);
                    } else {
                        ed20.setBackgroundColor(Color.WHITE);
                        ed20.setBackgroundResource(R.drawable.border_with_white_bg);
                        ed20.getText().clear();
                    }
                }

                if (text21.isEmpty()) {
                    ed21.setBackgroundColor(Color.WHITE);
                    ed21.setBackgroundResource(R.drawable.border_with_white_bg);
                } else {
                    if (text21.equals("H")) {
                        ed21.setBackgroundColor(Color.GREEN);
                        ed21.setBackgroundResource(R.drawable.border_with_green_bg);
                    } else {
                        ed21.setBackgroundColor(Color.WHITE);
                        ed21.setBackgroundResource(R.drawable.border_with_white_bg);
                        ed21.getText().clear();
                    }
                }

                if (text22.isEmpty()) {
                    ed22.setBackgroundColor(Color.WHITE);
                    ed22.setBackgroundResource(R.drawable.border_with_white_bg);
                } else {
                    if (text22.equals("O")) {
                        ed22.setBackgroundColor(Color.GREEN);
                        ed22.setBackgroundResource(R.drawable.border_with_green_bg);
                    } else {
                        ed22.setBackgroundColor(Color.WHITE);
                        ed22.setBackgroundResource(R.drawable.border_with_white_bg);
                        ed22.getText().clear();
                    }
                }

                if (text23.isEmpty()) {
                    ed23.setBackgroundColor(Color.WHITE);
                    ed23.setBackgroundResource(R.drawable.border_with_white_bg);
                } else {
                    if (text23.equals("C")) {
                        ed23.setBackgroundColor(Color.GREEN);
                        ed23.setBackgroundResource(R.drawable.border_with_green_bg);
                    } else {
                        ed23.setBackgroundColor(Color.WHITE);
                        ed23.setBackgroundResource(R.drawable.border_with_white_bg);
                        ed23.getText().clear();
                    }
                }

                if (text24.isEmpty()) {
                    ed24.setBackgroundColor(Color.WHITE);
                    ed24.setBackgroundResource(R.drawable.border_with_white_bg);
                } else {
                    if (text24.equals("O")) {
                        ed24.setBackgroundColor(Color.GREEN);
                        ed24.setBackgroundResource(R.drawable.border_with_green_bg);
                    } else {
                        ed24.setBackgroundColor(Color.WHITE);
                        ed24.setBackgroundResource(R.drawable.border_with_white_bg);
                        ed24.getText().clear();
                    }
                }

                if (text25.isEmpty()) {
                    ed25.setBackgroundColor(Color.WHITE);
                    ed25.setBackgroundResource(R.drawable.border_with_white_bg);
                } else {
                    if (text25.equals("L")) {
                        ed25.setBackgroundColor(Color.GREEN);
                        ed25.setBackgroundResource(R.drawable.border_with_green_bg);
                    } else {
                        ed25.setBackgroundColor(Color.WHITE);
                        ed25.setBackgroundResource(R.drawable.border_with_white_bg);
                        ed25.getText().clear();
                    }
                }

                if (text26.isEmpty()) {
                    ed26.setBackgroundColor(Color.WHITE);
                    ed26.setBackgroundResource(R.drawable.border_with_white_bg);
                } else {
                    if (text26.equals("A")) {
                        ed26.setBackgroundColor(Color.GREEN);
                        ed26.setBackgroundResource(R.drawable.border_with_green_bg);
                    } else {
                        ed26.setBackgroundColor(Color.WHITE);
                        ed26.setBackgroundResource(R.drawable.border_with_white_bg);
                        ed26.getText().clear();
                    }
                }

                if (text27.isEmpty()) {
                    ed27.setBackgroundColor(Color.WHITE);
                    ed27.setBackgroundResource(R.drawable.border_with_white_bg);
                } else {
                    if (text27.equals("T")) {
                        ed27.setBackgroundColor(Color.GREEN);
                        ed27.setBackgroundResource(R.drawable.border_with_green_bg);
                    } else {
                        ed27.setBackgroundColor(Color.WHITE);
                        ed27.setBackgroundResource(R.drawable.border_with_white_bg);
                        ed27.getText().clear();
                    }
                }

                if (text28.isEmpty()) {
                    ed28.setBackgroundColor(Color.WHITE);
                    ed28.setBackgroundResource(R.drawable.border_with_white_bg);
                } else {
                    if (text28.equals("E")) {
                        ed28.setBackgroundColor(Color.GREEN);
                        ed28.setBackgroundResource(R.drawable.border_with_green_bg);
                    } else {
                        ed28.setBackgroundColor(Color.WHITE);
                        ed28.setBackgroundResource(R.drawable.border_with_white_bg);
                        ed28.getText().clear();
                    }
                }

                if (text29.isEmpty()) {
                    ed29.setBackgroundColor(Color.WHITE);
                    ed29.setBackgroundResource(R.drawable.border_with_white_bg);
                } else {
                    if (text29.equals("R")) {
                        ed29.setBackgroundColor(Color.GREEN);
                        ed29.setBackgroundResource(R.drawable.border_with_green_bg);
                    } else {
                        ed29.setBackgroundColor(Color.WHITE);
                        ed29.setBackgroundResource(R.drawable.border_with_white_bg);
                        ed29.getText().clear();
                    }
                }

//                if (text30.isEmpty()) {
//                    ed30.setBackgroundColor(Color.RED);
//                    ed30.setBackgroundResource(R.drawable.border_with_red_bg);
//                } else {
//                    if (text30.equals("P")) {
//                        ed30.setBackgroundColor(Color.GREEN);
//                        ed30.setBackgroundResource(R.drawable.border_with_green_bg);
//                    } else {
//                        ed30.setBackgroundColor(Color.RED);
//                        ed30.setBackgroundResource(R.drawable.border_with_red_bg);
//                    }
//                }

                if (text31.isEmpty()) {
                    ed31.setBackgroundColor(Color.WHITE);
                    ed31.setBackgroundResource(R.drawable.border_with_white_bg);
                } else {
                    if (text31.equals("N")) {
                        ed31.setBackgroundColor(Color.GREEN);
                        ed31.setBackgroundResource(R.drawable.border_with_green_bg);
                    } else {
                        ed31.setBackgroundColor(Color.WHITE);
                        ed31.setBackgroundResource(R.drawable.border_with_white_bg);
                        ed31.getText().clear();
                    }
                }

                if (text32.isEmpty()) {
                    ed32.setBackgroundColor(Color.WHITE);
                    ed32.setBackgroundResource(R.drawable.border_with_white_bg);
                } else {
                    if (text32.equals("N")) {
                        ed32.setBackgroundColor(Color.GREEN);
                        ed32.setBackgroundResource(R.drawable.border_with_green_bg);
                    } else {
                        ed32.setBackgroundColor(Color.WHITE);
                        ed32.setBackgroundResource(R.drawable.border_with_white_bg);
                        ed32.getText().clear();
                    }
                }

                if (text33.isEmpty()) {
                    ed33.setBackgroundColor(Color.WHITE);
                    ed33.setBackgroundResource(R.drawable.border_with_white_bg);
                } else {
                    if (text33.equals("C")) {
                        ed33.setBackgroundColor(Color.GREEN);
                        ed33.setBackgroundResource(R.drawable.border_with_green_bg);
                    } else {
                        ed33.setBackgroundColor(Color.WHITE);
                        ed33.setBackgroundResource(R.drawable.border_with_white_bg);
                        ed33.getText().clear();
                    }
                }

                if (text34.isEmpty()) {
                    ed34.setBackgroundColor(Color.WHITE);
                    ed34.setBackgroundResource(R.drawable.border_with_white_bg);
                } else {
                    if (text34.equals("A")) {
                        ed34.setBackgroundColor(Color.GREEN);
                        ed34.setBackgroundResource(R.drawable.border_with_green_bg);
                    } else {
                        ed34.setBackgroundColor(Color.WHITE);
                        ed34.setBackgroundResource(R.drawable.border_with_white_bg);
                        ed34.getText().clear();
                    }
                }

                if (text35.isEmpty()) {
                    ed35.setBackgroundColor(Color.WHITE);
                    ed35.setBackgroundResource(R.drawable.border_with_white_bg);
                } else {
                    if (text35.equals("K")) {
                        ed35.setBackgroundColor(Color.GREEN);
                        ed35.setBackgroundResource(R.drawable.border_with_green_bg);
                    } else {
                        ed35.setBackgroundColor(Color.WHITE);
                        ed35.setBackgroundResource(R.drawable.border_with_white_bg);
                        ed35.getText().clear();
                    }
                }

                if (text36.isEmpty()) {
                    ed36.setBackgroundColor(Color.WHITE);
                    ed36.setBackgroundResource(R.drawable.border_with_white_bg);
                } else {
                    if (text36.equals("E")) {
                        ed36.setBackgroundColor(Color.GREEN);
                        ed36.setBackgroundResource(R.drawable.border_with_green_bg);
                    } else {
                        ed36.setBackgroundColor(Color.WHITE);
                        ed36.setBackgroundResource(R.drawable.border_with_white_bg);
                        ed36.getText().clear();
                    }
                }

                if (text37.isEmpty()) {
                    ed37.setBackgroundColor(Color.WHITE);
                    ed37.setBackgroundResource(R.drawable.border_with_white_bg);
                } else {
                    if (text37.equals("S")) {
                        ed37.setBackgroundColor(Color.GREEN);
                        ed37.setBackgroundResource(R.drawable.border_with_green_bg);
                    } else {
                        ed37.setBackgroundColor(Color.WHITE);
                        ed37.setBackgroundResource(R.drawable.border_with_white_bg);
                        ed37.getText().clear();
                    }
                }






            }
        });
    }
}