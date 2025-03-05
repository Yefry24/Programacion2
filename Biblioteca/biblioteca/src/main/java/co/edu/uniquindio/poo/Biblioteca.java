package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca implements Inventario {
    private List<Libro> libros = new ArrayList<>();

    public Biblioteca(){
        
    }


    public Biblioteca(List<Libro> libros) {
        this.libros = libros;
    }
    
    @Override
    public void agregarItem(Libro libro) {
        libros.add(libro);
    }

    @Override
    public void eliminarItem(Libro libro) {
        libros.remove(libro);
    }

}
