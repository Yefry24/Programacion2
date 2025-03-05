package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Bibliotecario bibliotecario = new Bibliotecario("Luisa", 1);
        Usuario usuario = new Usuario("Ana", 1);
        
        LibroFisico libro1 = new LibroFisico("Piense y hagase rico","Napoleon Hill",001,true,
                                3);
        LibroDigital libro2 = new LibroDigital("Si lo crees, lo creas","Brian Tracy", 01,true,
                                "PDF",30);

        biblioteca.agregarItem(libro1);
        biblioteca.agregarItem(libro2);
        
        System.out.println("Libros agregados a la biblioteca." + libro1.getTitulo());
        System.out.println("Libros agregados a la biblioteca." + libro2.getTitulo());
        
        Prestamo prestamo = new Prestamo(libro1, usuario, 
                        LocalDate.now(), LocalDate.now().plusDays(14));
        usuario.agregarPrestamo(prestamo);
        bibliotecario.gestionarPréstamos();

        System.out.println("Préstamo realizado para: " + usuario.getNombre());

        
    }
    
}