package es.pamp.fragments3;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import modelo.Cliente;

/**
 * Created by cice on 29/3/17.
 */

public class DetalleFragmento extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        Bundle bundle = get
        Cliente cliente = (Cliente)
        TextView clienteNombre = (TextView)container.findViewById(R.id.nombre);
        clienteNombre.setText(savedInstanceState.);


        /*
        i.putExtra("Nombre",c.getNombre());
        i.putExtra("Telefono",c.getTelefono());
        i.putExtra("Sexo",c.getSexo());


        */
        return inflater.inflate(R.layout.detallefragmento, container, false);
    }
}
