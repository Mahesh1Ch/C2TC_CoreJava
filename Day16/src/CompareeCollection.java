import java.util.List;
import java.util.*;
class Product{
	int id;
	String name;
	String date;
	Product(int id,String name,String date){
		this.id=id;
		this.name=name;
		this.date=date;
	}
	
}
public class CompareeCollection {
	public static void main(String args[]) {
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(001,"AAA","23/12/22"));
		list.add(new Product(002,"BBB","23/12/22"));
		list.add(new Product(003,"CCC","23/12/22"));
		
		}

}
