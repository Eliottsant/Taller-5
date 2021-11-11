/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.model;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author rsgar
 */
public class Receta {
    protected LocalDateTime fecha;
    protected PlanNutricional plan;
    protected ArrayList<Medicamento> medicamentos;

    public Receta(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Receta(LocalDateTime fecha, PlanNutricional plan, ArrayList<Medicamento> medicamentos) {
        this.fecha = fecha;
        this.plan = plan;
        this.medicamentos = medicamentos;
    }
    
    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public PlanNutricional getPlan() {
        return plan;
    }

    public void setPlan(PlanNutricional plan) {
        this.plan = plan;
    }

    public ArrayList<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(ArrayList<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }
    
}
