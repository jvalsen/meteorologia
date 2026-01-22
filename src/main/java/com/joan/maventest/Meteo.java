package com.joan.maventest;

import java.util.Objects;

public class Meteo {

    private final String estado;
    private final int temperatura;
    private final int velocidadViento;

    public Meteo(String estado, int temperatura, int velocidadViento) {
        this.estado = estado;
        this.temperatura = temperatura;
        this.velocidadViento = velocidadViento;
    }

    public String getEstado() {
        return estado;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public int getVelocidadViento() {
        return velocidadViento;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Meteo meteo)) return false;
        return temperatura == meteo.temperatura &&
                velocidadViento == meteo.velocidadViento &&
                Objects.equals(estado, meteo.estado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(estado, temperatura, velocidadViento);
    }

    @Override
    public String toString() {
        return "Meteo{" +
                "estado='" + estado + '\'' +
                ", temperatura=" + temperatura +
                ", velocidadViento=" + velocidadViento +
                '}';
    }
}
