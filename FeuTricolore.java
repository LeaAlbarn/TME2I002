public class FeuTricolore {
	private Lampe verte ;
	private Lampe orange ;
	private Lampe rouge ; 
	
	public FeuTricolore(){
		this(new Lampe(),new Lampe(),new Lampe());
	}
	
	public FeuTricolore(Lampe verte, Lampe orange, Lampe rouge){
		this.verte=verte;
		this.orange=orange;
		this.rouge=rouge;
	}
	
	public String toString() {
		String s = "le feu a sa lampe verte "+verte.etat+" sa lampe orange "+orange.etat+" sa lampe rouge "+rouge.etat;
		return s;
	}
}
