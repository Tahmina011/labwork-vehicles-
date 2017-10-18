package vehicle;

public interface Vehicles {
	void speed();
	void isrunning();

}

class Land implements Vehicles{
	
	public void speed()
	{
		System.out.println("land type vehicle");
	}
	public void isrunning()
	{
		System.out.println("running on land");
	}
}
class Water implements Vehicles
{
	public void speed()
	{
		System.out.println("water type vehicle");
	}
	public void isrunning()
	{
		System.out.println("running on water");
	}
}

class Air implements Vehicles
{
	public void speed()
	{
		System.out.println("air type vehicle");
	}
	public void isrunning()
	{
		System.out.println("running through air");
	}
}