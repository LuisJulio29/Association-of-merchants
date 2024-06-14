/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.udc.asociacioncomercios.app;

import com.udc.asociacioncomercios.elementos.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cpala
 */
public class Datos {
    
    private static Datos d = new Datos();
    
    
    private ArrayList<Comercio> listaComercios = new ArrayList<>();
    private ArrayList<Proveedor> listaProveedores = new ArrayList<>();
    private ArrayList<ZonaDeDistribucion> listaZonas = new ArrayList<>();
    private ArrayList<Producto> listaProductos = new ArrayList<>();
    private ArrayList<Comerciante> listaComerciantes = new ArrayList<>();
    private ArrayList<Pedido> listaPedidos = new ArrayList<>();
    private ArrayList<Cliente> listaClientes = new ArrayList<>();
    
    String[] columnasComercio = {"Nombre", "Tipo","Telefono","Email","Barrio","Editar"};
    String[] columnasProveedor = {"Nombre", "NIT","Telefono","Email","Editar"};
    String[] columnasZonaDeDistribucion = {"Nombre", "Codigo","Editar","Barrios","Comercios"};
    String[] columnasComercio2 = {"Nombre", "Tipo","Telefono","Email","Eliminar"};
    String[] columnasBarrios = {"Barrio", "Eliminar"};
    String[] columnasProducto = {"Nombre","Codigo","Categoria","Stock","Precio Und.","Editar"};
    String[] columnasComerciante = {"Nombres","Apellidos","Email","Telefono","Editar"};
    String[] columnasCliente = {"Nombres","Apellidos","No. Documento","Email","Telefono","Editar"};
    String[] columnasProductos2 = {"Nombre","Cantidad"};
    String[] columnasPedidos = {"ID","Fecha Envio","Cliente","Comercio","Ver Pedido"};
    private DefaultTableModel modComercio = new DefaultTableModel(null, columnasComercio);
    private DefaultTableModel modProveedor = new DefaultTableModel(null, columnasProveedor);
    private DefaultTableModel modZona = new DefaultTableModel(null, columnasZonaDeDistribucion);
    private DefaultTableModel modAsComercio = new DefaultTableModel(null, columnasComercio2);
    private DefaultTableModel modAsBarrio = new DefaultTableModel(null, columnasBarrios);
    private DefaultTableModel modProducto = new DefaultTableModel(null, columnasProducto);
    private DefaultTableModel modComerciante = new DefaultTableModel(null, columnasComerciante);
    private DefaultTableModel modCliente = new DefaultTableModel(null, columnasCliente);
    private DefaultTableModel modProductoPedido = new DefaultTableModel(null, columnasProductos2);
    private DefaultTableModel modPedido = new DefaultTableModel(null, columnasPedidos);
    
    DefaultComboBoxModel<String> selectComercios = new DefaultComboBoxModel<>();
    DefaultComboBoxModel<String> selectClientes = new DefaultComboBoxModel<>();
    DefaultComboBoxModel<String> selectProductos = new DefaultComboBoxModel<>();
    private Datos(){
        cuentaGerente();
    }
    
    public static Datos getD(){
        return d;
    }

    public ArrayList<Comercio> getListaComercios() {
        return listaComercios;
    }

    public ArrayList<Proveedor> getListaProveedores() {
        return listaProveedores;
    }

