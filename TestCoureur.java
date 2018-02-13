public class TestCoureur {
	public static void main (String [] args){
	
	Coureur c1 = new Coureur(1);
	Coureur c2 = new Coureur(2);
	Coureur c3 = new Coureur(3);
	Coureur c4 = new Coureur(4);
	
	System.out.println(c1.toString());
	System.out.println(c2.getNuDossard());
	System.out.println(c3.getTempsAu100());
	System.out.println(c4.getALeTemoin());
	c4.setALeTemoin(aLeTemoin);
	System.out.println(c4.toString());
	
	}
}
	
