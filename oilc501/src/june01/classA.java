package june01;

public class classA {
	public static String str = "Maddy";
	private static String S = ". Talk to you Later";
	public String at(String s) {
		System.out.println(s+" "+str);
		return s;
	}
	public static void main(String[] args) {
		classA obj = new classA();
		obj.at("Heyy"+S);
	}
}
