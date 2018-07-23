package br.com.leandro.videogames;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

public class Nintendo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nintendo);

        String [] nintendoArray = getResources().getStringArray(R.array.nintendo_games);
        List<String> nintendoList = Arrays.asList(nintendoArray);

        LinearLayout root = findViewById(R.id.rooNintendo);
        for(String games: nintendoList){

            TextView textView = new TextView(this);
            textView.setText(games);
            root.addView(textView);


        }
    }
}
