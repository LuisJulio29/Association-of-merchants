/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udc.asociacioncomercios.elementos;

import java.util.ArrayList;
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
/**
 *
 * @author cpala
 */
public class ZonaDeDistribucion {
    private String nombre;
    private String Codigo;
    private Comerciante gerente;
    private ArrayList<Comercio> comerciosAsociados;
    private ArrayList<String> barrios;

    public ZonaDeDistribucion() {
    }

    public ZonaDeDistribucion(String nombre, String Codigo) {
        this.nombre = nombre;
        this.Codigo = Codigo;
        this.gerente = new Comerciante("Willian","Malkun Catillejo","2023201","wmalkunc@gmail.com","3005671234","admin123");
        this.comerciosAsociados = new ArrayList<>();
        this.barrios = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public Comerciante getGerente() {
        return gerente;
    }

    public void setGerente(Comerciante gerente) {
        this.gerente = gerente;
    }

    public ArrayList<Comercio> getComerciosAsociados() {
        return comerciosAsociados;
    }

    public void setComerciosAsociados(ArrayList<Comercio> comerciosAsociados) {
        this.comerciosAsociados = comerciosAsociados;
    }

    public ArrayList<String> getBarrios() {
        return barrios;
    }

    public void setBarrios(ArrayList<String> barrios) {
        this.barrios = barrios;
    }
    
    
    public boolean asignarComercio(Comercio c){
        barrios.add(c.getBarrio());
        return comerciosAsociados.add(c);
    }
    
    public boolean designarComercio(Comercio c){
        barrios.remove(c.getBarrio());
        return comerciosAsociados.remove(c);
    }
    
    
    public int cantidadComercios(){
        return comerciosAsociados.size();
    }
    
   
}
