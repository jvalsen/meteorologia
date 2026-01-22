package com.joan.maventest;

import com.google.gson.Gson;

import java.util.Random;

public class ServicioMeteo {

    private static final String[] ESTADOS = {"soleado", "nublado", "lluvia"};
    private static final Random random = new Random();
    private static final Gson gson = new Gson();

    public static String getMeteo() {

        String estado = ESTADOS[random.nextInt(ESTADOS.length)];
        int temperatura = random.nextInt(41) - 5;   // -5 ºC a 35 ºC
        int velocidadViento = random.nextInt(81);   // 0 a 80 km/h

        Meteo meteo = new Meteo(estado, temperatura, velocidadViento);

        return gson.toJson(meteo);
    }
}
