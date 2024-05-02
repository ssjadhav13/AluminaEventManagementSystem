package Repository;

import java.sql.Statement;
import EventsManagement.AluminaClient;
import Model.AluminaModel;
import Model.AttendanceModel;

public class Attendance extends DBConfig
{
	public boolean attPresent(AttendanceModel model,AluminaModel model1) {
		try {
			if(conn!=null) {
				Statement stmt=conn.createStatement();
				rs= stmt.executeQuery("select at.registration ,at.a_id,a.a_name,a.a_email,a.a_contact,a.batchYear from Attendance at"
						+ " inner join  Alumina a on  at.a_id=a.a_id "
						+ "where status=1;");
				while(rs.next()) 
				{
					 int regi=rs.getInt("registration");
					 int aid=rs.getInt("a_id");
					 String aname=rs.getString("a_name");
					 String aemail=rs.getString("a_email");
					 int cont=rs.getInt("a_contact");
					 int batch=rs.getInt("batchYear");
					 
					
					System.out.println(regi+"\t"+aid+"\t"+aname+"\t"+aemail+"\t"+cont+"\t"+batch);
				}
			}
			
		}
		catch(Exception ex) {
			System.out.println("Error is "+ex);
		}
		return false;	
	}
	public boolean attAbsentt(AttendanceModel model,AluminaModel model1) {
		try {
			if(conn!=null) {
				Statement stmt=conn.createStatement();
				rs= stmt.executeQuery("select at.registration ,at.a_id,a.a_name,a.a_email,a.a_contact,a.batchYear from Attendance at"
						+ " inner join  Alumina a on  at.a_id=a.a_id "
						+ "where status=0;");
				while(rs.next()) 
				{
					 int regi=rs.getInt("registration");
					 int aid=rs.getInt("a_id");
					 String aname=rs.getString("a_name");
					 String aemail=rs.getString("a_email");
					 int cont=rs.getInt("a_contact");
					 int batch=rs.getInt("batchYear");
					 
					
					System.out.println(regi+"\t"+aid+"\t"+aname+"\t"+aemail+"\t"+cont+"\t"+batch);
				}
			}
			
		}
		catch(Exception ex) {
			System.out.println("Error is "+ex);
		}
		return false;	
	}
}
