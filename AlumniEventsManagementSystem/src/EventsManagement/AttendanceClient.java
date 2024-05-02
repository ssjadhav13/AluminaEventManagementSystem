package EventsManagement;

import java.util.Scanner;

import Model.AttendanceModel;
import Services.AttendanceService;

public class AttendanceClient {
	public void addAtt(Scanner xyz) {
		AttendanceService  As= new AttendanceService ();
		
		xyz.nextLine();
		System.out.println("Fill The Attendance Details");
		
		System.out.println("Event Id");
		int eid= xyz.nextInt();
		
		System.out.println("Alumina Id");
		int aid=xyz.nextInt();
		
		System.out.println("Status");
		Boolean sta= xyz.nextBoolean();
		
		 AttendanceModel model= new AttendanceModel(eid,aid,sta);
		 int b = As.addAtt(model);
			if (b==1) {
				System.out.println("Registration Successfully...");
			} 
			else {
				System.out.println("Registration Failed...");

			}
		
	}

}
