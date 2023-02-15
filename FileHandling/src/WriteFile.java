import java.io.*;
public class WriteFile {

	public static void main(String args[]) throws IOException {
		FileWriter write = new FileWriter("E:\\text1.txt");
		try (BufferedWriter buf = new BufferedWriter(write)) {
			buf.write("Hello World\n");
			buf.write("Welcome to my World\n");
			buf.write("This is pratice\n");
		}
	}
}
