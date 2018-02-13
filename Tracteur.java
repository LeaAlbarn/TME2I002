public class Tracteur {
	
	public Cabine cab ; 
	public Roue roue1 ;
	public Roue roue2 ;	
	public Roue roue3 ;
	public Roue roue4 ;
	
	public Tracteur(Cabine c, Roue r1, Roue r2, Roue r3, Roue r4){
		this.cab=c;
		this.roue1=r1;
		this.roue2=r2;
		this.roue3=r3;
		this.roue4=r4;
	}
	
	public String toString() {
		String s = "Le Tracteur a une cabine "+cab.toString()+" et quatre roues "+roue1.toString()+","+roue2.toString()+","+roue3.toString()+" et "+roue4.toString() ; 
		return s;
	}
	
	public Tracteur clone() {
		Tracteur rtracteur = new Tracteur(cab, roue1, roue2, roue3, roue4);
		return rtracteur;
	}
	
	public Tracteur (Tracteur t) {
		this(t.cab, t.roue1, t.roue2, t.roue3, t.roue4);
	}
}
