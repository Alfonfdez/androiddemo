package com.afr.constraintlayouthw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    // I - DECLARAR VARIABLES
    TextView textView_tiempo;

    String tiempoOnPauseComienza = "";
    String tiempoOnResumeComienza = "";

    public MainActivity(){
        //2) Segunda cosa en inicializarse: el constructor
        Log.d("INFO", "DENTRO DE MÉTODO CONSTRUCTOR");
    }

    static{
        //1) Primera cosa en inicializarse 'static' y SÓLO UNA VEZ
        Log.d("INFO", "SE INICIALIZA EL 'MUNDO ESTÁTICO'");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //3) Tercera cosa en inicializarse: el método
        Log.d("INFO", "DENTRO DE onCreate()");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // II - ASIGNAMOS LAS VARIABLES
        textView_tiempo = (TextView) findViewById(R.id.id_textview);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("INFO", "onPause()");

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
        String format = simpleDateFormat.format(new Date());
        Log.d("MainActivity", "Current Timestamp onPause: " + format);

        tiempoOnPauseComienza = format;
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("INFO", "onResume()");

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
        String format = simpleDateFormat.format(new Date());
        Log.d("MainActivity", "Current Timestamp onResume: " + format);

        tiempoOnResumeComienza = format;

        mostrarTiempoOnResume();
    }



    public void mostrarTiempoOnResume(){

        if(tiempoOnPauseComienza.equals("") || tiempoOnResumeComienza.equals("")){

        } else {
            String[] partsOnPause = tiempoOnPauseComienza.split("-");

            String hourOnPauseString = partsOnPause[3];
            String minuteOnPauseString = partsOnPause[4];
            String secondOnPauseString = partsOnPause[5];

            int hourOnPauseInt = Integer.parseInt(hourOnPauseString);
            int minuteOnPauseInt = Integer.parseInt(minuteOnPauseString);
            int secondOnPauseInt = Integer.parseInt(secondOnPauseString);


            String[] partsOnResume = tiempoOnResumeComienza.split("-");

            String hourOnResumeString = partsOnResume[3];
            String minuteOnResumeString = partsOnResume[4];
            String secondOnResumeString = partsOnResume[5];

            int hourOnResumeInt = Integer.parseInt(hourOnResumeString);
            int minuteOnResumeInt = Integer.parseInt(minuteOnResumeString);
            int secondOnResumeInt = Integer.parseInt(secondOnResumeString);


            int diferenciaHoras =  hourOnResumeInt - hourOnPauseInt;
            int diferenciaMinutos =  minuteOnResumeInt - minuteOnPauseInt;
            int diferenciaSegundos =  secondOnResumeInt - secondOnPauseInt;


            String resultado = "Diferencia de "+diferenciaHoras+" horas, "+diferenciaMinutos+" minutos y "+diferenciaSegundos+" segundos.";

            textView_tiempo.setText(resultado);
        }

    }

    /*public void mostrar(View view){


    }*/


}
