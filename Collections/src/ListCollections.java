import java.util.List;
import java.util.*;
public class ListCollections {
	public static void main(String args[]) {
	List<String>  a= new ArrayList<String>();
	a.add("aaa");
	a.add("bbb");
	a.add("ccc");
	Iterator it =a.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	}
}
