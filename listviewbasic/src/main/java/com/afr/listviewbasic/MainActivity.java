package com.afr.listviewbasic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // I - DECLARAR VARIABLES
    private ListView listView;
    private String[] values = {"Manu", "Jose", "Maria", "Eva", "Paco"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // II - ASIGNAMOS LAS VARIABLES
        listView = (ListView) findViewById(R.id.idListView);

        //context: dónde está integrado este objeto. Debido a que el funcionamiento de Android es muy dinámico al pasar de Activity en Activity, con "context" decimos el origen del objeto.
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1);

        listView.setAdapter(adapter);

        //TO-DO: Añadir un "listener"
        //OnItemClickListener() -> Es una clase interna
        //new AdapterView.OnItemClickListener() {} -> Es una clase anónima
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            //Método a implementar y sobreescribir OBLIGATORIAMENTE de la superclase (interfaz o abstracta)
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String texto = "position:"+ position + " Nombre: "+ values[position];
                        texto += " id: "+ id + " view: "+view.getClass().getSimpleName();
                        texto += " parent: "+ parent.getClass().getSimpleName();

                Toast.makeText(getApplicationContext(),texto, Toast.LENGTH_SHORT).show();
            }
        });

        //Si tuviera objeto apuntando, "listener", sería así:
        /*AdapterView.OnItemClickListener listener = new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        };*/
    }
}
