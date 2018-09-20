package pe.edu.upeu.crud_productos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class ProductoDAO {
    SQLiteDatabase cx;
    ArrayList<Producto> lista;
    Producto p;
    Context ct;
    String nombreBD = "BDProductos";
    String tabla="create table if not exists producto(idproducto integer primary key autoincrement, nombre text, cantidad integer, precio integer)";

    public ProductoDAO(Context c){
        this.ct=c;
        cx=c.openOrCreateDatabase(nombreBD, Context.MODE_WORLD_WRITEABLE,null);
        cx.execSQL(tabla);
    }
    public boolean insertar(Producto p){
        return true;
    }

    public boolean eliminar(int idproducto){
        return true;
    }

    public boolean editar(Producto p){
        return true;
    }

    public ArrayList<Producto> ReadAll(){
        return lista;
    }
    public Producto verUno(int id){
        return p;
    }

}
