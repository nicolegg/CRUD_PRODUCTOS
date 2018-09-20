package pe.edu.upeu.crud_productos;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ProductoDAO dao;
    Adaptador adaptador;
    ArrayList<Producto> lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dao = new ProductoDAO(this);
        lista=dao.ReadAll();
        adaptador= new Adaptador(this,lista,dao);
        ListView list =(ListView)findViewById(R.id.lvlista);
        Button agregar = (Button) findViewById(R.id.btnagregar);
        list.setAdapter(adaptador);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });

        agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog dialog= new Dialog(MainActivity.this);
                dialog.setTitle("Nuevo Registro");
                dialog.setCancelable(true);
                dialog.setContentView(R.layout.datos);
                dialog.show();
                EditText nombre= (EditText) findViewById(R.id.txtnombre);
                EditText cantidad= (EditText) findViewById(R.id.txtcantidad);
                EditText precio= (EditText) findViewById(R.id.txtprecio);
                Button agregar = (Button) findViewById(R.id.btnagregar);
                Button cancelar = (Button) findViewById(R.id.btncancelar);
                agregar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                    }
                });
                cancelar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                    }
                });
            }
        });
    }
}
