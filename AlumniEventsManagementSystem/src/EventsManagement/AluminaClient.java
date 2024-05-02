package EventsManagement;
import java.sql.Date;
import java.util.Scanner;
import Model.AluminaModel;
import Model.EventModel;
import Services.AluminaService;

public class AluminaClient {
	public void addAlumina(Scanner xyz) {
		
		AluminaService as= new AluminaService();
		
		xyz.nextLine();
		System.out.println("Fill The Alumina Details");
		
		System.out.println("Name");
		String name=xyz.nextLine();
		
		System.out.println("Email");
		String email=xyz.nextLine();
		
		System.out.println("Contact");
		int cont=xyz.nextInt();
		xyz.nextLine();
		
		System.out.println("Address");
		String add=xyz.nextLine();
		
		System.out.println("Batch Year");
		int batch=xyz.nextInt();
		xyz.nextLine();
		
		System.out.println("Occupation");
		String occ=xyz.nextLine();
		
		System.out.println("Event Id");
		int eid = xyz.nextInt();
		
		AluminaModel model = new AluminaModel(name,email,cont,add,batch,occ,eid);
		int b = as.addAlumina(model);
		if (b==1) {
			System.out.println("Alumina added Successfully...");
		} 
		else {
			System.out.println("Alumina added Failed...");

		}
	}
	
}
