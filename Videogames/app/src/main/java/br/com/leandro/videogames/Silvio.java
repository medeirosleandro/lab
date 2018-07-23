package br.com.leandro.videogames;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

public class Silvio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_silvio);

        String[] silvioArray = getResources().getStringArray(R.array.silvio_games);
        List<String> silvioList = Arrays.asList(silvioArray);

        LinearLayout root = findViewById(R.id.rootSilvio);

        for (String games : silvioList) {
            TextView textView = new TextView(this);
            textView.setText(games);
            root.addView(textView);

        }


    }
}
