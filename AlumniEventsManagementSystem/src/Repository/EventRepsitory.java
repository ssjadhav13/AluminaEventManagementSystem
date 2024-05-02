package Repository;
import Model.EventModel;
public class EventRepsitory extends DBConfig {	
	public boolean isAddEvent(EventModel model) 
	{
		try {
			stmt=conn.prepareStatement("insert into Event values('0',?,?,?,?,?)");
			stmt.setString(1,model.getEname());
			stmt.setString(2,model.getEdiscription());
			stmt.setDate(3,model.getDate());
			stmt.setString(4,model.getTime());
			stmt.setString(5,model.getLocation());		
			
			int value=stmt.executeUpdate();
			if(value>0)
			{
				return true;
			}
			else{
				return false;
			    }
		}
		catch(Exception ex) 
		{
			System.out.println("Error"+ex);
			return false;
		}
	}	
		public boolean isEventPresent(String Ename) {
			try {
				stmt=conn.prepareStatement("select *from Event where event_name = ?");
				stmt.setString(1,Ename);
				return rs.next();			
				}
			catch(Exception ex) 
			{
				return false;
			}
				
	}

}
