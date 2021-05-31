package classWork501;

import java.util.Scanner;

public class ScanAll {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the data - ");
		
		if(sc.hasNextInt()) {
			System.out.println("Int value is - "+sc.nextInt() );
		}
		else if(sc.hasNextFloat()) {
			System.out.println("Float value is - "+ sc.nextFloat());
		}
		else if(sc.hasNextLine()) {
			System.out.println("String value is - "+sc.nextLine());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.println("Enter data");
		 * 
		 * if(sc.hasNextInt()) { System.out.println("Int value "+sc.nextInt()); } else
		 * if(sc.hasNextFloat()) {
		 * 
		 * System.out.println("Float  value "+sc.nextFloat()); }
		 * 
		 * else if(sc.hasNextLine()) {
		 * System.out.println("String value "+sc.nextLine()); }
		 */
	}

}
