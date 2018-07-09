package br.com.leandro.receitasapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CoockieActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coockie);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
