package br.com.leandro.textfield;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatEditText;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private AppCompatEditText editTextEmail;
    private AppCompatEditText editTextSenha;

    private TextInputLayout  textLayoutEmail;
    private TextInputLayout  textLayoutSenha;

    private Button botao_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextEmail = findViewById(R.id.edit_email);
        editTextSenha = findViewById(R.id.edit_senha);

        textLayoutEmail = findViewById(R.id.textLayoutEmail);
        textLayoutSenha = findViewById(R.id.textLayoutSenha);

        botao_login = findViewById(R.id.botao_login);
        botao_login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                validateForm();

            }
        });


    }

    private void validateForm(){

        if(editTextEmail.getText().toString().isEmpty()){

            textLayoutEmail.setErrorEnabled(true);
            textLayoutEmail.setError("Preencha o campo e-mail!");
        }else{

            textLayoutEmail.setErrorEnabled(false);
        }

        if(editTextSenha.getText().toString().isEmpty()){

            textLayoutSenha.setErrorEnabled(true);
            textLayoutSenha.setError("Preencha o campo Senha!");
        }else{

            textLayoutSenha.setErrorEnabled(false);
        }

    }
}
