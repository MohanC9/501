package may28;

public class SingleArray {
	public static void main(String[] args) {
		int array[] = new int[]{33,44,22,55,66,77,88,99};
		
		System.out.println("Size of array is"+array.length);
		
				
		int max = array[0];
		int min = array[0];
		
		for(int i=1;i<array.length;i++) {
			if(array[i]>max)
				max = array[i];
			
			else if(array[i]<min)
				min = array[i];
			
			

		}
		System.out.println(min+" is smallest number ");
		System.out.println(max+" is largest number ");
	}
}