    public ArrayList<ZonaDeDistribucion> getListaZonas() {
        return listaZonas;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public ArrayList<Comerciante> getListaComerciantes() {
        return listaComerciantes;
    }

    public ArrayList<Pedido> getListaPedidos() {
        return listaPedidos;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }
    
    public boolean agregarComercio(Comercio c){
        return listaComercios.add(c);
    }
    
    public boolean agregarProveedor(Proveedor pr){
        return listaProveedores.add(pr);
    }
    
    public boolean agregarZonaDeDistribucion(ZonaDeDistribucion z){
        return listaZonas.add(z);
    }
    
    public boolean agregarProducto(Producto p){
        return listaProductos.add(p);
    }

    public boolean agregarComerciante(Comerciante c){
        return listaComerciantes.add(c);
    }

    public boolean agregarPedido(Pedido p){
        return listaPedidos.add(p);
    }

    public boolean agregarCilente(Cliente c){
        return listaClientes.add(c);
    }
    
    public Comerciante buscarComerciantePorId(String id){
        for(Comerciante c: listaComerciantes){
            if(c.getIdComerciante().equals(id)){
                return c;
            }
        }
        return null;
    } 
    
    public Comercio buscarComercioPorNombre(String n){
        for(Comercio c: listaComercios){
            if(c.getNombre().equals(n)){
                return c;
            }
        }
        return null;
    } 
    
    public Producto buscarProductoPorNombre(String n){
        for(Producto p: listaProductos){
            if(p.getNombre().equals(n)){
                return p;
            }
        }
        return null;
    }
    
    public Cliente buscarClientePorNombre(String n){
        for(Cliente c: listaClientes){
            if(c.getNombre().equals(n)){
                return c;
            }
        }
        return null;
    }
    
    public Cliente buscarClientePorDocumento(String n){
        for(Cliente c: listaClientes){
            if(c.getDocumento().equals(n)){
                return c;
            }
        }
        return null;
    }
    
    public void ordenarZonas(){
         Collections.sort(listaZonas, Comparator.comparingInt(ZonaDeDistribucion::cantidadComercios).reversed());
          for (ZonaDeDistribucion zona : listaZonas) {
            System.out.println(zona.getNombre() + ": " + zona.cantidadComercios() + " comercios");
        }
    }

    public DefaultTableModel getModPedido() {
        return modPedido;
    }

    public void setModPedido(DefaultTableModel modPedido) {
        this.modPedido = modPedido;
    }
    
    

    public DefaultTableModel getModComercio() {
        return modComercio;
    }

    public DefaultTableModel getModProveedor() {
        return modProveedor;
    }

    public void setModProveedor(DefaultTableModel modProveedor) {
        this.modProveedor = modProveedor;
    }

    public DefaultTableModel getModZona() {
        return modZona;
    }

    public void setModZona(DefaultTableModel modZona) {
        this.modZona = modZona;
    }
    
    public void setModComercio(DefaultTableModel modComercio) {
        this.modComercio = modComercio;
    } 

    public DefaultTableModel getModAsComercio() {
        return modAsComercio;
    }

    public void setModAsComercio(DefaultTableModel modAsComercio) {
        this.modAsComercio = modAsComercio;
    }

    public DefaultTableModel getModAsBarrio() {
        return modAsBarrio;
    }

    public void setModAsBarrio(DefaultTableModel modAsBarrio) {
        this.modAsBarrio = modAsBarrio;
    }

    public DefaultTableModel getModProducto() {
        return modProducto;
    }

    public void setModProducto(DefaultTableModel modProducto) {
        this.modProducto = modProducto;
    }

    public DefaultTableModel getModComerciante() {
        return modComerciante;
    }

    public void setModComerciante(DefaultTableModel modComerciante) {
        this.modComerciante = modComerciante;
    }

    public DefaultTableModel getModCliente() {
        return modCliente;
    }

    public void setModCliente(DefaultTableModel modCliente) {
        this.modCliente = modCliente;
    }

    public DefaultTableModel getModProductoPedido() {
        return modProductoPedido;
    }

    public void setModProductoPedido(DefaultTableModel modProductoPedido) {
        this.modProductoPedido = modProductoPedido;
    }
    
    

    public DefaultComboBoxModel<String> getSelectClientes() {
        return selectClientes;
    }

    public void setSelectClientes(DefaultComboBoxModel<String> selectClientes) {
        this.selectClientes = selectClientes;
    }

    public DefaultComboBoxModel<String> getSelectProductos() {
        return selectProductos;
    }

    public void setSelectProductos(DefaultComboBoxModel<String> selectProductos) {
        this.selectProductos = selectProductos;
    }
    
    public DefaultComboBoxModel<String> getSelectComercios() {
        return selectComercios;
    }

    public void setSelectComercios(DefaultComboBoxModel<String> selectComercios) {
        this.selectComercios = selectComercios;
    }
    
    public void agregarFilaPedido(String id, String fecha, String cliente, String comercio, String editar){
        modPedido.addRow(new Object[]{id,fecha,cliente,comercio,editar});
    }
    
    public void agregarFilaProductoPedido(String nuevoNombre,String nuevaCantidad){
        modProductoPedido.addRow(new Object[]{nuevoNombre,nuevaCantidad});
    }
        
    public void agregarFilaCliente(String nuevoNombre,String nuevoApellido,String nuevoDoc,String nuevoEmail,String nuevoTelefono, String Editar){
        modCliente.addRow(new Object[]{nuevoNombre,nuevoApellido,nuevoDoc,nuevoEmail,nuevoTelefono,Editar});
    }
    
    public void agregarFilaComerciante(String nuevoNombre,String nuevoApellido,String nuevoEmail,String nuevoTelefono, String Editar){
        modComerciante.addRow(new Object[]{nuevoNombre,nuevoApellido,nuevoEmail,nuevoTelefono,Editar});
    }
    public void agregarFilaProducto(String nuevoNombre,String nuevoCodigo,String nuevaCategoria,int nuevoStock,double nuevoPrecio,String Editar){
        modProducto.addRow(new Object[]{nuevoNombre,nuevoCodigo,nuevaCategoria,nuevoStock,nuevoPrecio,Editar});
    }
    public void agregarFilaAsBarrio(String nuevoBarrio,String Eliminar){
        modAsBarrio.addRow(new Object[]{nuevoBarrio,Eliminar});
    }

    public void agregarFilaAsComercio(String nuevoNombre, String nuevoTipo, String nuevoTelefono, String nuevoEmail, String Eliminar){
        modAsComercio.addRow(new Object[]{nuevoNombre,nuevoTipo,nuevoTelefono,nuevoEmail,Eliminar});
    }
    
    public void agregarFilaComercio(String nuevoNombre, String nuevoTipo, String nuevoTelefono, String nuevoEmail, String nuevoBarrio,String Editar){
        modComercio.addRow(new Object[]{nuevoNombre,nuevoTipo,nuevoTelefono,nuevoEmail,nuevoBarrio,Editar});
    }
    
    public void agregarFilaProveedor(String nuevoNombre,String nuevoNit,String nuevoTelefono, String nuevoEmail,String Editar){
        modProveedor.addRow(new Object[]{nuevoNombre,nuevoNit,nuevoTelefono,nuevoEmail,Editar});
    }
    
    public void agregarFilaZonaDeDistribucion(String nuevoNombre,String nuevoCodigo,String Editar,String Barrios,String Comercios){
        modZona.addRow(new Object[]{nuevoNombre,nuevoCodigo,Editar,Barrios,Comercios});
    }
    
    public void llenarSelectComercio(){
        for(Comercio c: listaComercios){
            selectComercios.addElement(c.getNombre());
        }
    }
    
    public void llenarSelectClientes(){
        for(Cliente c: listaClientes){
            selectClientes.addElement(c.getNombre()+" "+ c.getApellido());
        }
    }
    
        public void llenarSelectProductos(){
        for(Producto p: listaProductos){
            selectProductos.addElement(p.getNombre());
        }
    }
    private void cuentaGerente(){
        listaComerciantes.add(new Comerciante("Luis","Julio Padilla","2023201","juliopadi@gmail.com","3022784066","admin123"));
    }
    
    public void guardarComercioEnArchivo(String nombreArchivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (Comercio comercio : listaComercios) {
                // Escribe los datos de cada comercio en una línea del archivo
                writer.write(comercio.getNombre() + "," + comercio.getTelefono() + "," + comercio.getEmail() + "," + comercio.getTipo() + "," + comercio.getBarrio() + "," + comercio.getDireccion());
                writer.newLine(); // Agrega un salto de línea después de cada comercio
            }
            writer.write(".");

            System.out.println("Datos de comercios guardados exitosamente en " + nombreArchivo);
        } catch (IOException e) {
            System.err.println("Error al guardar datos en el archivo: " + e.getMessage());
        }
    } 
    
