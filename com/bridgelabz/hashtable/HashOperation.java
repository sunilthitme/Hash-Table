package com.bridgelabz.hashtable;

import java.util.HashMap;
import java.util.*;

public class HashOperation {
	int size=10;
	public final MyMapNode[] myMapNode = new MyMapNode[size];
	
	public int indexValueOdHashCode(int hash) {
		return Math.abs(hash % size);
	}
	
	public void putHash(String key, int value) {
		int index = indexValueOdHashCode(key.hashCode());

		if (myMapNode[index] == null) {
			myMapNode[index] = new MyMapNode(key, value);
		} else if (myMapNode[index] != null) {// already present
			MyMapNode temp = myMapNode[index];// create temp at that index
			while (temp.next != null) {
				if (temp.key.equals(key)) {// prev key and this key are same
					 temp.value++;// value==2
					break;
				} else {
					temp = temp.next;// go next node
				}
			}
			if (temp.key.equals(key)) {
                int newVal = temp.value;
                newVal++;
                temp.value = newVal;
            }else{
                temp.next = new MyMapNode(key,value);
            }
		}
	}

	void printmyMapNode() {
		for (int i = 0; i < myMapNode.length; i++) {
			MyMapNode temp = myMapNode[i];
			if (temp != null) {
				while (temp.next != null) {
					System.out.print( temp.key +" "+ temp.value);
					temp = temp.next;
				}
				System.out.println("\n"+ temp.key +" "+ temp.value);

			} else {
				System.out.println(" null ");
			}
		}
	}
}
