package BasicJava;

public class StringConcatenation {

	public static void main(String[] args) {
		//merge two variable
		
		System.out.println("String Concatenation");
		System.out.println("-------------------------");
		int a=100, b=200;
		double d1=12.33, d2=13.33;
		String x="Java ",y="Selenium";
		
		System.out.println(a+b);  //300
		System.out.println(x+y); //Java Selenium
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		
		char c1='a'; //97
		char c2='b'; //98
		System.out.println(c1+c2); //195 ASCII Value
	}

}
