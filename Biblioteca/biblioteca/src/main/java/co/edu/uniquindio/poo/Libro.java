package co.edu.uniquindio.poo;

public class Libro {
    private String titulo;
    private String autor;
    private int ISBN;
    private boolean disponible;



    public Libro(){

    }

    public Libro(String titulo, String autor, int ISBN, boolean disponible){
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.disponible = true;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public int getISBN(){
        return ISBN;
    }

    public void setISBN(int ISBN){
    this.ISBN = ISBN;   
    }  
    
    public boolean isDisponible(){
        return disponible;
    }
    public void prestar() { this.disponible = false; }
    public void devolver() { this.disponible = true; }
}
