public class TestComplexe {
	public static void main (String[] args) {
	
	Complexe comp1 = new Complexe(4,5.6);
	Complexe comp2 = new Complexe(1,2.5);
	Complexe comp3 = new Complexe(45,6);
	
	Complexe resultat1 = new Complexe(0,0);
	Complexe resultat2 = new Complexe(0,0);
	resultat1 = resultat1.addition(comp1,comp2);
	resultat2 = resultat2.multiplication(comp1,comp3);
	
	
	System.out.println(comp1.toString());
	System.out.println(comp2.toString());
	System.out.println(comp3.toString());
	System.out.println(resultat1.toString());
	System.out.println(resultat2.toString());
	
	}
}
	
	
	
		
