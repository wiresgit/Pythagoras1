package pythagoras;

public class Pyth 
{

	public double b;
	public double a;
	public double c;
	public double aqua;
	public double bqua;
	
	
	
	public void seta(double a)
	{
		this.a = a;
	}
	
	public void setb(double b)
	{
		this.b = b;
	}
	
	public double geta()
	{
		return a;
	}
	
	public double getb()
	{
		return b;
	}
	public double berechneaquatrat()
	{
		aqua = (a*a);
		return aqua;
	}
	
	public double berechnebquatrat()
	{
		bqua = (b*b);
		return bqua;
	}
	
	public double berechenec()
	{
		c = (aqua)+(bqua);
		return c;
	}
}
