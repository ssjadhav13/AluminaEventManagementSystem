package Repository;

import java.sql.PreparedStatement;
import java.util.Scanner;

import Model.AluminaModel;

public class DeleteAluminaByID extends DBConfig {
	public boolean deleteAlumina(AluminaModel model) {
		try {
			Scanner xyz  = new Scanner(System.in);
			System.out.println("Enter emplyee id");
			int id=xyz.nextInt();
			
			PreparedStatement stmt=conn.prepareStatement("delete from Alumina where a_id=?");
			stmt.setInt(1, id);
			
			int value=stmt.executeUpdate();
			 if(value>0) {
				 System.out.println("Record Deleted Successfully...............");
			 }
			 else {
				 System.out.println("Some problem is there.................");
			 }

		}
		catch(Exception ex) {
			System.out.println("Error is "+ex);
		}
		return false;
		
	}
	
}
