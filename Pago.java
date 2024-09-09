/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pagounp;

/**
 *
 * @author Johnfer
 */
public class Pago {
    private final String tipoTarjeta;
    private final double monto;
    private final String numeroTarjeta;
    private final String fechaVencimiento;
    private final String codigoSeguridad;
    private final String codigoEstudiante;
    private final String codigoTransaccion;

    public Pago(String tipoTarjeta, double monto, String numeroTarjeta, String fechaVencimiento, String codigoSeguridad, String codigoEstudiante) {
        this.tipoTarjeta = tipoTarjeta;
        this.monto = monto;
        this.numeroTarjeta = numeroTarjeta;
        this.fechaVencimiento = fechaVencimiento;
        this.codigoSeguridad = codigoSeguridad;
        this.codigoEstudiante = codigoEstudiante;
        this.codigoTransaccion = generarCodigoTransaccion();
    }

    private String generarCodigoTransaccion() {
        return "TXN" + (int)(Math.random() * 100000);
    }

    public String getCodigoTransaccion() { return codigoTransaccion; }
    public String getCodigoEstudiante() { return codigoEstudiante; }
    public double getMonto() { return monto; }
    public String getTipoTarjeta() { return tipoTarjeta; }
    public String numeroTarjeta() { return numeroTarjeta; }
    public String fechaVencimiento() { return fechaVencimiento; }
    public String codigoSeguridad() { return codigoSeguridad; }

    @Override
    public String toString() {
        return "Pago con tarjeta " + tipoTarjeta + "\nMonto: $" + monto + 
               "\nCódigo de transacción: " + codigoTransaccion +
               "\nCódigo de estudiante: " + codigoEstudiante;
    }
}
