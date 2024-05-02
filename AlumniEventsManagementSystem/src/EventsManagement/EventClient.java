package EventsManagement;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import Model.EventModel;
import Services.EventServices;

public class EventClient {
	public void addEvent(Scanner xyz){
		
		EventServices ev = new EventServices();
		
		xyz.nextLine();
		System.out.println("Enter Event Name");
		String EventName = xyz.nextLine();

		System.out.println("Enter Discription");
		String dis = xyz.nextLine();

		System.out.println("Enter Date in dd-MM-YYYY");
		String eventDate = xyz.nextLine();
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
		
		try {
			java.util.Date dt=sdf1.parse(eventDate);
			System.out.println(dt);

			System.out.println("Enter Time");
			String time = xyz.nextLine();

			System.out.println("Enter Location");
			String location = xyz.nextLine();

			// create object of EventModel
			EventModel model = new EventModel(EventName, dis, new Date(dt.getTime()), time, location);
			int b = ev.addEvent(model);
			if (b==1) {
				System.out.println("Event added Successfully...");
			} 
			else if(b==-1) {
				System.out.println("Event already present...");
			}
			else {
				System.out.println("Event added Failed...");

			}
		} 
		catch (ParseException e) {
			System.out.println("Event date is invalid. Exception: " + e.getMessage());
							}
		
	}

}
