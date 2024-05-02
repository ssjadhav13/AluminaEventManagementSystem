package Model;

public class AluminaModel {
	private int Aid;
	private String Aname;
	private String Aemail;
	private int Acontact;
	private String Aaddress;
	private int Batchyear;
	private String Occupation;
	private int Eid;

	public AluminaModel() {
		
	}
	public AluminaModel(String Aname,String Aemail,int Acontact,String Aaddress,int Batchyear,String Occupation,int Eid) 
	{
		this.Aname=Aname;
	this.Aemail=Aemail;
	this.Acontact=Acontact;
	this.Aaddress=Aaddress;
	this.Batchyear=Batchyear;
	this.Occupation=Occupation;
	this.Eid=Eid;
	
	
	}
	
	public int getAid() {
		return Aid;
	}

	public void setAid(int aid) {
		Aid = aid;
	}

	public String getAname() {
		return Aname;
	}

	public void setAname(String aname) {
		Aname = aname;
	}

	public String getAemail() {
		return Aemail;
	}

	public void setAemail(String aemail) {
		Aemail = aemail;
	}

	public int getAcontact() {
		return Acontact;
	}

	public void setAcontact(int acontact) {
		Acontact = acontact;
	}

	public String getAaddress() {
		return Aaddress;
	}

	public void setAaddress(String aaddress) {
		Aaddress = aaddress;
	}

	public int getBatchyear() {
		return Batchyear;
	}

	public void setBatchyear(int batchyear) {
		Batchyear = batchyear;
	}

	public String getAoccupation() {
		return Occupation;
	}

	public void setAoccupation(String aoccupation) {
		Occupation = Occupation;
	}

	public int getEid() {
		return Eid;
	}

	public void setEid(int eid) {
		Eid = eid;
	}

}
