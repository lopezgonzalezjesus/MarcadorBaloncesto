package com.example.jess.pruebalayouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int puntLocal=0, puntVisitante=0;
    Button local1, local2, local3, visitante1, visitante2, visitante3, localResta, visitanteResta, reset;
    TextView marcadorLocal, marcadorVisitante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        local1 = (Button) findViewById(R.id.Local1);
        local2 = (Button) findViewById(R.id.Local2);
        local3 = (Button) findViewById(R.id.Local3);
        localResta = (Button) findViewById(R.id.LocalResta);
        visitante1 = (Button) findViewById(R.id.Visitante1);
        visitante2 = (Button) findViewById(R.id.Visitante2);
        visitante3 = (Button) findViewById(R.id.Visitante3);
        visitanteResta = (Button) findViewById(R.id.VisitanteResta);
        reset = (Button) findViewById(R.id.Reset);
        marcadorLocal = (TextView) findViewById(R.id.MarcadorLocal);
        marcadorVisitante = (TextView) findViewById(R.id.MarcadorVisitante);
        puntLocal = Integer.parseInt(marcadorLocal.getText().toString());
        puntVisitante = Integer.parseInt(marcadorVisitante.getText().toString());

        local1.setOnClickListener(this);
        local2.setOnClickListener(this);
        local3.setOnClickListener(this);
        localResta.setOnClickListener(this);
        visitante1.setOnClickListener(this);
        visitante2.setOnClickListener(this);
        visitante3.setOnClickListener(this);
        visitanteResta.setOnClickListener(this);
        reset.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Local1:
                marcadorLocal.setText(String.valueOf(puntLocal+=1));
                break;
            case R.id.Local2:
                marcadorLocal.setText(String.valueOf(puntLocal+=2));
                break;
            case R.id.Local3:
                marcadorLocal.setText(String.valueOf(puntLocal+=3));
                break;
            case R.id.LocalResta:
                if(puntLocal-1>=0) {
                    marcadorLocal.setText(String.valueOf(puntLocal -= 1));
                }
                break;
            case R.id.Visitante1:
                marcadorVisitante.setText(String.valueOf(puntVisitante+=1));
                break;
            case R.id.Visitante2:
                marcadorVisitante.setText(String.valueOf(puntVisitante+=2));
                break;
            case R.id.Visitante3:
                marcadorVisitante.setText(String.valueOf(puntVisitante+=3));
                break;
            case R.id.VisitanteResta:
                if(puntVisitante-1>=0) {
                    marcadorVisitante.setText(String.valueOf(puntVisitante -= 1));
                }
                break;
            case R.id.Reset:
                puntLocal = 0;
                puntVisitante =0;
                marcadorVisitante.setText(String.valueOf(puntVisitante));
                marcadorLocal.setText(String.valueOf(puntLocal));
        }
    }
}
