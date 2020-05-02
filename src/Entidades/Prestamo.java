package Entidades;

public class Prestamo {

    private String idPrestamo, cantPrestada, fechaPrestamo;

    public Prestamo(String idPrestamo, String cantPrestada, String fechaPrestamo) {
        this.idPrestamo = idPrestamo;
        this.cantPrestada = cantPrestada;
        this.fechaPrestamo = fechaPrestamo;
    }

    //Getters
    public String getIdPrestamo() {
        return idPrestamo;
    }

    public String getCantPrestada() {
        return cantPrestada;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    //Setters
    public void setIdPrestamo(String idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public void setCantPrestada(String cantPrestada) {
        this.cantPrestada = cantPrestada;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

}
