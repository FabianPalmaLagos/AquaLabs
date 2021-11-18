/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Dao.DaoUsuario;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fabian Palma
 */
public class Usuario implements InterfaceUsuarios{
    Conexion conexion = new Conexion();

    @Override
    public String insertar(Object obj) {
        //variable respuesta es lo que retorna el metodo insertar, exito o error.
        String resp="";
        int nfilas;
        DaoUsuario daoUsuario = (DaoUsuario) obj;
        Connection connection;
        PreparedStatement pst;
       //consultas preparadas.
        String query = "insert into tblusuario values(?,?,?,?)";
        try {
            Class.forName(conexion.getDriver());
            connection = (Connection) DriverManager.getConnection(conexion.getUrl(), conexion.getUsuario(), conexion.getClave());
            pst = (PreparedStatement) connection.prepareStatement(query);
            pst.setString(1, daoUsuario.getNombre());
            pst.setString(2, daoUsuario.getApellido());
            pst.setString(3, daoUsuario.getCorreo());
            pst.setString(4, daoUsuario.getContrasena());
            
            nfilas = pst.executeUpdate();
            if(nfilas > 0 ){
            resp = "Usuario registrado con exito.";
            }else{
            resp  = "Error al intentar registrarse.";
            }
            
            
        } catch (ClassNotFoundException | SQLException e) {
            resp = e.getMessage();
        }        
        return resp;
    }

    
    @Override
    public List<DaoUsuario> validaLogin(Object obj) {
        List <DaoUsuario> login = new ArrayList<>();
        DaoUsuario daoUsuario = (DaoUsuario) obj;
        Connection connection;
        PreparedStatement pst;
        ResultSet resultSet;
        
        String query = "select * from tblusuario where correo = '?' and contrasena ='?'";
        
        try {
            Class.forName(conexion.getDriver());
            connection = (Connection) DriverManager.getConnection(conexion.getUrl(), conexion.getUsuario(), conexion.getClave());
            pst = (PreparedStatement) connection.prepareStatement(query);
            pst.setString(1, daoUsuario.getCorreo());
            pst.setString(2, daoUsuario.getContrasena());
            resultSet = pst.executeQuery();
            
            while(resultSet.next()){
             login.add(new DaoUsuario( resultSet.getString(1) , resultSet.getString(2), resultSet.getString(3), resultSet.getString(4)));
            }
        } catch(ClassNotFoundException | SQLException e){
            e.getMessage();
        }
        
         return login;
    }
}
