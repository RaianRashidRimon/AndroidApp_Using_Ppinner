package com.example.useofspinner;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private GameExpert expert = new GameExpert();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickSeekMenu(View view) {
        Spinner GameSpinner = (Spinner) findViewById(R.id.GameSpinner);
        String SelectedMeal = String.valueOf(GameSpinner.getSelectedItem());

        List<String> gameList = expert.getGames(SelectedMeal);
        StringBuilder gameFormatted = new StringBuilder();
        for (String Game : gameList) {
            gameFormatted.append(Game).append('\n');
        }

        TextView GamesTextView = findViewById(R.id.GamesTextView);
        GamesTextView.setText(gameFormatted.toString());

    }
}