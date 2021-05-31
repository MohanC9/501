package jun01;

public class MethodWithOneOrMore {

	public static int[] m1(int a, int b){


		int d[] = new int[4];

		d[0] = a+b;
		d[1] = a-b;
		d[2] = a*b;
		d[3] = a/b;
		System.out.println("Data of Two integers are "+a+" and "+b);
		return d;
	}

	public static void main(String[] args) {
		int[] g = m1(2,2);

		System.out.println("addition is "+g[0]);
		System.out.println("subtraction is "+g[1]);
		System.out.println("multiplication is "+g[2]);
		System.out.println("division of "+g[3]);
	}

}
