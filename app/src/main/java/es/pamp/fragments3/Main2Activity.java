package es.pamp.fragments3;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

import modelo.Cliente;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Intent i = getIntent();

        Cliente c = new Cliente(i.getExtras());

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        //FrameLayout fl = (FrameLayout)findViewById(R.id.detalle);

        DetalleFragmento detalleFragmento = new DetalleFragmento();
        transaction.replace(R.id.detalle, detalleFragmento);

        detalleFragmento.setCliente(c);

        transaction.commit();
    }
}
