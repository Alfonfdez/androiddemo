package com.afr.listviewpaises;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
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

        TextView nombrePais = (TextView) vista.findViewById(R.id.idTextViewNombrePais);
        TextView nombreContinente = (TextView) vista.findViewById(R.id.idTextViewNombreContinente);

        ImageView imagenBandera = (ImageView) vista.findViewById(R.id.idImagenBandera);

        nombrePais.setText(datos[i][0]);
        nombreContinente.setText(datos[i][1]);

        imagenBandera.setImageResource(imagenes[i]);

        //Para cuando hagamos clic en el item y veamos la ficha completa
        imagenBandera.setTag(i);


        return vista;
    }
}
