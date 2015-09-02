/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario;

import academia.*;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Windows 7
 */
public class Conexao_bd {
    public String driver = "com.mysql.jdbc.Driver"; // driver do bd
    public String banco = "academia"; // nome do banco
    public String host = "localhost"; // maquina do banco
    public String str_con = "jdbc:mysql://"+ host +":3306/" + banco; // conexão
    public String usuario = "root"; // user
    public String senha = ""; // senha 
    
    Connection con;

    //Criando conexão
public void ConectarBD(){
    try {
    
        con = DriverManager.getConnection(str_con,usuario,senha);
    }
    catch(SQLException ex){
        System.out.println("Erro na conexão");
    }
    }
//comandos de insert , delete e update
public int executarcomandos(String sql){

    try{
    ConectarBD();
    Statement stmt =  con.createStatement();
    return stmt.executeUpdate(sql);
            }    
        catch(SQLException ex){
            System.out.println("Erro com o SQL");
        }
    return 0;
}
public ResultSet executarconsulta(String sql){
     
    try{    
     ConectarBD();
     Statement stmt = con.createStatement();
     ResultSet rs = stmt.executeQuery(sql);
     return rs;
    }
     catch(SQLException ex){
         System.out.println("Problema no SQL");
     }
    return null;
  }
}

