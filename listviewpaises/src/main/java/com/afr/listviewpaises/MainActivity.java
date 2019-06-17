package com.afr.listviewpaises;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView lista;

    private String [][] datos = {

            {"Alemania", "Europa"},
            {"Arabia Saudí", "Asia"},
            {"Argentina", "América"},
            {"Australia", "Oceanía"},
            {"Brasil", "América"},
            {"Chile", "América"},
            {"China", "Asia"},
            {"Corea del Sur", "Asia"},
            {"España", "Europa"},
            {"Finlandia", "Europa"},
            {"India", "Asia"},
            {"Islandia", "Europa"},
            {"Japón", "Asia"},
            {"Marruecos", "África"},
            {"Nigeria", "África"},
            {"Portugal", "Europa"},
            {"Rusia", "Europa"},
            {"Tailandia", "Asia"},
            {"Turquia", "Asia"},
            {"Estados Unidos", "América"},
    };

    private int[] datosImg = {
            R.drawable.alemania,
            R.drawable.arabiasaudi,
            R.drawable.argentina,
            R.drawable.australia,
            R.drawable.brasil,
            R.drawable.chile,
            R.drawable.china,
            R.drawable.coreasur,
            R.drawable.espanya,
            R.drawable.finlandia,
            R.drawable.india,
            R.drawable.islandia,
            R.drawable.japon,
            R.drawable.marruecos,
            R.drawable.nigeria,
            R.drawable.portugal,
            R.drawable.rusia,
            R.drawable.tailandia,
            R.drawable.turquia,
            R.drawable.usa,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lista = (ListView) findViewById(R.id.idMiLista);

        Adaptador adaptador = new Adaptador(this, datos, datosImg);

        lista.setAdapter(adaptador);

        /*lista.setAdapter(new Adaptador(this, datos, datosImg){

        });*/

    }
}
