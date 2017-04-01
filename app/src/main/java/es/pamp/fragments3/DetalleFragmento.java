package es.pamp.fragments3;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import modelo.Cliente;

/**
 * Created by cice on 29/3/17.
 */

public class DetalleFragmento extends Fragment {
    Cliente cliente;
    TextView clienteNombre;
    TextView clienteSexo;
    ImageView imageSexo;
    TextView clienteTelefono;

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.detallefragmento, container, false);

        clienteNombre = (TextView)v.findViewById(R.id.nombre);
        imageSexo = (ImageView)v.findViewById(R.id.imageSexo);
        clienteTelefono = (TextView)v.findViewById(R.id.telefono);
        if (cliente!=null){
            clienteNombre.setText(cliente.getNombre());
            imageSexo.setImageResource(cliente.getSexo());
            clienteTelefono.setText(String.valueOf(cliente.getTelefono()));
        }

        return v;
    }
    public void escribeCliente(Cliente cliente){
        clienteNombre.setText(cliente.getNombre());
        clienteTelefono.setText(String.valueOf(cliente.getTelefono()));
        imageSexo.setImageResource(cliente.getSexo());
    }

}
