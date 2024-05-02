package Model;

public class AttendanceModel {
	private int registration;
	private int Eid;
	private int Aid;
	private boolean Status;
	public AttendanceModel(){
		
	}
	public AttendanceModel(int Eid,int Aid,boolean Status) {
		this.Eid=Eid;
		this.Aid=Aid;
		this.Status=Status;
	}

	public int getRegistration() {
		return registration;
	}

	public void setRegistration(int registration) {
		this.registration = registration;
	}

	
	public int getEid() {
		return Eid;
	}

	public void setEid(int eid) {
		Eid = eid;
	}

	
	public int getAid() {
		return Aid;
	}

	public void setAid(int aid) {
		Aid = aid;
	}

	
	public boolean isStatus() {
		return Status;
	}

	public void setStatus(boolean status) {
		Status = status;
	}
}
