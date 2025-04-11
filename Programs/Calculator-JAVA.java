import java.util.Scanner;

abstract class Operation{
	double a,b ;
	Operation(double a, double b){
		this.a = a;
		this.b = b;
	}
	abstract public double calculate();
}

class Addition extends Operation{
	Addition(double a, double b){
		super(a,b);
	}
	public double calculate(){
		return (a+b);
	}
}

class Subtraction extends Operation{
	Subtraction(double a, double b){
		super(a,b);
	}
	public double calculate(){
		return (a-b);
	}
}

class Multiply extends Operation{
	Multiply(double a, double b){
		super(a,b);
	}
	public double calculate(){
		return (a*b);
	}
}

class Division extends Operation{
	Division(double a, double b){
		super(a,b);
	}
	public double calculate(){
		if(b != 0)
			return (a/b);
		else{
			System.out.println("Zero_Division_Error..!\nDivision Not possible..!");
			return -1;
		} 	
	}
}

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	   while(true){
		System.out.println("\t---Calculator---\n");
		System.out.println("Options--");
		System.out.print("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit\n\nWhat's Your Choice (1/2/3/4/5): ");
		int ch = sc.nextInt();
		sc.nextLine();

		if(ch == 5){
			System.out.println("Program Exits..!");
			return;
		}
		
		System.out.print("Enter 1st value: ");
		double a = sc.nextDouble();
		System.out.print("Enter 2nd value: ");
		double b = sc.nextDouble();

		switch(ch){
			case 1: Addition add = new Addition(a,b);
				System.out.println("Result: "+add.calculate()); 
				break;
			case 2: Subtraction sub = new Subtraction(a,b);
				System.out.println("Result: " +sub.calculate()); 
				break;
			case 3: Multiply mul = new Multiply(a,b);
				System.out.println("Result: "+mul.calculate()); 
				break;
			case 4: Division div = new Division(a,b);
				System.out.println("Result: "+div.calculate()); 
				break;
		}

	   }
	}
}