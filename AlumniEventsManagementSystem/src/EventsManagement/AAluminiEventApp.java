package EventsManagement;
import java.util.Scanner;
import Repository.Attendance;
import Repository.DeleteAluminaByID;
import Repository.UpdateAlumina;
import Repository.View;
import Repository.ViewYearWise;

public class AAluminiEventApp {
	public static void main(String[] args) {
		EventClient eventClient = new EventClient();
		AluminaClient aluminaclient = new AluminaClient();
		View  view = new View();
		ViewYearWise viewyr= new ViewYearWise();
		UpdateAlumina updateAlumina= new UpdateAlumina();
		DeleteAluminaByID deleteAlumina = new DeleteAluminaByID();
		AttendanceClient attclt= new AttendanceClient();
		Attendance att= new Attendance();
		do {
			System.out.println("1:Add New Event");
			System.out.println("2:Add New Alumina");
			System.out.println("3:View All Alumina");
			System.out.println("4:Update Alumina by Id");
			System.out.println("5:Delete Alumina by ID");
			System.out.println("6:New Registration");
			System.out.println("7:Attendance of present alumina");
			System.out.println("8:Attendance of absent alumina");
			
			Scanner xyz = new Scanner(System.in);
			System.out.println("Enter your choice");
			int choice = xyz.nextInt();
			switch (choice) {
			case 1:
				eventClient.addEvent(xyz);
				
				break;
			case 2:
				aluminaclient.addAlumina(xyz);				
				break;
				
			case 3:
				System.out.println("View All Data");
				view.viewAlumina(null);
				System.out.println("\n Data Year Wise");
				viewyr.viewAluminaYearWise(null);
				System.out.println("\n Most Senior Alumina");
				viewyr.viewMostSenior(null);
				
				break;
			case 4:
				updateAlumina.updateAlumina(null);
				break;
			case 5:
				deleteAlumina.deleteAlumina(null);
				break;
			case 6:
				attclt.addAtt(xyz);
				break;
			case 7:
				System.out.println("Present Students");
				att.attPresent(null, null);
				break;
			case 8:
				System.out.println("Absent Students");
				att.attAbsentt(null, null);
				break;
			default:
				System.out.println("Wrong Choice");

			}

		} while (true);

	}

}
