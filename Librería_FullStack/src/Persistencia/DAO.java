/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;


/**
 *
 * @author droa
 */
public abstract class DAO {
    //Atributos
    protected Connection conexion;
    protected ResultSet resultado;
    protected Statement sentencia;
    protected String dbName;
    private final String USER = "root";
    private final String HOST = "192.168.10.20";
    private final String PASSWORD = "BlueHelp2016";
    //private final String DATABASE = "tienda";
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";
    
    //Constructores

    public DAO() {
    }

    
    public DAO(String database) {
        this.dbName = database;
    }
    
    
    // Métodos
     
    /// Conexión DB
    protected void conectarDB() throws Exception {
        try {
            Class.forName(DRIVER);
            String urlDB = "jdbc:mysql://"+HOST+":30306/" + dbName + "?useSSL=false";
            conexion = DriverManager.getConnection(urlDB, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            throw ex;
        }
    }
    protected void desconectarDB() throws Exception{
        try{
            if(resultado == null){
                resultado.close();
            }
            if(sentencia == null){
                sentencia.close();
            }
            if(conexion == null){
                conexion.close();
            }
        } catch (Exception ex){
            throw ex;
        }
    
    }
    
    
    /// Consultas
    protected void consultarDB(String querySql) throws Exception {
        try {
            conectarDB();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(querySql);
        } catch (Exception ex) {
            throw ex;
        }
    }
    
}
