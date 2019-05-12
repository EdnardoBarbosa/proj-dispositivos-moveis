package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnPaciente1 = (Button) findViewById(R.id.btn_paciente);
        btnPaciente1.setOnClickListener(this);

        Button btnMedico1 = (Button) findViewById(R.id.btn_medico);
        btnMedico1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.btn_paciente:
                Intent telaLoginPaciente = new Intent(this, LoginPacienteActivity.class);
                startActivity(telaLoginPaciente);
                break;
        }
    }
}
