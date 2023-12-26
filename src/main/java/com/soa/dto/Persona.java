/**
 * 
 */
package com.soa.dto;

import com.google.gson.Gson;

/**
 * Clase que modela la informacion resumida de una persona
 */
public class Persona {
    /* Nombre de la persona */
    private String nombre;
    /* Apellido de la persona */
    private String apellidoPaterno;
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }
    
    @Override /*sobreescritura*/
    public String toString() {
        Gson gson = new Gson();
        String json = gson.toJson(this);
        return json;
    }
}
