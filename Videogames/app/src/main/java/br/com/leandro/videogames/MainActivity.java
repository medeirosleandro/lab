package br.com.leandro.videogames;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvSony = findViewById(R.id.tvSony);
        tvSony.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i =new Intent(MainActivity.this,Sony.class);
                startActivity(i);

            }
        });

        TextView tvNintendo = findViewById(R.id.tvNintendo);
        tvNintendo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this,Nintendo.class);
                startActivity(i);

            }
        });

        TextView tvMicrosoft = findViewById(R.id.tvMicrosoft);
        tvMicrosoft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, Microsoft.class);
                startActivity(i);

            }
        });

        TextView tvSilvio = findViewById(R.id.tvSilvio);
        tvSilvio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this,Silvio.class);
                startActivity(i);
            }
        });
    }
}
