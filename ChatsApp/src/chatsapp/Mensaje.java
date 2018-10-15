/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatsapp;

/**
 *
 * @author alexh
 */
public class Mensaje {
    private String nombre;
    private String mensaje;
    private String fecha;

    public Mensaje(String nombre, String mensaje, String fecha) {
        this.nombre = nombre;
        this.mensaje = mensaje;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
}
