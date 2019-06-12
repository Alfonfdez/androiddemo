package com.afr.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // I - DECLARAR VARIABLES
    private TextView display;
    private String displayNumber = "";

    private double operando1 = 0;
    private double operando2 = 0;
    private double resultado;
    private String operacion;

    private boolean estaOperando = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // II - ASIGNAMOS LAS VARIABLES
        display = (TextView) findViewById(R.id.id_display);
    }


    public void botonPulsado(View view){

        switch(view.getId()){

            case R.id.id_cero:
                if(!estaOperando){
                    displayNumber += "0";
                } else{
                    displayNumber = "";
                    displayNumber += "0";

                    estaOperando = false;
                }

                break;

            case R.id.id_uno:
                if(!estaOperando){
                    displayNumber += "1";
                } else{
                    displayNumber = "";
                    displayNumber += "1";

                    estaOperando = false;
                }

                break;
            case R.id.id_dos:
                if(!estaOperando){
                    displayNumber += "2";
                } else{
                    displayNumber = "";
                    displayNumber += "2";

                    estaOperando = false;
                }

                break;
            case R.id.id_tres:
                if(!estaOperando){
                    displayNumber += "3";
                } else{
                    displayNumber = "";
                    displayNumber += "3";

                    estaOperando = false;
                }

                break;
            case R.id.id_cuatro:

            case R.id.id_cinco:

            case R.id.id_seis:

            case R.id.id_siete:

            case R.id.id_ocho:

            case R.id.id_nueve:


            case R.id.id_punto:
                displayNumber += ".";
                break;


            case R.id.id_ce:
                displayNumber = "";
                break;
            case R.id.id_porcentaje:

                break;

            case R.id.id_mas:
                if(operacion.equals("+")){
                    operando2 = Double.parseDouble(displayNumber);

                    resultado = sumar(operando1, operando2);

                    String resultadoString = String.valueOf(resultado);
                    displayNumber = resultadoString;

                    operando1 = Double.parseDouble(displayNumber);
                } else{
                    estaOperando = true;

                    operacion = "+";
                    operando1 = Double.parseDouble(displayNumber);


                }

                break;

            case R.id.id_menos:
                break;
            case R.id.id_division:
                break;
            case R.id.id_multiplicar:
                break;

            case R.id.id_igual:
                if(operacion.isEmpty()){
                    break;
                } else if(operacion.equals("+")){
                    operando2 = Double.parseDouble(displayNumber);

                    resultado = sumar(operando1, operando2);

                    operacion = null;
                }

                String resultadoString = String.valueOf(resultado);
                displayNumber = resultadoString;

                operando1 = Double.parseDouble(displayNumber);

                break;


        }


        display.setText(displayNumber);


    }

    public double sumar(double operando1, double operando2){

        double resultado = operando1 + operando2;

        return resultado;
    }

    public double restar(double operando1, double operando2){

        double resultado = operando1 - operando2;

        return resultado;
    }

    public double multiplicar(double operando1, double operando2){

        double resultado = operando1 * operando2;

        return resultado;
    }

    public double dividir(double operando1, double operando2){

        double resultado = operando1 / operando2;

        return resultado;
    }



}
