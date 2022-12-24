import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {

	public Connection getConnection()
	{
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineVoteDB","root" ,"Hp1@8800");
		return con;
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
			return null;
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			return null;
		}
			
		// "C:\Users\HEMENDRA\Downloads\mysql-connector-java-8.0.30.jar"
	}
}
