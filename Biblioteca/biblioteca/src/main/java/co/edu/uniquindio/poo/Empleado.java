package co.edu.uniquindio.poo;

public class Empleado {
    private String nombre;
    private int IDEmpleado;

    public Empleado(){

    }

    public Empleado(String nombre, int IDEmpleado){
        this.nombre = nombre;
        this.IDEmpleado = IDEmpleado;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getIDEmpleado(){
        return IDEmpleado;
    }

    public void setIDEmpleado(int IDEmpleado){
        this.IDEmpleado = IDEmpleado;
    }
}

