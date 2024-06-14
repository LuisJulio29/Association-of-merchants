/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udc.asociacioncomercios.elementos;

/**
 *
 * @author cpala
 */
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
public class Comerciante {
    private String nombre;
    private String apellido;
    private String idComerciante;
    private String email;
    private String telefono;
    private String clave;

    public Comerciante() {
    }

    public Comerciante(String nombre, String apellido, String idComerciante, String email, String telefono, String clave) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.idComerciante = idComerciante;
        this.email = email;
        this.telefono = telefono;
        this.clave = clave;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getIdComerciante() {
        return idComerciante;
    }

    public void setIdComerciante(String idComerciante) {
        this.idComerciante = idComerciante;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
}
