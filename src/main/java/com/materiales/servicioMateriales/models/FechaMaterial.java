package com.materiales.servicioMateriales.models;

import java.util.Date;

public class FechaMaterial {

    Date fecha;
    String nombreMaterial;
    
    public FechaMaterial(Date fecha, String nombreMaterial) {
        super();
        this.fecha = fecha;
        this.nombreMaterial = nombreMaterial;
    }
    
    public Date getFecha() {
        return fecha;
    }


    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombreMaterial() {
        return nombreMaterial;
    }
    public void setNombreMaterial(String nombreMaterial) {
        this.nombreMaterial = nombreMaterial;
    }
}
