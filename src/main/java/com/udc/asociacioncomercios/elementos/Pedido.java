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
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author cpala
 */
public class Pedido {
    private String idPedido;
    private Cliente cliente;
    private LocalDateTime fechaPedido;
    private LocalDateTime fechaEnvio;
    private Comercio comercio;
    private ArrayList<Producto> productos = new ArrayList<>();

    public Pedido() {
    }

    public Pedido(String idPedido, Cliente cliente, LocalDateTime fechaPedido, LocalDateTime fechaEnvio) {
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.fechaPedido = fechaPedido;
        this.fechaEnvio = fechaEnvio;
    }
    
    public Pedido(String idPedido, Cliente cliente, LocalDateTime fechaPedido, LocalDateTime fechaEnvio,Comercio comercio) {
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.fechaPedido = fechaPedido;
        this.fechaEnvio = fechaEnvio;
        this.comercio = comercio;
    }

    public String getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDateTime getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(LocalDateTime fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public LocalDateTime getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(LocalDateTime fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public Comercio getComercio() {
        return comercio;
    }

    public void setComercio(Comercio comercio) {
        this.comercio = comercio;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    
    public void agregarProducto(Producto p){
        productos.add(p);
    }
    
    public String convertirFechaPedidoAString(){
         DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
         return fechaPedido.format(formateador);
    }
    
    public String convertirFechaEnvioAString(){
         DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
         return fechaEnvio.format(formateador);
    }
    
}
