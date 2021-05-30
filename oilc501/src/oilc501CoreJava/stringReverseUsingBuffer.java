package oilc501CoreJava;

import java.util.Scanner;

public class stringReverseUsingBuffer {

	public static void main(String[] args) {
	
		StringBuffer sb = new StringBuffer("Mohan");
		System.out.println("String Buffer - "+sb);
		sb.reverse();
		System.out.println("Reverse String Buffer - "+sb);
	}
}
