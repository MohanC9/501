package oilc501CoreJava;

public class MultiArray {

	public static void main(String[] args) {
		//String names[][]=new String [3][2];
		/*
		 * names[0][0]="Ntr"; names[1][0]="Prabhas"; names[2][0]="Allu Arjun";
		 * names[0][1]="Savithri"; names[1][1]="Anushka"; names[2][1]="samantha"; //
		 * System.out.println(names[1][1] +" "+names[1][0]); for(int i=0; i<2;i++) {
		 * System.out.println("names of "+ names[0][i]); }
		 */
		
		
		String s[][]= { {"Ntr","Savitri"},{"Prabhas","Anushka"},{"AlluArjun","Samantha"} };
		
		System.out.println(s.length);
		for(int i=0;i<s.length;i++) {
			
			for(int j=0;j<i-1;j++) {
			System.out.println(s[i][j]);
			}
		}
		
	}
}
