package com.afr.listviewpersonalizado;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class VisorDetalles extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visor_detalles);

        TextView nombreCiudad = (TextView) findViewById(R.id.idTVNombreCiudad);
        TextView nombrePais = (TextView) findViewById(R.id.idTVNombrePais);
        TextView numeroHabitantes = (TextView) findViewById(R.id.idTVNumeroHabitantes);
        RatingBar calificacionCiudad = (RatingBar) findViewById(R.id.idRBCalificacion);

        Intent intent = getIntent();

        //Los datos extras vienen a través del bundle
        Bundle b = intent.getExtras();

        //Si el bundle NO es null
        if(b != null){
            nombreCiudad.setText(b.getString("CIUDAD"));
            nombrePais.setText(b.getString("PAIS"));
            numeroHabitantes.setText(b.getString("HAB"));

            calificacionCiudad.setProgress(b.getInt("CAL"));
        }

    }
}
