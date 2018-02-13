public class TestVillageois  {
	public static void main (String[] args){
	
	Villageois villageois1 = new Villageois ("Arnold");
	Villageois villageois2 = new Villageois ("Harold");
	Villageois villageois3 = new Villageois ("Chantal");
	Villageois villageois4 = new Villageois ("Frederick");
	
	System.out.println(villageois1.toString());
	System.out.println(villageois2.toString());
	System.out.println(villageois3.toString());
	System.out.println(villageois4.toString());
	
	double poidsTotal = (villageois1.poidsSouleve())+(villageois2.poidsSouleve())+(villageois3.poidsSouleve())+(villageois4.poidsSouleve());
	
	if (poidsTotal >= 100){
		System.out.println("Réussite! Poids Souleve :"+poidsTotal);
	}
	else {
		System.out.println("Echec! Poids Souleve :"+poidsTotal);
	}

	
	}
}
