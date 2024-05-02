package Repository;
import java.lang.ProcessHandle.Info;
import java.sql.ResultSet;
import java.sql.Statement;
import Model.AluminaModel;

public class ViewYearWise extends DBConfig
{
	public boolean viewAluminaYearWise(AluminaModel Model)
	{
		try 
		{
			if(conn!=null) 
			{
				Statement stmt=conn.createStatement();
				ResultSet rs= stmt.executeQuery("select * from Alumina order by batchYear");
				while(rs.next()) 
				{
					String name=rs.getString("a_name");
					 String email=rs.getString("a_email");
					 int contact=rs.getInt("a_contact");
					String address=rs.getString("a_address");
					 int Batchyear=rs.getInt("batchYear");
					 String Occupation=rs.getString("Occupation");
					 int Eid=rs.getInt("event_id");				 
					 System.out.println(name+"\t"+email+"\t"+contact+"\t"+address+"\t"+Batchyear+"\t"+Occupation+"\t"+Eid);
				}		
			}
		}
		catch(Exception ex) 
		{
			System.out.println("error is "+ex);
		}
		return false;
	}
	public boolean viewMostSenior(AluminaModel Moodel) {
		try {
			if(conn!=null) {
				Statement stmt1= conn.createStatement();
				ResultSet rs1= stmt1.executeQuery("select a_id, a_name ,batchYear from Alumina order by batchyear ASC LIMIT 1");
				while(rs1.next()) 
				{
					int id=rs1.getInt("a_id");
					String name1=rs1.getString("a_name");
					 int Batchyear1=rs1.getInt("batchYear");
					 System.out.println(id+"\t"+name1+"\t"+Batchyear1);
				}
			
			}
		
		
		}
		catch(Exception ex) {
			System.out.println("Error is "+ex);
		}
		return false;
		
	}
}
	
