package may28;

public class pyramid {
	public static void main(String[] args) {


		int i,j,a=6;
		for(i=0;i<a;i++) {
			
			for(j=a-i;j>1;j--) {
				System.out.print(" ");
			}
			
			for(j=0;j<=i;j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
}
