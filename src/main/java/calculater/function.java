package calculater;

public class function {
	//Mathod :add()
	 public static void add() {
		 //local variable
		 int a = 70;
		 int b = 50;
		 int c = a + b;
		 
		 System.out.println("Result of addition = "+ c);
		 
	 }
	 public static void sub() {
		 int a = 70;
		 int b = 50;
		 
		 System.out.println("Result of subtraction = "+ (a-b));
		 	 
	 }
	 public static void mult() {
		 int a = 10;
		 int b = 5;
		 int c = a * b;
		 
		 System.out.println("Resule of multipley = "+ (a*b));
	 }
	 public static void div() {
		 int a = 20;
		 int b = 5;
		 
		 
		 System.out.println("Resule of division = "+ (a/b));	 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I am main mathod");
		add();
		sub();
		mult();
		div();
		
	}

}
