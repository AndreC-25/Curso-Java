package com.ClaseHija;

import com.ClasePadre.SmartDevice;

public class SmartPhone extends SmartDevice {

    public boolean camara;

    @Override
    public String toString() {
        return "SmartPhone{ " +
                "marca = '" + marca + '\'' +
                ", modelo = '" + modelo + '\'' +
                ", bateria = " + bateria + " mAh" +
                ", cargaRapida = " + cargaRapida +
                ", cargaInalambrica = " + cargaInalambrica +
                ", almacenamiento = " + almacenamiento + " GB" +
                ", camara = " + camara + " " +
                '}';
    }
}
