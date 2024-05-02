package Model;

import java.sql.Date;
import java.sql.Time;
import org.w3c.dom.Text;

public class EventModel {
	private int Eid;
	private String Ename;
	private String Ediscription;
	private Date Date;
	private String Time;
	private String Location;

	public EventModel(){
		
	}
	public EventModel(String Ename, String Ediscription ,Date Date,String Time,String Location) {
		this.Ename=Ename;
		this.Ediscription=Ediscription;
		this.Date=Date;
		this.Time=Time;
		this.Location=Location;
		
	}

	public int getEid() {
		return Eid;
	}

	public void setEid(int Eid) {
		this.Eid = Eid;
	}

	public String getEname() {
		return Ename;
	}

	public void setEname(String Ename) {
		this.Ename = Ename;
	}

	public String getEdiscription() {
		return Ediscription;
	}

	public void setEdiscription(String Ediscription) {
		this.Ediscription = Ediscription;
	}

	public Date getDate() {
		return Date;
	}

	public void setDate(Date Date) {
		this.Date = Date;
	}

	public String getTime() {
		return Time;
	}

	public void setTime(String Time) {
		this.Time = Time;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String Location) {
		this.Location = Location;
	}

}
