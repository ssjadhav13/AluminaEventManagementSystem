package Services;

import Model.AttendanceModel;
import Repository.AttendanceRepo;

public class AttendanceService 
{
	AttendanceRepo aRepo= new AttendanceRepo();
	public int addAtt(AttendanceModel model) {
		return aRepo.addAtt(model)?1:0;
		
	}
	

}
