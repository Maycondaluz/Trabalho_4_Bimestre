package br.univel.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectionBD {
	
private Connection con;
	
	private static ConectionBD inst;
	private ConectionBD(){}	
	public static ConectionBD getInstace(){
		if(inst == null )
			return inst = new ConectionBD();
		return inst;
	}
	
	public Connection conOpen(){
		String driverName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost/tb4bim";
		String user = "root";
		String pass = "'123'";
		try {
			Class.forName(driverName);
			return con = DriverManager.getConnection(url, user, pass);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void conClose(){
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
		

}
