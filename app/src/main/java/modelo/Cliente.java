package modelo;

import android.os.Bundle;

import java.io.Serializable;

/**
 * Created by cice on 23/3/17.
 */

public class Cliente implements Serializable{
    private String nombre;
    private int sexo;
    private int telefono;

    public Cliente(String nombre, int sexo, int telefono) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.telefono = telefono;
    }

    public Cliente(Bundle b){
       nombre =  b.getString("nombre");
        sexo = b.getInt("sexo");
        telefono = b.getInt("telefono");

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Bundle getBundle(){
        Bundle b = new Bundle();
        b.putString("nombre", nombre);
        b.putInt("sexo", sexo);
        b.putInt("telefono", telefono);

        return b;
    }
}
