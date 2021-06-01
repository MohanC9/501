package june01;

public class MethodOverLoading {
	public static int m1(int a) {
		System.out.println("int value "+a);
		return a;
	}
	public static float m1(float a) {
		System.out.println("float value "+a);
		return a;
	}
	public static double m1(double a) {
		System.out.println("double value "+a);
		return a;
	}
	public static char m1(char a) {
		System.out.println("char value "+a);
		return a;
	}
	public static boolean m1(boolean a) {
		System.out.println("boolean value "+a);
		return a;
	}
	public static long m1(long a) {
		System.out.println("long value "+a);
		return a;
	}


	public static void main(String[] args) {
		m1(6.6f);
		m1('C');
		m1(5<7);
		m1(7478777777777778L);
		m1(21191);
		m1(44.555555);
	}

}

