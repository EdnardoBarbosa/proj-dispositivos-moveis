package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Button btnPaciente = (Button) findViewById(R.id.btn_paciente);
        btnPaciente.setOnClickListener(this);

        Button btnMedico = (Button) findViewById(R.id.btn_medico);
        btnMedico.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.btn_paciente:
                Intent telaCadastroPaciente = new Intent(this, CadastroPacienteActivity.class);
                startActivity(telaCadastroPaciente);
                break;
            case R.id.btn_medico:
                Intent telaCadastroMedico = new Intent(this, CadastroMedicoActivity.class);
                startActivity(telaCadastroMedico);
                break;

        }
    }


}
