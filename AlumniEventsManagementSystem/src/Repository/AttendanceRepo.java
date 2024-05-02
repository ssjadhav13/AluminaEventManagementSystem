package Repository;
import Model.AttendanceModel;

public class AttendanceRepo extends DBConfig{
	public boolean addAtt(AttendanceModel model) {
		try {
			stmt=conn.prepareStatement("insert into Attendance values('0',?,?,?)");
			stmt.setInt(1, model.getEid());
			stmt.setInt(2, model.getAid());
			stmt.setBoolean(3, model.isStatus());
			int value=stmt.executeUpdate();
			if(value>0) {
				return true;
			}
			else {
				return false;
			}
		}
		catch(Exception ex) {
			System.out.println("Error is "+ex);
		}
		return false;
		
	}

}
