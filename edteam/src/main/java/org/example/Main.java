package org.example;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) {

        String pais = "ES";
        String idioma = "es";
        Locale localidad = new Locale(idioma,pais);
        ResourceBundle mensajes = ResourceBundle.getBundle("lang",localidad);
        System.out.println(mensajes.getString("edteam.lunch"));
        System.out.println(mensajes.getString("edteam.kamekameha"));

    }

}