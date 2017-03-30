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
    Cliente cliente;

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {



        TextView clienteNombre = (TextView)container.findViewById(R.id.nombre);
        clienteNombre.setText(cliente.getNombre());
        TextView clienteSexo = (TextView)container.findViewById(R.id.sexo);
        clienteSexo.setText(cliente.getSexo());
        TextView clienteTelefono = (TextView)container.findViewById(R.id.telefono);
        clienteTelefono.setText(cliente.getTelefono());



        return inflater.inflate(R.layout.detallefragmento, container, false);
    }
}
