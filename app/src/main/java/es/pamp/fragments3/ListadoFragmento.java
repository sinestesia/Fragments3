package es.pamp.fragments3;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import adaptadores.ClienteAdaptador;
import modelo.Cliente;


/**
 * Created by cice on 29/3/17.
 */

public class ListadoFragmento extends Fragment {
    MainActivity activity;

    public void setActivity(MainActivity activity) {
        this.activity = activity;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable final ViewGroup container, Bundle savedInstanceState) {
            View view;
            view = inflater.inflate(R.layout.listadofragmento, container, false);
            final List<Cliente> data = getData();
            ClienteAdaptador adaptador = new ClienteAdaptador(container.getContext(), R.layout.cliente,data);
            ListView clienteLV = (ListView) view.findViewById(R.id.clientes);
            clienteLV.setAdapter(adaptador);

            adaptador.setListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Cliente c  = data.get(0);
                    activity.verDetalle(c);

                }
            });
            clienteLV.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Cliente c  = data.get(position);
                activity.verDetalle(c);

            }
            });


        return view;
    }
    private List<Cliente> getData(){
        List<Cliente> list = new ArrayList<>();
        list.add(new Cliente("Alex",R.drawable.male,555555555));
        list.add(new Cliente("María",R.drawable.female,123456789));
        list.add(new Cliente("Luis",R.drawable.male,525355325));
        list.add(new Cliente("Sonia",R.drawable.female,000000000));
        list.add(new Cliente("Adolfo",R.drawable.male,555857345));
        list.add(new Cliente("Rocio",R.drawable.female,555612900));
        list.add(new Cliente("Clara",R.drawable.female,555975372));
        list.add(new Cliente("Antonio",R.drawable.male,555789345));
        return list;
        };

}
