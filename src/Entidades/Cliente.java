package Entidades;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nombre, id, numeroCelular, direccion;
    List<Prestamo> lPrestamos;

    public Cliente(String nombre, String id, String numeroCelular, String direccion) {
        this.nombre = nombre;
        this.id = id;
        this.numeroCelular = numeroCelular;
        this.direccion = direccion;
        this.lPrestamos = new ArrayList<>();
    }

    //Metodos propios
    public void agregarPrestamoLista(Prestamo prestamo) {
        this.lPrestamos.add(prestamo);
    }

    //Metodos Getters
    public List<Prestamo> getlPrestamos() {
        return lPrestamos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public String getDireccion() {
        return direccion;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
