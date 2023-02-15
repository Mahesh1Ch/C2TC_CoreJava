import java.util.ArrayList;
public class Arraylist1 {
	public static void main(String args[]) {
	ArrayList<Emplyee> empobject = new ArrayList<Emplyee>();
	empobject.add(new Emplyee(1,"AAA",1234567899,30000));
	empobject.add(new Emplyee(2,"BBB",1234567899,30000));
	empobject.add(new Emplyee(3,"CCC",1234567899,30000));
	System.out.println(empobject);
	}
	
}
