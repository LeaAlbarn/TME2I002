public class Coureur {
	public int nuDossard ;
	public double tempsAu100 ;
	public boolean aLeTemoin ;
	
	public Coureur(int nuDossard){
		tempsAu100=Math.random()*5+12;
		aLeTemoin=false;
		this.nuDossard=nuDossard;
	}
	
	public int getNuDossard(){
		return nuDossard;
	}
	
	public double getTempsAu100(){
		return tempsAu100;
	}
	
	public boolean getALeTemoin(){
		return aLeTemoin;
	}
	
	public void setALeTemoin(boolean b){
		if (b==true){
			b=false;
		}
		else {
			b=true;
		}
	}
	
	public String toString(){
		String s = "Coureur "+nuDossard+" tempsAu100 "+tempsAu100+"s au 100m aLeTemoin :"+aLeTemoin;
		return s;
	}
	
	public void passeTemoin(Coureur c){
		system.out.println("moi, coureur"+nuDossard+"je passe le témoin au coureur "+c);
		c.setALeTemoin(aLeTemoin);
	}
		
	
	
}
