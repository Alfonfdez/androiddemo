package com.afr.listviewpersonalizado;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView lista;

    private String [][] datos = {

            {"Barcelona", "España", "1.620.343 hab.", "9", "Barcelona es una ciudad española, capital de la comunidad autónoma de Cataluña, de la comarca del Barcelonés y de la provincia homónima."},
            {"Madrid", "España", "3.223.334 hab.", "8", "Madrid es un municipio y ciudad de España. La localidad, con categoría histórica de villa, es la capital del Estado y de la Comunidad de Madrid."},
            {"Londres", "Reino Unido", "8.787.892 hab.", "7", "Londres es la capital y mayor ciudad de Inglaterra y del Reino Unido."},
            {"Moscú", "Rusia", "12.500.123 hab.", "6", "Moscú es la capital y la entidad federal más poblada de Rusia."},
            {"Nueva York", "USA", "8.537.673 hab.", "8", "Nueva York es la ciudad más poblada de los Estados Unidos de América, una de las mayores del continente americano y del mundo."},
            {"París", "Francia", "2.206.488  hab.", "7", "París es la capital de Francia y su ciudad más poblada. Capital de la región de Isla de Francia."},
            {"Sidney", "Australia", "4.840.600 hab.", "7", "Sidney es la ciudad más grande y poblada de Australia y Oceanía."},
            {"Tokyo", "Japón", "13.784.212 hab.", "8", "Tokyo es la capital de facto de Japón, localizada en el centro-este de la isla de Honshu, concretamente en la región de Kanto."}
    };

    private int[] datosImg = {
        R.drawable.barcelona,
            R.drawable.madrid,
            R.drawable.london,
            R.drawable.moscow,
            R.drawable.newyork,
            R.drawable.paris,
            R.drawable.sidney,
            R.drawable.tokyo,
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
