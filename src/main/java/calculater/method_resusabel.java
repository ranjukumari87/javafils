package calculater;

public class method_resusabel {
	
	
	public static void add(int  a, int  b, int c,int d) {
		//int c = a+b;
		System.out.println ("add result of ="+(a+b+c+d));
	}
	public static void sub(int a ,int b) {
		//int c = a - b;
		System.out.println ("sub result of =" +(a-b));
		
	}
	public static void mult(int a ,int b ) {
		int c = a*b;
		System.out.println ("mult result of =" +c);
		
	}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    add(45,20,5,10);
    sub(70,50);
    mult(10,80);
    add(30,60,5,8);
    add(40,30,8,9);
    add(40,10,7,9);
    
    
	}

}
