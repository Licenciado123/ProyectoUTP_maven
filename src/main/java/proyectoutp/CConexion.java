package proyectoutp;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class CConexion {
    Connection conectar = null;
    
    String usuario = "usersql";
    String contrasenia = "1234";
    String bd = "minimarket";
    String ip = "localhost";
    String puerto = "1433";
    
    String cadena = "jdbc:sqlserver://"+ip+":"+puerto+"/"+bd;
    
    public Connection establecerConexion() {
        try {
            String cadena = "jdbc:sqlserver://localhost:"+puerto+";"+"databaseName="+bd+";integratedSecurity=false; trustServerCertificate=true";
            conectar = DriverManager.getConnection(cadena,usuario,contrasenia);
            JOptionPane.showMessageDialog(null, "Se conecto correctamente a la base de datos");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al conectar a la base de datos, error: "+e.toString());
        }
        return conectar;
    }
}