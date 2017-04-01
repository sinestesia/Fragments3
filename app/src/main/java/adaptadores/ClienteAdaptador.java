package adaptadores;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

import es.pamp.fragments3.R;
import modelo.Cliente;

/**
 * Created by cice on 23/3/17.
 */

public class ClienteAdaptador extends ArrayAdapter<Cliente> implements AdapterView.OnItemClickListener {
    private Context contexto;
    private List<Cliente> data;
    private View.OnClickListener listener;
    private View row;


    public ClienteAdaptador(@NonNull Context context, @LayoutRes int resource, @NonNull List<Cliente> objects) {
        super(context, resource, objects);
        contexto= context;
        data=objects;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater intflater = LayoutInflater.from(contexto);
        row = intflater.inflate(R.layout.cliente,null);
        //row.setOnClickListener(this);
        ImageView clienteSexo=(ImageView) row.findViewById(R.id.imageViewSexo);
        TextView  clienteNombre =(TextView) row.findViewById(R.id.nombre);
        TextView  clienteTelefono =(TextView) row.findViewById(R.id.telefono);
        clienteSexo.setImageResource(data.get(position).getSexo());
        clienteNombre.setText(data.get(position).getNombre());
        clienteTelefono.setText(Integer.toString(data.get(position).getTelefono()));

        return row;

    }

    public void setListener(View.OnClickListener listener) {
        this.listener = listener;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if(listener!=null) {
            listener.onClick(view);
        }
    }
}
