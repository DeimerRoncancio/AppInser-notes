//Clase para establecer la conexion con la base de datos

package insertnotes;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

public class Conexion
{
    //Se declara una variable de tipo Connection
    Connection cn;
    
    //Se crea un metodo que retorne la conexion
    public Connection Conexion()
    {
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            //Se establece la coneccion con la base de datos.
            cn = (Connection) DriverManager.getConnection(/*Direccion base de datos*/"jdbc:mysql://localhost:3306/colegio",
                                                          /*Nombre usuario. Si no lo hay se pone 'root'*/"root",
                                                          /*Contraseña de base de datos, si no lo hay se deja vacio.*/"");
            
            //Si desea, se deja un mensaje para informar si la conexión fue exitosa
            System.out.println("Conexión exitosa");
            
        } catch (Exception e)
        {
            //Caso contrario, se informa el error
            System.err.println(e.getMessage());
            System.out.println(e);
        }
        
        return cn;
    }
}