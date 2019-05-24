package denis;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import com.mysql.jdbc.Statement;

public class empresa {
	public static void main (String args[]) {
		try
		{
			 DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
		   
			 Connection conexion = DriverManager.getConnection ("jdbc:mysql://localhost/Clientes","root", "123456");
			 java.sql.Statement st = conexion.createStatement();
			 
			 
			 //TABLA EMPRESA
			 String query = "INSERT INTO empresa(nombre, direccion, rfc, telefono) VALUES('Dell','Los angeles','888syhduh',87765876)";
			 st.executeUpdate(query);
			 
			 System.out.println("Datos de empresa guardados");
			 
			 //MODIFICAR DATOS GENERALES
			 st.executeUpdate("UPDATE empresa SET direccion ='La Paz' where Id='2'");
			 
			 //ENLISTADOS EMPRESA
			 Statement s = (Statement) conexion.createStatement();
			 ResultSet rs = s.executeQuery ("select * from empresa");
			 
			 while (rs.next())
	            {
	                System.out.println (rs.getString ("Id") + " " + rs.getString (2)+ 
	                    " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5));
	            }
			 
			 
			 conexion.close();
			 
			 
		} catch (Exception e)
		{
		   e.printStackTrace();
		}
	}
}
