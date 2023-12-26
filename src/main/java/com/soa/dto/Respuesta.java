/**
 * 
 */
package com.soa.dto;

import com.google.gson.Gson;

/**
 * Clase que modela la informacion resumida de una persona
 */
public class Respuesta{
    /* Nombre completo de la persona */
    private String nombreCompleto;

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    
    @Override /*sobreescritura*/
    public String toString() {
        Gson gson = new Gson();
        String json = gson.toJson(this);
        return json;
    }
}
