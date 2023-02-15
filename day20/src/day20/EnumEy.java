package day20;

public class EnumEy{
	enum  Crop{Rice,White,RedGram,Beans}
public static void  main(String args[]) {
	for(Crop c:Crop.values()){
		System.out.println(c);	
	}
}
}
