package com.yugal.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button  button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonRestart;
    LinearLayout layoutMain;
    int i =1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonRestart = (Button) findViewById(R.id.restart);
        layoutMain = (LinearLayout) findViewById(R.id.layout_main);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (i) {
                    case 1:
                        i = 2;
                        button1.setText("X");
                        button1.setEnabled(false);
                        break;
                    case 2:
                        i = 1;
                        button1.setText("O");
                        button1.setEnabled(false);
                        break;
                }
                endGame();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (i) {
                    case 1:
                        i = 2;
                        button2.setText("X");
                        button2.setEnabled(false);
                        break;
                    case 2:
                        i = 1;
                        button2.setText("O");
                        button2.setEnabled(false);
                        break;
                }
                endGame();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (i) {
                    case 1:
                        i = 2;
                        button3.setText("X");
                        button3.setEnabled(false);
                        break;
                    case 2:
                        i = 1;
                        button3.setText("O");
                        button3.setEnabled(false);
                        break;
                }
                endGame();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (i) {
                    case 1:
                        i = 2;
                        button4.setText("X");
                        button4.setEnabled(false);
                        break;
                    case 2:
                        i = 1;
                        button4.setText("O");
                        button4.setEnabled(false);
                        break;
                }
                endGame();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (i) {
                    case 1:
                        i = 2;
                        button5.setText("X");
                        button5.setEnabled(false);
                        break;
                    case 2:
                        i = 1;
                        button5.setText("O");
                        button5.setEnabled(false);
                        break;
                }
                endGame();
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (i) {
                    case 1:
                        i = 2;
                        button6.setText("X");
                        button6.setEnabled(false);
                        break;
                    case 2:
                        i = 1;
                        button6.setText("O");
                        button6.setEnabled(false);
                        break;
                }
                endGame();
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (i) {
                    case 1:
                        i = 2;
                        button7.setText("X");
                        button7.setEnabled(false);
                        break;
                    case 2:
                        i = 1;
                        button7.setText("O");
                        button7.setEnabled(false);
                        break;
                }
                endGame();
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (i) {
                    case 1:
                        i = 2;
                        button8.setText("X");
                        button8.setEnabled(false);
                        break;
                    case 2:
                        i = 1;
                        button8.setText("O");
                        button8.setEnabled(false);
                        break;
                }
                endGame();
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (i) {
                    case 1:
                        i = 2;
                        button9.setText("X");
                        button9.setEnabled(false);
                        break;
                    case 2:
                        i = 1;
                        button9.setText("O");
                        button9.setEnabled(false);
                        break;
                }
                endGame();
            }
        });
        buttonRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reStart();
            }
        });

    }

    public void endGame(){
        String b1 = button1.getText().toString();
        String b2 = button2.getText().toString();
        String b3 = button3.getText().toString();
        String b4 = button4.getText().toString();
        String b5 = button5.getText().toString();
        String b6 = button6.getText().toString();
        String b7 = button7.getText().toString();
        String b8 = button8.getText().toString();
        String b9 = button9.getText().toString();

        if(b1.equals(b2) && b2.equals(b3) && b1.equals("X")){
            Toast.makeText(MainActivity.this, "WINNER IS X", Toast.LENGTH_SHORT).show();
            buttonBlock();
        }
        else if(b1.equals(b4) && b4.equals(b7) && b1.equals("X")){
            Toast.makeText(MainActivity.this, "WINNER IS X", Toast.LENGTH_SHORT).show();
            buttonBlock();
        }
        else if(b7.equals(b8) && b8.equals(b9) && b7.equals("X")){
            Toast.makeText(MainActivity.this, "WINNER IS X", Toast.LENGTH_SHORT).show();
            buttonBlock();
        }
        else if(b9.equals(b6) && b6.equals(b3) && b9.equals("X")){
            Toast.makeText(MainActivity.this, "WINNER IS X", Toast.LENGTH_SHORT).show();
            buttonBlock();
        }
        else if(b1.equals(b5) && b5.equals(b9) && b1.equals("X")){
            Toast.makeText(MainActivity.this, "WINNER IS X", Toast.LENGTH_SHORT).show();
            buttonBlock();
        }
        else if(b3.equals(b5) && b5.equals(b7) && b3.equals("X")){
            Toast.makeText(MainActivity.this, "WINNER IS X", Toast.LENGTH_SHORT).show();
            buttonBlock();
        }
        else if(b2.equals(b5) && b5.equals(b8) && b2.equals("X")){
            Toast.makeText(MainActivity.this, "WINNER IS X", Toast.LENGTH_SHORT).show();
            buttonBlock();
        }
        else if(b4.equals(b5) && b5.equals(b6) && b4.equals("X")){
            Toast.makeText(MainActivity.this, "WINNER IS X", Toast.LENGTH_SHORT).show();
            buttonBlock();
        }


        else if(b1.equals(b2) && b2.equals(b3) && b1.equals("O")){
            Toast.makeText(MainActivity.this, "WINNER IS O", Toast.LENGTH_SHORT).show();
            buttonBlock();
        }
        else if(b1.equals(b4) && b4.equals(b7) && b1.equals("O")){
            Toast.makeText(MainActivity.this, "WINNER IS O", Toast.LENGTH_SHORT).show();
            buttonBlock();
        }
        else if(b7.equals(b8) && b8.equals(b9) && b7.equals("O")){
            Toast.makeText(MainActivity.this, "WINNER IS O", Toast.LENGTH_SHORT).show();
            buttonBlock();
        }
        else if(b9.equals(b6) && b6.equals(b3) && b9.equals("O")){
            Toast.makeText(MainActivity.this, "WINNER IS O", Toast.LENGTH_SHORT).show();
            buttonBlock();
        }
        else if(b1.equals(b5) && b5.equals(b9) && b1.equals("O")){
            Toast.makeText(MainActivity.this, "WINNER IS O", Toast.LENGTH_SHORT).show();
            buttonBlock();
        }
        else if(b3.equals(b5) && b5.equals(b7) && b3.equals("O")){
            Toast.makeText(MainActivity.this, "WINNER IS O", Toast.LENGTH_SHORT).show();
            buttonBlock();
        }
        else if(b2.equals(b5) && b5.equals(b8) && b2.equals("O")){
            Toast.makeText(MainActivity.this, "WINNER IS O", Toast.LENGTH_SHORT).show();
            buttonBlock();
        }
        else if(b4.equals(b5) && b5.equals(b6) && b4.equals("O")){
            Toast.makeText(MainActivity.this, "WINNER IS O", Toast.LENGTH_SHORT).show();
            buttonBlock();
        }
    }

    public void buttonBlock(){
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
    }

    public void reStart(){
        button1.setText(""); button2.setText(""); button3.setText(""); button4.setText(""); button5.setText("");
        button6.setText(""); button7.setText(""); button8.setText(""); button9.setText("");
        button1.setEnabled(true);
        button2.setEnabled(true);
        button3.setEnabled(true);
        button4.setEnabled(true);
        button5.setEnabled(true);
        button6.setEnabled(true);
        button7.setEnabled(true);
        button8.setEnabled(true);
        button9.setEnabled(true);
    }
}
