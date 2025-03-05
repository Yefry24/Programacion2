package co.edu.uniquindio.poo;

public class LibroFisico extends Libro {
    private int cantidadDisponible;

    public LibroFisico(String titulo, String autor, int ISBN, boolean disponible,
                         int cantidadDisponible) {
        super(titulo, autor, ISBN, disponible);
        this.cantidadDisponible = cantidadDisponible;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible){
        this.cantidadDisponible = cantidadDisponible;
    }

}
