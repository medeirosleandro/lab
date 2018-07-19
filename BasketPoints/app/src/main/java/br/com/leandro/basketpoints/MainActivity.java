package br.com.leandro.basketpoints;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int pontuacaoTimeA = 0;

    private int pontuacaoTimeB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botaoTresPontosTimeA = (Button) findViewById(R.id.tresPontos);
        botaoTresPontosTimeA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                addTresPontosTimeA();

            }
        });

        Button botaoDoisPontosTimeA = (Button) findViewById(R.id.doisPontos);
        botaoDoisPontosTimeA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                addDoisPontosTimeA();

            }
        });


        Button botaoUmPonto = (Button) findViewById(R.id.tiroLivre);
        botaoUmPonto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addUmPontoTimeA();
            }
        });

        Button botaoTresPontosTimeB = (Button) findViewById(R.id.tresPontosB);
        botaoTresPontosTimeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                addTresPontosTimeB();

            }
        });

        Button botaoDoisPontosTimeB = (Button) findViewById(R.id.doisPontosB);
        botaoDoisPontosTimeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                addDoisPontosTimeB();

            }
        });


        Button botaoUmPontoB = (Button) findViewById(R.id.tiroLivreB);
        botaoUmPontoB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addUmPontoTimeB();
            }
        });

        Button reiniciarPartida = (Button) findViewById(R.id.reiniciarPartida);
        reiniciarPartida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reiniciarPartida();
            }
        });

    }

    public void  mostrarPlacarTimeA (int pontuacao){

        TextView placarTimeA = findViewById(R.id.placarTimeA);
        placarTimeA.setText(String.valueOf(pontuacao));


    }

    public  void mostrarPlacarTimeB (int pontuacao){

        TextView placarTimeB = findViewById(R.id.placarTimeB);
        placarTimeB.setText(String.valueOf(pontuacao));

    }

    public void  reiniciarPartida(){
        pontuacaoTimeA = 0;
        pontuacaoTimeB = 0;
        mostrarPlacarTimeA(pontuacaoTimeA);
        mostrarPlacarTimeB(pontuacaoTimeB);
    }

    public void addTresPontosTimeA(){

        pontuacaoTimeA = pontuacaoTimeA + 3;
        mostrarPlacarTimeA(pontuacaoTimeA);

    }

    public  void addDoisPontosTimeA(){

        pontuacaoTimeA = pontuacaoTimeA + 2;
        mostrarPlacarTimeA(pontuacaoTimeA);
    }

    public  void addUmPontoTimeA(){
        pontuacaoTimeA = pontuacaoTimeA + 1;
        mostrarPlacarTimeA(pontuacaoTimeA);
    }


    public void addTresPontosTimeB(){

        pontuacaoTimeB = pontuacaoTimeB + 3;
        mostrarPlacarTimeB(pontuacaoTimeB);

    }

    public  void addDoisPontosTimeB(){

        pontuacaoTimeB = pontuacaoTimeB + 2;
        mostrarPlacarTimeB(pontuacaoTimeB);
    }

    public  void addUmPontoTimeB(){
        pontuacaoTimeB = pontuacaoTimeB + 1;
        mostrarPlacarTimeB(pontuacaoTimeB);
    }

}
