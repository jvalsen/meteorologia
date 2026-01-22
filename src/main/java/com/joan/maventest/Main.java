package com.joan.maventest;

import com.google.gson.Gson;

public class Main {

    public static void main(String[] args) {

        Gson gson = new Gson();

        // Obtener JSON meteorológico
        String jsonMeteo = ServicioMeteo.getMeteo();
        System.out.println("JSON generado:");
        System.out.println(jsonMeteo);

        // Reconstruir objeto desde JSON
        Meteo meteo = gson.fromJson(jsonMeteo, Meteo.class);
        System.out.println("Objeto Meteo:");
        System.out.println(meteo);
    }
}
