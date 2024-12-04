package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<User> lista = new ArrayList<>();
        lista.add(new User("Lucas","López","joselopez@correo.com"));
        lista.add(new User("Pedro","Sánchez","pedrosanchez@correo.com"));
        lista.add(new User("Juan","Vázquez","juanvazquez@correo.com"));
        lista.sort((User userA,User userB) -> userA.getEmail().compareTo(userB.getEmail()));
        lista.forEach(user -> {
            if(user.getNombre() == "Lucas"){
                System.out.println("Hola "+user.getNombre());
            }else{
                System.out.println(user.getNombre());
            }
        });

    }

}