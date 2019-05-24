package denis;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import com.mysql.jdbc.Statement;

public class luna {
	public static void main (String args[]) {
		try
		{
			 DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
		   
			 Connection conexion = DriverManager.getConnection ("jdbc:mysql://localhost/Clientes","root", "123456");
			 java.sql.Statement st = conexion.createStatement();
			 
			 
			 //TABLA DATOS GENERALES
			 String query = "INSERT INTO datos_generales(nombres, apellidos, calle, numero, colonia) VALUES('Neftaly','Gonzalez','Jacarandas',333,'Jacarandas')";
			 st.executeUpdate(query);
			 
			 System.out.println("Datos generales guardados");
			 
			 //MODIFICAR DATOS GENERALES
			 st.executeUpdate("UPDATE datos_generales SET calle ='La Paz' where Id='2'");
			 
			 //ENLISTADOS DATOS GENERALES
			 
			 Statement s = (Statement) conexion.createStatement();
			 ResultSet rs = s.executeQuery ("select * from datos_generales");
			 
			 while (rs.next())
	            {
	                System.out.println (rs.getString ("Id") + " " + rs.getString (2)+ 
	                    " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5)  + " " + rs.getString(6));
	            }
			 
			 
			 conexion.close();
			 
			 
		} catch (Exception e)
		{
		   e.printStackTrace();
		}
	}
	

}