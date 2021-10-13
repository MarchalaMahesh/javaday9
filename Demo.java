package javaday9;

public class Demo {
public static void main(String[] args) {
	String s1="hello";
	String s2="hello";
	String s3=s1;
	System.out.println(s1==s2);
	
	System.out.println(s1+s2);
	s1=s1+"hi";
	System.out.println(s1);
	System.out.println(s1==s3);
			
}
}
