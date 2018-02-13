public class TestFeu {
	public static void main (String args []){
	
		Lampe verte1 = new Lampe();
		Lampe orange1= new Lampe();
		Lampe rouge1 = new Lampe();
		
		orange1.etat=true;
		
		FeuTricolore feu1= new FeuTricolore(verte1,orange1,rouge1) ; 
		
		System.out.println(feu1.toString());
	}
}
