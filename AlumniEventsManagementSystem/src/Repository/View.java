package Repository;

import java.sql.ResultSet;
import java.sql.Statement;

import Model.AluminaModel;

public class View extends DBConfig
{
	public boolean viewAlumina(AluminaModel model){
		try {

			if(conn!=null)
			{
				Statement stmt=conn.createStatement();
				rs= stmt.executeQuery("select * from Alumina");
				while(rs.next()) 
				{
					String Aname=rs.getString("a_name");
					 String Aemail=rs.getString("a_email");
					 int Acontact=rs.getInt("a_contact");
					String Aaddress=rs.getString("a_address");
					 int Batchyear=rs.getInt("batchYear");
					 String Occupation=rs.getString("Occupation");
					 int Eid=rs.getInt("event_id");
					
					System.out.println(Aname+"\t"+Aemail+"\t"+Acontact+"\t"+Aaddress+"\t"+Batchyear+"\t"+Occupation+"\t"+Eid);
					
				}
			}

		}
		catch(Exception ex) {
			System.out.println("Error is "+ex);
		
		}
		return false;
		
		
	}
}
