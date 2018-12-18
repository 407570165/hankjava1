package com.tom.PokerGame;

public class StringTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("hello world");
		String s2 =new String("hello world");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.substring(8));
		System.out.println(s1.substring(2, 8));
		String s="Hello world";
		for(int i=s.length()-1;i>=0;i--){
			System.out.print(s.charAt(i));
		}
		System.out.println();
		String s3="Jack Tom Eric";
		String name="Tom";
		System.out.println(s3.indexOf("c"));
		String s4=s3.replace("Tom", "boss");
		//String s4=s3.replaceAll(s3.substring(5, 8), name);
		System.out.println(s4);
		int index=s3.indexOf(name);
		System.out.println(s3.substring(0, index)+"boss"+s3.substring(8));
		int nn =Integer.parseInt("12");
		nn++;
		System.out.println(nn);
		Integer ii = nn;
		System.out.println(ii.intValue());
	}

}
