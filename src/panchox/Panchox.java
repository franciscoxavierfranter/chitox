
package panchox;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Panchox {
    
  private String db = "libreria";
  private String user = "root";
  private String password = "8162";
  private String url = "jdbc:mysql://localhost/"+db;
  private Connection conn = null;

  //clase concat para conectar
   public Panchox(){
        this.url = "jdbc:mysql://localhost/"+this.db;
       try{
         //obtenemos el driver de para mysql
         Class.forName("com.mysql.jdbc.Driver");
         //obtenemos la conexión
         conn = DriverManager.getConnection( this.url, this.user , this.password );         
      }catch(SQLException | ClassNotFoundException e){
         System.err.println( e.getMessage() );
      }
   }

   public Connection getConexion()
   {
    return this.conn;
   }
}