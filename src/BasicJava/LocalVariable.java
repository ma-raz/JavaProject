package BasicJava;

public class LocalVariable {
	//class var
	static int p;
	static String m;
	static double d;
	
	int age=25;
	String name="Raz";


	public static void main(String[] args) {
//local var, we have to declare the value
		
    int i=10;
    int p=20;
    System.out.println(i);
    
    System.out.println(p); //class variable are static
    System.out.println(m);
    System.out.println(d);
    
    LocalVariable ab=new LocalVariable();
    System.out.println(ab.name); //by creating object
    System.out.println(ab.age);
    

}
}