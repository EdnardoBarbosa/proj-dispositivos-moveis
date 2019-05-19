package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_paciente);

        Button btnEntrar = (Button) findViewById(R.id.btn_entrar);
        btnEntrar.setOnClickListener(this);

        Button btnCancelar = (Button) findViewById(R.id.btn_cancelar);
        btnCancelar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        switch(view.getId()){
            case R.id.btn_cancelar:
                Intent retornarMain = new Intent(this, MainActivity.class);
                startActivity(retornarMain);
                break;

            case R.id.btn_entrar:
                Intent retornarMainBusca = new Intent(this, MainBuscaActivity.class);
                startActivity(retornarMainBusca);
                break;

        }
    }
}