    public void cargarComerciosDesdeArchivo(String nombreArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while (!".".equals(linea = br.readLine())) {
                String[] datos = linea.split(",");
                listaComercios.add(new Comercio(datos[0],datos[1],datos[2],datos[3],datos[4],datos[5]));
                modComercio.addRow(new Object[]{datos[0],datos[3],datos[1],datos[2],datos[4],"Editar"});
            }
            

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void guardarProveedoresEnArchivo(String nombreArchivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (Proveedor p : listaProveedores) {
                // Escribe los datos de cada comercio en una línea del archivo
                writer.write(p.getNombre()+ "," + p.getNit() + "," + p.getTelefono() + "," + p.getEmail());
                writer.newLine(); // Agrega un salto de línea después de cada comercio
            }
            writer.write(".");

            System.out.println("Datos de proveedores guardados exitosamente en " + nombreArchivo);
        } catch (IOException e) {
            System.err.println("Error al guardar datos en el archivo: " + e.getMessage());
        }
    }
     
    public void cargarProveedoresDesdeArchivo(String nombreArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while (!".".equals(linea = br.readLine())) {
                String[] datos = linea.split(",");
                listaProveedores.add(new Proveedor(datos[0],datos[1],datos[2],datos[3]));
                modProveedor.addRow(new Object[]{datos[0],datos[1],datos[2],datos[3],"Editar"});
            }
           

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
        public void guardarZonasEnArchivo(String nombreArchivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (ZonaDeDistribucion z : listaZonas) {
                
                writer.write(z.getNombre() + "," + z.getCodigo());
                writer.newLine(); 
            }
            writer.write(".");

            System.out.println("Datos de Zonas guardados exitosamente en " + nombreArchivo);
        } catch (IOException e) {
            System.err.println("Error al guardar datos en el archivo: " + e.getMessage());
        }
    }
     
