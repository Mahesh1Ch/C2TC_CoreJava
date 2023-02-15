package day20;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regex1 {
	public static void main(String args[]) {
		Pattern P=Pattern.compile("a");
		Matcher m = P.matcher("axcbay");
		boolean b =m.matches();
		System.out.println(b);
		
	 boolean P1 =Pattern.compile(".y").matcher("acx").matches();
	 System.out.println(P1);
	}

}
