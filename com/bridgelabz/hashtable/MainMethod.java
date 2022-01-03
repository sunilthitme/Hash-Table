package com.bridgelabz.hashtable;

public class MainMethod {
public static void main(String[] args) {
	HashOperation op=new HashOperation();
	String para="Paranoids are not paranoid because they are paranoid "
			+ "but because they keep putting themselves deliberately "
			+ "into paranoid avoidable situations";
	
	System.out.println(para);
	String[] sepWords=para.split(" ",0);
	for(String key:sepWords) {
		op.putHash(key,1);
		
}
	op.printmyMapNode();
}
}
