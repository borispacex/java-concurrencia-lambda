package org.example;

import java.util.HashMap;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        Optional album = getAlbum("Random Access Memories");
        if(album.isPresent()){
            System.out.println("Se encontró el album");
        }else{
            System.out.println("No se encontró :(");
        }

    }

    private static Optional<Album> getAlbum(String nombre) {
        HashMap lista = new HashMap<>();
        lista.put("Thriller",new Album("Thriller","Michael Jackson","Epic Records"));
        lista.put("Pasadena",new Album("Pasadena","Guns N Roses","Epic Records"));
        lista.put("Meteora",new Album("Meteora","Linkin park","Epic Records"));
        Optional album = Optional.empty();
        if(lista.containsKey(nombre)){
            album = Optional.of(lista.get(nombre));
        }
        return album;
    }

}