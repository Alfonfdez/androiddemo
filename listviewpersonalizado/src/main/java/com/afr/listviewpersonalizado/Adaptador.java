package com.afr.listviewpersonalizado;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class Adaptador extends BaseAdapter {

    private static LayoutInflater inflater = null;

    //Atributos
    private Context contexto;
    private String[][] datos;
    private int[] imagenes;

    //Constructor
    public Adaptador(Context contexto, String[][] datos, int[] imagenes){
        this.contexto = contexto;
        this.datos = datos;
        this.imagenes = imagenes;
        inflater = (LayoutInflater) contexto.getSystemService(contexto.LAYOUT_INFLATER_SERVICE);
    }

    //Métodos a implementar
    @Override
    public int getCount() {
        return imagenes.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {

        final View vista = inflater.inflate(R.layout.elemento_lista, null);

        TextView nombreCiudad = (TextView) vista.findViewById(R.id.idTextViewNombreCiudad);
        TextView pais = (TextView) vista.findViewById(R.id.idTextViewPais);
        TextView numeroHabitantes = (TextView) vista.findViewById(R.id.idTextViewHabitantes);

        ImageView imagen = (ImageView) vista.findViewById(R.id.idImagen);
        RatingBar calificacion = (RatingBar) vista.findViewById(R.id.idRatingBarCiudad);


        nombreCiudad.setText(datos[i][0]);
        pais.setText(datos[i][1]);
        numeroHabitantes.setText(datos[i][2]);

        imagen.setImageResource(imagenes[i]);
        calificacion.setProgress(Integer.valueOf(datos[i][3]));

        //Para cuando hagamos clic en el item y veamos la ficha completa
        imagen.setTag(i);
        nombreCiudad.setTag(i);
        pais.setTag(i);
        numeroHabitantes.setTag(i);
        calificacion.setTag(i);

        // b) Podríamos hacerlo así
        //imagen.setTag(imagenes[i]);


        //Nuevas líneas de código
        //Crearemos un 'listener', cuando hacemos clic en la imagen, con una clase anónima con su método (abstracto) a implementar ahora
        imagen.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(contexto, VisorImagen.class);

                intent.putExtra("IMG", imagenes[(Integer) v.getTag()]);

                // b) Podríamos hacerlo así
                //intent.putExtra("IMG", (Integer) v.getTag());

                contexto.startActivity(intent);
            }
        });


        //Nuevas líneas de código
        //Crearemos un 'listener', cuando hacemos clic en la imagen, con una clase anónima con su método (abstracto) a implementar ahora
        nombreCiudad.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(contexto, VisorDetalles.class);

                intent.putExtra("CIUDAD", datos[(Integer) v.getTag()][0]);
                intent.putExtra("PAIS", datos[(Integer) v.getTag()][1]);
                intent.putExtra("HAB", datos[(Integer) v.getTag()][2]);
                intent.putExtra("CAL", datos[(Integer) v.getTag()][3]);

                contexto.startActivity(intent);
            }
        });

        pais.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(contexto, VisorDetalles.class);

                intent.putExtra("CIUDAD", datos[(Integer) v.getTag()][0]);
                intent.putExtra("PAIS", datos[(Integer) v.getTag()][1]);
                intent.putExtra("HAB", datos[(Integer) v.getTag()][2]);
                intent.putExtra("CAL", datos[(Integer) v.getTag()][3]);

                contexto.startActivity(intent);
            }
        });

        numeroHabitantes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(contexto, VisorDetalles.class);

                intent.putExtra("CIUDAD", datos[(Integer) v.getTag()][0]);
                intent.putExtra("PAIS", datos[(Integer) v.getTag()][1]);
                intent.putExtra("HAB", datos[(Integer) v.getTag()][2]);
                intent.putExtra("CAL", datos[(Integer) v.getTag()][3]);

                contexto.startActivity(intent);
            }
        });

        calificacion.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(contexto, VisorDetalles.class);

                intent.putExtra("CIUDAD", datos[(Integer) v.getTag()][0]);
                intent.putExtra("PAIS", datos[(Integer) v.getTag()][1]);
                intent.putExtra("HAB", datos[(Integer) v.getTag()][2]);
                intent.putExtra("CAL", datos[(Integer) v.getTag()][3]);

                contexto.startActivity(intent);
            }
        });


        return vista;
    }
}
