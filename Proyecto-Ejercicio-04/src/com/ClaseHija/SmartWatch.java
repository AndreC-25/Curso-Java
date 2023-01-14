package com.ClaseHija;

import com.ClasePadre.SmartDevice;

public class SmartWatch extends SmartDevice {

    boolean frecCardiaca;

    public SmartWatch(String marca, String modelo, int bateria, boolean cargaRapida, boolean cargaInalambrica, int almacenamiento, boolean frecCardiaca) {
        super(marca, modelo, bateria, cargaRapida, cargaInalambrica, almacenamiento);
        this.frecCardiaca = frecCardiaca;
    }

    @Override
    public String toString() {
        return "SmartWatch{ " +
                "marca = '" + marca + '\'' +
                ", modelo = '" + modelo + '\'' +
                ", bateria = " + bateria + " mAh" +
                ", cargaRapida = " + cargaRapida +
                ", cargaInalambrica = " + cargaInalambrica +
                ", almacenamiento = " + almacenamiento + " GB" +
                ", frecCardiaca = " + frecCardiaca +
                '}';
    }
}
