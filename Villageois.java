public class Villageois {
	String nom ;
	double poids;
	boolean malade ;
	
	public Villageois (String nomVillageois){
		nom = nomVillageois;
		poids = Math.random()*100+50;
		
		if (Math.random() < 0.20) {
		malade = true ;
		}
		else {
		malade = false ;
		}
	}
	
	public String getNom() {
		return nom ; 
	}
	
	public double getPoids(){
		return poids;
	}
	
	public boolean getMalade(){
		return malade;
	}
	
	public String toString() {
		String s ="villageois : "+nom+", poids : "+poids+", malade : "+malade;
		return s;
	}
	
	public double poidsSouleve(){
		if (malade == true ){
			return poids/4;
		}
		else{
			return poids/3 ;
		}
	}
	
		
	
	
}
