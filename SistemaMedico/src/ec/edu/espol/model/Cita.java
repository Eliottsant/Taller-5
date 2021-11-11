/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.model;

import java.time.LocalDateTime;
import ec.edu.espol.model.Pago.*;

/**
 *
 * @author rsgar
 */
public class Cita {
    protected LocalDateTime fecha;
    protected boolean pagada;
    protected String registradoPor;
    protected Paciente paciente;

    public Cita(LocalDateTime fecha, boolean pagada, String registradoPor) {
        this.fecha = fecha;
        this.pagada = pagada;
        this.registradoPor = registradoPor;
    }

    public Cita(LocalDateTime fecha, boolean pagada, String registradoPor, Paciente paciente) {
        this.fecha = fecha;
        this.pagada = pagada;
        this.registradoPor = registradoPor;
        this.paciente = paciente;
    }
    
    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public String getRegistradoPor() {
        return registradoPor;
    }

    public void setRegistradoPor(String registradoPor) {
        this.registradoPor = registradoPor;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
        
    public boolean realizarPago(Pago pago){
        return false;
    }
}
