package infinite.JsfJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class Connectionhelper {
	
	public static Connection getconnection() throws ClassNotFoundException, SQLException{
		ResourceBundle rb = ResourceBundle.getBundle("db");
		String driver = rb.getString("driver");
		String url = rb.getString("url");
		String user = rb.getString("user");
		String password = rb.getString("password");
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, user, password);
		return con;
	}

}
