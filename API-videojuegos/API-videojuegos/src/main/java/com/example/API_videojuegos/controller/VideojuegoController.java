package com.example.API_videojuegos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//1.- Esta clase va a ser de tipo rest - texto - json
@RestController

//2.- Define una ruta para mi API
@RequestMapping("/api/videojuegos")

//metodo
public class VideojuegoController {
    //3.- Responde mediante una solicitud GET (/api/videojuegos/hola)
    @GetMapping("/hola")
    public String saludar(){
        //4.- Retornar un simple saludo de la API VJ
        return "Bienvenidos a mi primera API de videojuegos";
    }

    @GetMapping("/top")
    public Videojuego obtenerVideojuegotop(){
        //Crear un nuevo videojuego y retorno como JSON
        return new Videojuego("The Legends of Zelda: Breath of the Wild", "Nintendo Switch", 10);
    }

    //6.- Crear clase interna simple para representar un videojuego
    static class Videojuego {
        //Atributos
        private String Titulo;
        private String Plataforma;
        private int puntuacion;

        //Constructor
        public Videojuego(String Titulo, String Plataforma, int puntuacion){
            this.Titulo = Titulo;
            this.Plataforma = Plataforma;
            this.puntuacion = puntuacion;
        }

        //get
        public String getTitulo(){
            return Titulo;
        }
        public String getPlataforma(){
            return Plataforma;
        }
        public int getPuntuacion(){
            return puntuacion;
        }
    }
}
