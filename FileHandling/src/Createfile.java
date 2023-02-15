import java.io.File;
import java.io.IOException;
public class Createfile {
	public static void main(String ags[]) throws IOException{
	File myFile = new File("E:\\text1.txt");
	myFile.createNewFile();
	System.out.println("File Create "+myFile.exists());
	System.out.println("File Name "+myFile.getName());
	System.out.println("File Path "+myFile.getAbsolutePath());
	System.out.println("File Path "+myFile.getPath());
	}
}
