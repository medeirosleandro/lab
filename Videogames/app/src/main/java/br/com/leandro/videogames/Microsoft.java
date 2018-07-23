package br.com.leandro.videogames;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

public class Microsoft extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_microsoft);

        String [] microsoftArray = getResources().getStringArray(R.array.microsoft_games);
        List<String> microsoftList = Arrays.asList(microsoftArray);

        LinearLayout root = findViewById(R.id.rootMicrosoft);
        for (String games : microsoftList){

            TextView textView = new TextView(this);
            textView.setText(games);
            root.addView(textView);


        }
    }
}
