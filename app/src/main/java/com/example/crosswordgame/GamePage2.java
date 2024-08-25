package com.example.crosswordgame;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class GamePage2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.game_page2);


        EditText ed1, ed2, ed3, ed4, ed5, ed6, ed7, ed8, ed9, ed10, ed11, ed12, ed13,
                ed14, ed15, ed16, ed17, ed18, ed19, ed20, ed21, ed22, ed23;

        TextView submitGame,images;

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


        images = findViewById(R.id.images);
        images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(GamePage2.this,MainActivity2.class);
                startActivity(intent);
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

                boolean allAreGreen = false;
                boolean allGreen = text1.equals("D") && text2.equals("E") && text3.equals("P") &&
                        text4.equals("E") && text5.equals("E") && text6.equals("A") &&
                        text7.equals("R") && text8.equals("S") && text9.equals("N") &&
                        text10.equals("R") && text11.equals("C") && text12.equals("A") &&
                        text13.equals("M") && text14.equals("E") && text15.equals("R") &&
                        text16.equals("A") && text17.equals("I") && text18.equals("T") &&
                        text19.equals("R") && text20.equals("U") && text21.equals("L") &&
                        text22.equals("E") && text23.equals("R");

                if (allGreen) {
                    Intent intent = new Intent(GamePage2.this, EndGame2.class);
                    startActivity(intent);
                } else {

                    Toast.makeText(GamePage2.this, "Please fill all fields correctly", Toast.LENGTH_SHORT).show();
                }

//               use all Codition's

                if (text1.isEmpty()) {
                    ed1.setBackgroundColor(Color.WHITE);
                    ed1.setBackgroundResource(R.drawable.border_with_white_bg);
                } else {
                    if (text1.equals("D")) {
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
                    if (text2.equals("E")) {
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
                    if (text3.equals("P")) {
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
                    if (text4.equals("E")) {
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
                    if (text5.equals("E")) {
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
                    if (text6.equals("A")) {
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
                    if (text8.equals("S")) {
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
                    if (text9.equals("N")) {
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
                    if (text10.equals("R")) {
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
                    if (text11.equals("C")) {
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
                    if (text12.equals("A")) {
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
                    if (text13.equals("M")) {
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
                    if (text14.equals("E")) {
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
                    if (text15.equals("R")) {
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
                    if (text16.equals("A")) {
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
                    if (text17.equals("I")) {
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
                    if (text18.equals("T")) {
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
                    if (text19.equals("R")) {
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
                    if (text20.equals("U")) {
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
                    if (text21.equals("L")) {
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
                    if (text22.equals("E")) {
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
                    if (text23.equals("R")) {
                        ed23.setBackgroundColor(Color.GREEN);
                        ed23.setBackgroundResource(R.drawable.border_with_green_bg);
                    } else {
                        ed23.setBackgroundColor(Color.WHITE);
                        ed23.setBackgroundResource(R.drawable.border_with_white_bg);
                        ed23.getText().clear();
                    }
                }

            }
        });
    }
}