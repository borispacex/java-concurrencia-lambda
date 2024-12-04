package org.example;


import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDate fecha = LocalDate.of(2020, Month.NOVEMBER,16);
        LocalTime hora = LocalTime.of(4,15);
        LocalDateTime fechaHora = LocalDateTime.of(fecha,hora);
        System.out.println(fechaHora);

        fechaHora = fechaHora.minusHours(1);
        System.out.println(fechaHora);

        Period duracion = Period.ofDays(1);
        fechaHora = fechaHora.minus(duracion);
        //Opción 1 de formateo
        //DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        //Opción 2 de formateo
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
        System.out.println(formatter.format(fechaHora));

    }


}