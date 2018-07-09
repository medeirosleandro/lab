package br.com.leandro.receitasapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SorveteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sorvete);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
