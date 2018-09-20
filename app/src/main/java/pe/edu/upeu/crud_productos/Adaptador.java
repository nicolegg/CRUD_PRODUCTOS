package pe.edu.upeu.crud_productos;

import android.app.Activity;
import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptador extends BaseAdapter {
    ArrayList<Producto> lista;
    ProductoDAO dao;
    Producto p;
    Activity a;

    public Adaptador(Activity a,ArrayList<Producto> lista,ProductoDAO dao){
        this.lista=lista;
        this.a=a;
        this.dao=dao;
    }
    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Producto getItem(int i) {
        p=lista.get(i);
        return null;
    }

    @Override
    public long getItemId(int i) {
        p=lista.get(i);
        return p.getIdproducto();
    }

    @Override
    public View getView(int posicion, View view, ViewGroup viewGroup) {
        View v = view;
        if(v!=null){
            LayoutInflater li=(LayoutInflater) a.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v=li.inflate(R.layout.lista_productos,null);
        }
        p = lista.get(posicion);
        TextView nombre = (TextView) v.findViewById(R.id.tvnombre);
        TextView cantidad = (TextView) v.findViewById(R.id.tvcantidad);
        TextView precio = (TextView) v.findViewById(R.id.tvprecio);
        Button editar = (Button) v.findViewById(R.id.btneditar);
        Button eliminar = (Button) v.findViewById(R.id.btneliminar);
        nombre.setText(p.getNombre());
        cantidad.setText(p.getCantidad());
        precio.setText(p.getPrecio());
        editar.setTag(posicion);
        eliminar.setTag(posicion);
        editar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });
        eliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        return v;
    }
}
