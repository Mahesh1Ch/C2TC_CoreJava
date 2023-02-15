import java.io.*;
public class ReadFile {

	public static void main(String args[]) throws IOException {
		FileReader read= new FileReader("E:\\text1.txt");//road from ecilep to file manager
		try(BufferedReader buf = new BufferedReader(read)){//act as vehical
		String str;
		while((str=buf.readLine())!=null) {
			System.out.println(str);
		}
		}
	}
}
