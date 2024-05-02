package Helper;
import java.io.FileInputStream;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Properties;

public class PathHelp {
	
	public static String completePath="";
	public static Properties p= new Properties();
	
	public PathHelp() {
		try {
		Path currentDirectoryPath = FileSystems.getDefault().getPath("");
		String currentDirectoryName = currentDirectoryPath.toAbsolutePath().toString();
		completePath=currentDirectoryName+"//src//recources//db.properties";
		///StudentResultApp/src/recources/db.properties
		
		FileInputStream finf = new FileInputStream(completePath);
		p.load(finf);
		}
		catch(Exception ex) {
			System.out.println("Error is "+ex);
		}
	}
}
