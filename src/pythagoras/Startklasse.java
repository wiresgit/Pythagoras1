package pythagoras;
import static java.lang.System.out;
import java.lang.Math;


public class Startklasse 
{

	public static void main(String[] args) 
	{
		Pyth l1;
		
		l1 = new Pyth();
		
		l1.seta(10);
		l1.setb(20);
		
		out.println("PYTHAGORAS");
		out.println("Sie haben folgenden wert für a eingegeben: " + l1.geta());
		out.println("Sie haben folgenden Wert für b eingegeben: " + l1.getb());
		out.println("Nach dem Satz des Pythagoras ergibt dies folgende Lösung.");
		out.println("a**2 = " + l1.berechneaquatrat());
		out.println("b**2 = " + l1.berechnebquatrat());
		out.println("c**2 = " + l1.berechenec());
		out.println("Damit beträgt die Strecke c: " + Math.sqrt(l1.berechenec()));

	}

}
