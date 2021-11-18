/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;

/**
 *
 * @author Fabian Palma
 */
public interface InterfaceUsuarios {
    
    // definir que haran las clases que hagan uso de esta interfaz, la interfaz en java
    //solo implementa metodos sin especificar como lo hace, solo muestra el que hace.
    public String insertar(Object obj);
    public List<?> validaLogin(Object obj);
    //buscar por parametro
    //public List<?> buscar(String parametro);
    //basados en un mensaje, para saber si se afectaron filas.
    //public String update(Object obj);
    //public String delete(Object obj);
}