    public void cargarZonasDesdeArchivo(String nombreArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while (!".".equals(linea = br.readLine())) {
                String[] datos = linea.split(",");
                listaZonas.add(new ZonaDeDistribucion(datos[0],datos[1]));
                modZona.addRow(new Object[]{datos[0],datos[1],"Editar","Barrios","Comercios"});
            }
            

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void guardarComerciantesEnArchivo(String nombreArchivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (Comerciante comerciante : listaComerciantes) {
                // Escribe los datos de cada comercio en una línea del archivo
                writer.write(comerciante.getNombre() + "," + comerciante.getApellido() + "," + comerciante.getIdComerciante() + "," + comerciante.getEmail() + "," + comerciante.getTelefono() + "," + comerciante.getClave());
                writer.newLine(); // Agrega un salto de línea después de cada comercio
            }
            writer.write(".");

            System.out.println("Datos de comerciantes guardados exitosamente en " + nombreArchivo);
        } catch (IOException e) {
            System.err.println("Error al guardar datos en el archivo: " + e.getMessage());
        }
    } 
    
    public void cargarComerciantesDesdeArchivo(String nombreArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while (!".".equals(linea = br.readLine())) {
                String[] datos = linea.split(",");
                listaComerciantes.add(new Comerciante(datos[0],datos[1],datos[2],datos[3],datos[4],datos[5]));
                modComerciante.addRow(new Object[]{datos[0],datos[1],datos[2],datos[4],"Editar"});
            }
            

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void guardarProductosEnArchivo(String nombreArchivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (Producto p : listaProductos) {
        
                writer.write(p.getCodigo() + "," + p.getNombre() + "," + p.getCategoria() + "," + p.getCantidadDisponible() + "," + p.getPrecio());
                writer.newLine(); 
            }
            writer.write(".");

            System.out.println("Datos de productos guardados exitosamente en " + nombreArchivo);
        } catch (IOException e) {
            System.err.println("Error al guardar datos en el archivo: " + e.getMessage());
        }
    } 
    
    public void cargarProductosDesdeArchivo(String nombreArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while (!".".equals(linea = br.readLine())) {
                String[] datos = linea.split(",");
                listaProductos.add(new Producto(datos[0],datos[1],datos[2],Integer.parseInt(datos[3]),Double.parseDouble(datos[4])));
                modProducto.addRow(new Object[]{datos[1],datos[0],datos[2],datos[3],datos[4],"Editar","Ubicacion"});
            }
            

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void guardarClientesEnArchivo(String nombreArchivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (Cliente c : listaClientes) {
        
                writer.write(c.getNombre() + "," + c.getApellido() + "," + c.getDocumento() + "," + c.getEmail() + "," + c.getTelefono()+ "," + c.getBarrio()+ "," + c.getDireccion());
                writer.newLine(); 
            }
            writer.write(".");

            System.out.println("Datos de clientes guardados exitosamente en " + nombreArchivo);
        } catch (IOException e) {
            System.err.println("Error al guardar datos en el archivo: " + e.getMessage());
        }
    } 
    
