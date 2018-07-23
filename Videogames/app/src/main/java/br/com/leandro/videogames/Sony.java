package br.com.leandro.videogames;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Arrays;
import java.util.List;

public class Sony extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sony);

        String [] sonyArray = getResources().getStringArray(R.array.sony_games);
        List<String> sonyList = Arrays.asList(sonyArray);

        LinearLayout root = findViewById(R.id.rootSony);

        for(String games: sonyList){
            TextView textView = new TextView(this);
            textView.setText(games);
            root.addView(textView);

        }

    }
}
