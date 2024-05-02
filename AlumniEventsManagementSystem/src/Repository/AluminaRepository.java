package Repository;

import Model.AluminaModel;

public class AluminaRepository extends DBConfig {
	public boolean addAlumina(AluminaModel model) {
		try {
			stmt=conn.prepareStatement("insert into Alumina	 values('0',?,?,?,?,?,?,?)");
			stmt.setString(1,model.getAname());
			stmt.setString(2,model.getAemail());
			stmt.setInt(3,model.getAcontact());
			stmt.setString(4,model.getAaddress());
			stmt.setInt(5,model.getBatchyear());
			stmt.setString(6, model.getAoccupation());
			stmt.setInt(7, model.getEid());
			int value=stmt.executeUpdate();
			if(value>0)
			{
				return true;
			}
			else{
				return false;
			    }
			
		}
		catch(Exception ex){
			System.out.println("Error is "+ex);
			return false;
		}
	
	}

}
