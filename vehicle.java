package vehicle;

public class vehicle {

	public static void doSomething(Vehicles  t)
	{
		t.speed();
	}
	//variadic function
	public static void variadic(int ...a)
	{
		for(int i:a)
		{
			System.out.println(i);
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//polymorphism 
		car c = new car();
		Land l =new car();
		
		c.speed();
		l.speed();
		
		//type casting
		
		 Air obj=new aeroplane();
		 ((aeroplane) obj).speed();
		 doSomething((Vehicles) c);
		doSomething((Vehicles) obj);
		
		//variadic function
		variadic(1,2,3);
		variadic(10000,2000,30000,4000,5000);
	}

}