    public void cargarClientesDesdeArchivo(String nombreArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while (!".".equals(linea = br.readLine())) {
                String[] datos = linea.split(",");
                listaClientes.add(new Cliente(datos[0],datos[1],datos[2],datos[3],datos[4],datos[5],datos[6]));
                modCliente.addRow(new Object[]{datos[1],datos[0],datos[2],datos[3],datos[4],"Editar"});
            }
            

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void guardarAsociacionComerciosEnArchivo(String nombreArchivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (ZonaDeDistribucion z : listaZonas) {
                
                for(int i = 0; i <z.getComerciosAsociados().size(); i++){
                    Comercio c = z.getComerciosAsociados().get(i);
                    writer.write(c.getNombre());
                    if(i <= z.getComerciosAsociados().size()-2 ){
                        writer.write(",");
                    }
                }
                writer.newLine(); 
            }
            writer.write(".");

            System.out.println("Datos de comercios asociados guardados exitosamente en " + nombreArchivo);
        } catch (IOException e) {
            System.err.println("Error al guardar datos en el archivo: " + e.getMessage());
        }
    } 
    
    public void cargarAsociacionComerciosDesdeArchivo(String nombreArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            int cont = 0;
            while (!".".equals(linea = br.readLine())) {
                
                String[] datos = linea.split(",");
                
                for(int i = 0; i<datos.length;i++){
                   Comercio c = d.buscarComercioPorNombre(datos[i]);
                   listaZonas.get(cont).asignarComercio(c);
                }
               cont ++;
            }
            

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void guardarPedidosEnArchivo(String nombreArchivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (Pedido p : listaPedidos) {
        
                writer.write(p.getIdPedido() + "," + p.getCliente().getDocumento() + "," + p.convertirFechaPedidoAString() + "," + p.convertirFechaEnvioAString() + "," + p.getComercio().getNombre());
                writer.newLine(); 
            }
            writer.write(".");

            System.out.println("Datos de pedido guardados exitosamente en " + nombreArchivo);
        } catch (IOException e) {
            System.err.println("Error al guardar datos en el archivo: " + e.getMessage());
        }
    } 
    
    public void cargarPedidosDesdeArchivo(String nombreArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
             DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            while (!".".equals(linea = br.readLine())) {
                String[] datos = linea.split(",");
                Cliente c = d.buscarClientePorDocumento(datos[1]);
                LocalDateTime f1 = LocalDateTime.parse(datos[2], formateador);
                LocalDateTime f2 = LocalDateTime.parse(datos[3], formateador);
                Comercio co = d.buscarComercioPorNombre(datos[4]);
                listaPedidos.add(new Pedido(datos[0],c,f1,f2,co));
                modPedido.addRow(new Object[]{datos[0],datos[2],c.getNombre()+" "+c.getApellido(),co.getNombre(),"Ver"});
            }
            

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void guardarAsociacionPedidosEnArchivo(String nombreArchivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (Pedido p: listaPedidos) {
                
                for(int i = 0; i <p.getProductos().size(); i++){
                    Producto pr = p.getProductos().get(i);
                    writer.write(pr.getNombre());
                    if(i <= p.getProductos().size()-2 ){
                        writer.write(",");
                    }
                }
                writer.newLine(); 
            }
            writer.write(".");

            System.out.println("Datos de Pedidos asociados guardados exitosamente en " + nombreArchivo);
        } catch (IOException e) {
            System.err.println("Error al guardar datos en el archivo: " + e.getMessage());
        }
    } 
    
    public void cargarAsociacionPedidosDesdeArchivo(String nombreArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            int cont = 0;
            while (!".".equals(linea = br.readLine())) {
                
                String[] datos = linea.split(",");
                
                for(int i = 0; i<datos.length;i++){
                   Producto p = d.buscarProductoPorNombre(datos[i]);
                   listaPedidos.get(cont).agregarProducto(p);
                }
               cont ++;
            }
            

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
   
}
