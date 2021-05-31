package jun01;

public class MethodTypes {
	public static String StaticMethod(String s) {
		System.out.println("Static Method Print --- "+s);
		return s;
	}
	public String NonStaticMethod(String s) {
		System.out.println("Non Static Method Print --- "+s);
		return s;
	}
	
	
	public static void main(String[] args) {
		
		//Using Class Name and Later on with method(Static Method)
		
		MethodTypes.StaticMethod("Hi Mohan");
		
		
		//Using Object Reference to call method(Non Static Method)

		String s ="Bye Mohan";
		
		MethodTypes method = new MethodTypes();
		
		String str = method.NonStaticMethod(s);
		
		
	}
	

}
