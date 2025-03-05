package co.edu.uniquindio.poo;

public class LibroDigital extends Libro {
    private String formato;
    private double tamañoArchivo;

   
    public LibroDigital(String titulo, String autor, int ISBN, boolean disponible,
                         String formato, double tamañoArchivo) {                                       
        super(titulo, autor, ISBN, disponible);
        this.formato = formato;
        this.tamañoArchivo = tamañoArchivo;
    }
    public String getFormato(){
        return formato;
    }

    public void setFormato(String formato){
        this.formato = formato;
    }

    public double getTamañoArchivo(){
        return tamañoArchivo;
    }

    public void setTamañoArchivo(double tamañoArchivo){
        this.tamañoArchivo = tamañoArchivo;
    }
}    

