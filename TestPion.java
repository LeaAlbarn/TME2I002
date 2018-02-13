public class TestPion {
	public static void main(String [] args) {
	
	Pion unPion=new Pion("Atchoum");
	Pion autrePion=unPion;
	autrePion.setNom("Dormeur");
	System.out.println(unPion.getNom());
	
	}
}
