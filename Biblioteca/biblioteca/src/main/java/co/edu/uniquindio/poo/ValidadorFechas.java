package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class ValidadorFechas implements ValidadorFechasInterface {
    @Override
    public boolean esFechaValida(LocalDate inicio, LocalDate fin) {
        return inicio != null && fin != null && !fin.isBefore(inicio);
    }
}
