package es.pamp.fragments3;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import modelo.Cliente;

public class MainActivity extends AppCompatActivity {
    private boolean vertical;
    private DetalleFragmento detalleFragmento;
    private FragmentTransaction transaction;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getFragmentManager();
        transaction = fragmentManager.beginTransaction();

        FrameLayout fl = (FrameLayout)findViewById(R.id.detalle); //Para comprobar si existe

        if (fl!=null) { //Comprueba si existe el framelayout, si existe la vista es horizontal
            detalleFragmento = new DetalleFragmento();
            transaction.replace(R.id.detalle, detalleFragmento);
            vertical=false;
        }else{
            vertical=true;
        }

        ListadoFragmento listadoFragmento = new ListadoFragmento();
        listadoFragmento.setActivity(this); // Se pasa el puntero de MainActivity a listado fragmento
        transaction.replace(R.id.listado, listadoFragmento);
        transaction.commit();



    }

    public void verDetalle(Cliente c){
        if (vertical){ //llama a main activity 2
            Intent i = new Intent(getApplicationContext(), Main2Activity.class);
            i.putExtras(c.getBundle());

            startActivity(i);
        }else{ // genera un nuevo fragment, lo carga de datos y lo reemplaza
            fragmentManager = getFragmentManager();
            transaction = fragmentManager.beginTransaction();
            detalleFragmento = new DetalleFragmento();
            transaction.replace(R.id.detalle, detalleFragmento);

            detalleFragmento.setCliente(c);

            transaction.commit();

        }

    }

}