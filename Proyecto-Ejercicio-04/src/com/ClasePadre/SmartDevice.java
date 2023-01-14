package com.ClasePadre;

public class SmartDevice {

    public String marca;
    public String modelo;
    public int bateria;
    public boolean cargaRapida;
    public boolean cargaInalambrica;
    public int almacenamiento;


    public SmartDevice() {}

    public SmartDevice(String marca, String modelo, int bateria, boolean cargaRapida, boolean cargaInalambrica, int almacenamiento) {
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
        this.cargaRapida = cargaRapida;
        this.cargaInalambrica = cargaInalambrica;
        this.almacenamiento = almacenamiento;
    }
}
