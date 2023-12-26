/**
 * 
 */
package com.soa.business;

import org.springframework.stereotype.Component;

import com.soa.dto.Persona;
import com.soa.dto.Respuesta;

/**
 * Clase para concatenación de datos personales.
 */
@Component
public class ConcatenarBusiness {
    
    /*
     * Forma el nombre completo de una persona.
     * @param persona Persona recibida.
     * @return Respuesta con el nombre completo.
     */
    public Respuesta formarNombre(Persona persona) {
        Respuesta respuesta = new Respuesta();
        respuesta.setNombreCompleto(String.format("%s %s", persona.getNombre(), 
                persona.getApellidoPaterno()));
        return respuesta;
    }
}
