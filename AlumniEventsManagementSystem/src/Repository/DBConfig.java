package Repository;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Helper.PathHelp;

public class DBConfig {	
	protected Connection conn;
	protected PreparedStatement stmt;
	protected ResultSet rs;
	
	public DBConfig(){
		try {
			PathHelp phelp= new PathHelp();		
			
			Class.forName(PathHelp.p.getProperty("driver"));
			conn= DriverManager.getConnection(PathHelp.p.getProperty("url"),
					PathHelp.p.getProperty("user"),PathHelp.p.getProperty("pass"));

		}
		catch(Exception ex){
			System.out.println("Error is"+ex);
		}
}
}
