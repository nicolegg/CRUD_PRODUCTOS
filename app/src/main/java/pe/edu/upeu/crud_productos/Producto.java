package pe.edu.upeu.crud_productos;

public class Producto {
    int idproducto;
    String nombre;
    int cantidad;
    int precio;

    public Producto() {
    }

    public Producto(int idproducto) {
        this.idproducto = idproducto;
    }

    public Producto(int idproducto, String nombre, int cantidad, int precio) {
        this.idproducto = idproducto;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
