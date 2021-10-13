package javaday9;

public class DEmo2 {
	public static void main(String[] args) {
		String s1,s2;
		
		s1 = new String("demo");
		
		s2=s1;
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println("test string");
		System.out.println(s2);
		System.out.println("=================");
		
		StringBuilder s3,s4;
		s3=new StringBuilder("sheela");
		s4=s3;
		System.out.println(s3);
		System.out.println(s4);
		s3=s3.append("malla");
		System.out.println(s4);
	}

}
