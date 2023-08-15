package escolast_bdd_4to.bdd_escolast;

//@author Adrian Carrion

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class  Cconexion {
     public static Connection estblecerConexion(){
         Connection conectar = null;
/*
        String serverName = "escolast2servidor.database.windows.net";
        String usuario = "admin_escolast";
        String contrasenia = "adrian23C";
        String bd = "escolast2";
*/
        String cadena = "jdbc:sqlserver://escolast2servidor.database.windows.net:1433;database=escolast2;user=admin_escolast@escolast2servidor;password=adrian23C;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conectar = DriverManager.getConnection(cadena);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar el driver de la base de datos.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar la base de datos: " + e.toString());
        }
        return conectar;
        }
}