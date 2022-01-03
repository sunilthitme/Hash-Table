package com.bridgelabz.hashtable;

import java.util.Hashtable;

public class MyMapNode{
	public MyMapNode(String key, int value) {
		this.key = key;
		this.value = value;
	}
	int hashCode;
    String key;
    Integer value;
    MyMapNode next;
}
   