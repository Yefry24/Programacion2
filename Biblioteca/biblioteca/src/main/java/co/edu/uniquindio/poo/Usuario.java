package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private int IDUsuario;
    private List<Prestamo> prestamosActivos;


    public Usuario(){

    }

    public Usuario(String nombre, int IDUsuario){
        this.nombre = nombre;
        this.IDUsuario = IDUsuario;
        this.prestamosActivos = new ArrayList<>();
    }

    public void agregarPrestamo(Prestamo prestamo) {
        prestamosActivos.add(prestamo);
    }    

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getIDUsuario(){
        return IDUsuario;
    }

    public void setIDUsuario(int IDUsuario){
        this.IDUsuario = IDUsuario;
    }

}
