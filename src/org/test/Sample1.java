package org.test;

public class Sample1 {
public static void main(String[] args) {
//	//
 
 
  
  String s= "greens";
  String s3= "tech";
 StringBuffer s2 = new StringBuffer("greens");
 StringBuffer s4= new StringBuffer("tech");
 System.out.println(System.identityHashCode(s2));
 System.out.println(System.identityHashCode(s4));
 s2.append(s4);
 System.out.println(s2);
 System.out.println(System.identityHashCode(s2));
 
  
  
  
 
	
	
	

		
}
}
