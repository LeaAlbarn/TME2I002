public class TestTracteur {
	public static void main (String args[]) {
		
		Roue roue1 = new Roue(120);
		Roue roue2 = roue1;
		Roue roue3 = new Roue();
		Roue roue4 = roue3;
		
		Cabine cabineb = new Cabine(6,"bleue");
		Tracteur t1 = new Tracteur(cabineb,roue1,roue2,roue3,roue4);
		Tracteur t2 = new Tracteur(t1);
		
		t2.cab.setCouleur("verte");
		
		
		System.out.println(roue1.toString());
		System.out.println(roue2.toString());
		System.out.println(roue3.toString());
		System.out.println(roue4.toString());
		
		System.out.println(cabineb.toString());
		System.out.println(t1.toString());
		System.out.println(t2.toString());
	}
	
}
		
