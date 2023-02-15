package day14;
//String are a group of characters which is in array form
//there is two types :) 1:Sting literals and 2: By using new keyword
public class StringArray {
	public static void main(String args[]) {
	//char[] c = new char[10];
	char[] c= {'a','b','c','d','e','f','g'};
	String st=new String(c);
	System.out.println(st);
	String str=new String("123456789");
	String str1=new String("Welcome");
	System.out.println(str1);
	
	
	String str2="Good Person";
	System.out.println(str2);
	
	
	
	String strnum="123456789";
	System.out.println(strnum);
	//charAt
	System.out.println(strnum.charAt(2));
	//String.concat
	System.out.println(str2.concat(strnum));
	//contain
	System.out.println(strnum.contains("123"));
	//end With
	System.out.println(strnum.endsWith("789"));
	//equals(content references)
	System.out.println(strnum.equals(str));
	//==(Object Address references)
	System.out.println(strnum==str);
	//Ignores case sensetive
	System.out.println(str1.equalsIgnoreCase("WELcome"));
	//Get Bytes
	System.out.println(str1.getBytes());
	//Index value
	System.out.println(str1.indexOf('W'));
	//Lower case
	System.out.println(str1.toLowerCase());
	//Upper case
	System.out.println(str1.toUpperCase());
	
	
	
	}
}
