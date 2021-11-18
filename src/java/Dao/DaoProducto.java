/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

/**
 *
 * @author Fabian Palma
 */
public class DaoProducto {
    
    private int idproducto;
    private String nombreproducto;
    private int precio;
    private String tipo;

    public DaoProducto(int idproducto, String nombreproducto, int precio, String tipo) {
        this.idproducto = idproducto;
        this.nombreproducto = nombreproducto;
        this.precio = precio;
        this.tipo = tipo;
    }
    
    public DaoProducto(){
        
    }
    
    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombreproducto() {
        return nombreproducto;
    }

    public void setNombreproducto(String nombreproducto) {
        this.nombreproducto = nombreproducto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}
