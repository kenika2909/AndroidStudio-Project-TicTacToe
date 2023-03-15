package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Enter_Names extends AppCompatActivity {

    private EditText player1;
    private EditText player2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enter_names);

        player1 = findViewById(R.id.playerOne);
        player2 = findViewById(R.id.playerTwo);
    }

    public void submitButtonClick (View view){
        String playerOne = player1.getText().toString();
        String playerTwo = player2.getText().toString();

        Intent intent = new Intent(this, Game.class);
        intent.putExtra("PLAYERS_NAME",new String[] {playerOne, playerTwo});
        startActivity(intent);

    }
}