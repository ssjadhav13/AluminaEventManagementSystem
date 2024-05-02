package Repository;

import java.util.Scanner;

import Model.AluminaModel;

public class UpdateAlumina extends DBConfig
{
	public boolean updateAlumina(AluminaModel model) 
	{
		Scanner sc= new Scanner(System.in);
		try {
			System.out.println("Enter Address here");
			String Aaddress=sc.nextLine();
			
			System.out.println("Enter id here");
			int Aid=sc.nextInt();
			
			System.out.println("Enter contact");
			int Acontact=sc.nextInt();				
			
			stmt=conn.prepareStatement("update Alumina set a_address=?,a_contact=? where a_id=?");
			
			stmt.setString(1, Aaddress);
			stmt.setInt(2, Acontact);
			stmt.setInt(3, Aid);
			
		
			
			int value=stmt.executeUpdate();
			if(value>0)
			{
				System.out.println("Record Update sucess");
			}
			else{
				System.out.println("Record Update failed");
			    }
			
		}
		catch(Exception ex) {
			System.out.println("Error is "+ex);
		}
		
		return false;
		
	}

}
