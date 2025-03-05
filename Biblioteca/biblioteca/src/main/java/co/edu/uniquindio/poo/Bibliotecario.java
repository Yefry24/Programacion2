package co.edu.uniquindio.poo;

public class Bibliotecario extends Empleado implements GestionInventario{

    public Bibliotecario(String nombre, int idEmpleado) {
        super(nombre, idEmpleado);
    }
    public void gestionarPréstamos() {
        System.out.println("Gestionando préstamos");
    }

    @Override
    public void agregarItem() {
        System.out.println("Agregando libro: " );
    }

    @Override
    public void eliminarItem() {
        System.out.println("Eliminando libro: " );
    }
   
}