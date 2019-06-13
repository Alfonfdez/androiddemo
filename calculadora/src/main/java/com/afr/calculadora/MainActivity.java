package com.afr.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // I - DECLARAR VARIABLES
    private TextView display;
    private String displayNumber = "0";
    private Estado estado = Estado.INICIAL;

    private double operando1 = 0;
    private double operando2 = 0;
    private double resultado = 0;
    private String operacion = "";

    private boolean estaOperando = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // II - ASIGNAMOS LAS VARIABLES
        display = (TextView) findViewById(R.id.id_display);
    }


    public void botonPulsado(View view){

        /*double operando1 = 3.3;
        double operando2 = 3;

        DecimalFormat df = new DecimalFormat("#,####");


        double resultado = operando1 * operando2;

        sysout(df.format(resultado));*/

        switch(view.getId()){

            case R.id.id_cero:
                /*if(estado.equals(Estado.INICIAL)){
                    displayNumber = "0";
                } else if(estado.equals(Estado.OPERANDO1) && !displayNumber.equals("0")){
                    displayNumber += "0";
                } else if(estado.equals(Estado.OPERANDO2) && !displayNumber.equals("0")){
                    displayNumber += "0";
                } else if(estado.equals(Estado.RESULTADO)){
                    displayNumber = "0";
                    estado = Estado.INICIAL;
                }*/

                break;

            case R.id.id_uno:
                if(estado.equals(Estado.INICIAL)){
                    displayNumber = "1";

                    if(operacion.equals("")){
                        estado = Estado.OPERANDO1;
                    }else{
                        estado = Estado.OPERANDO2;
                    }

                } else if(estado.equals(Estado.OPERANDO1)){
                    displayNumber += "1";
                } else if(estado.equals(Estado.OPERANDO2)){
                    displayNumber += "1";
                } else if(estado.equals(Estado.RESULTADO)){
                    displayNumber = "1";
                    estado = Estado.OPERANDO1;
                }

                break;
            case R.id.id_dos:
                break;
            case R.id.id_tres:
                break;
            case R.id.id_cuatro:
                break;
            case R.id.id_cinco:
                break;
            case R.id.id_seis:
                break;
            case R.id.id_siete:
                break;
            case R.id.id_ocho:
                break;
            case R.id.id_nueve:
                break;

            case R.id.id_punto:
                displayNumber += ".";
                break;


            case R.id.id_ce:
                displayNumber = "0";
                operacion = "";
                break;
            case R.id.id_porcentaje:

                break;

            case R.id.id_mas:

                if(estado.equals(Estado.OPERANDO1)){
                    operando1 = Double.parseDouble(displayNumber);
                    operacion = "+";

                    estado = Estado.INICIAL;
                }else if(estado.equals(Estado.OPERANDO2)){
                    operando2 = Double.parseDouble(displayNumber);
                    operacion = "+";

                    resultado = sumar(operando1, operando2);
                    operando1 = resultado;

                    String resultadoString = String.valueOf(resultado);
                    displayNumber = resultadoString;

                    estado = Estado.INICIAL;
                }

                break;

            case R.id.id_menos:
                break;
            case R.id.id_division:
                break;
            case R.id.id_multiplicar:
                break;

            case R.id.id_igual:
                if(operacion.equals("")){

                } else if(operacion.equals("+")){
                    operando2 = Double.parseDouble(displayNumber);

                    resultado = sumar(operando1, operando2);

                    operando1 = resultado;

                    operacion = "";

                    String resultadoString = String.valueOf(resultado);
                    displayNumber = resultadoString;


                }




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

enum Estado {
    INICIAL, OPERANDO1, OPERANDO2, RESULTADO;
}
