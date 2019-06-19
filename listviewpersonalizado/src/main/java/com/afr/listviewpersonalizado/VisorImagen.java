package com.afr.listviewpersonalizado;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class VisorImagen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visor_imagen);

        ImageView imagen = (ImageView) findViewById(R.id.idImagenGrande);

        Intent intent = getIntent();

        //Los datos extras vienen a través del bundle
        Bundle b = intent.getExtras();

        //Si el bundle NO es null
        if(b != null){
            imagen.setImageResource((b.getInt("IMG")));
        }


        //TO-DO

        //Recoger los datos que nos envía el Intent y mostrar esos datos
    }
}
