package com.bridgelabz.hashtable;

import java.util.Hashtable;

public class MyMapNode{
    static Hashtable<String,Integer> wordsCount = new Hashtable<>();

    public static void main(String[] args) {
    	String sentence = "To be or not to be";
        String[] word = sentence.split(" ",0);
        for( String words : word ) {
            wordsCount.put(words, 0);
        }
        for( String compareWord : word ) {
            for ( String key : wordsCount.keySet() ) {
                if (compareWord.equals(key)) {
                    Integer value = wordsCount.get(key);
                    value++;
                    wordsCount.put(key, value);
                }
            }
        }
        System.out.println(wordsCount);
    }
}
