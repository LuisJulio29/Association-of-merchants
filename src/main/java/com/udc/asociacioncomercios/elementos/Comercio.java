/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udc.asociacioncomercios.elementos;
/************************************************************************
Palabra de honor:
* No he discutido ni mostrado el código de mi programa con alguien que no sea mi compañero,
* Profesor o con el monitor asignado a este curso.
*
* No he utilizado código obtenido de otro u otros estudiantes,
* O cualquier otra fuente no autorizada, ya sea modificado o sin modificar.
*
* Si cualquier código o documentación utilizada en mi programa
* Fue obtenido de otra fuente, tal como un libro de texto o notas del curso
* debe ser claramente señalado con una cita apropiada en
* los comentarios de mi programa.
*
* <Luis Eduardo Julio Padilla - 0222020021>
*<Jesús David Blanco Julio -0222020019>
************************************************** *********************/
import java.util.ArrayList;

/**
 *
 * @author cpala
 */
public class Comercio {
    private String nombre;
    private String telefono;
    private String email;
    private String tipo;
    private String barrio;
    private String direccion;
    private ArrayList<Comerciante> comerciantes;

    public Comercio() {
    }

    public Comercio(String nombre, String telefono, String email, String tipo, String barrio, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.tipo = tipo;
        this.barrio = barrio;
        this.direccion = direccion;
        this.comerciantes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}
