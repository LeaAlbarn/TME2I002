public class Complexe {
	public double reelle ;
	public double imag ;
	
	public Complexe(double reelle, double imag){
		this.reelle = reelle ; 
		this.imag = imag ;
	}
	
	public Complexe() {
		this.reelle = Math.random()*5+(-2);
		this.imag = Math.random()*5+(-2);
	}
	
	public String toString() {
		String s = "("+reelle+"+"+imag+"i)";
		return s;
	}
	
	public Complexe addition(Complexe x, Complexe y){
		Complexe resultat = new Complexe((x.reelle+y.reelle),(x.imag+y.imag));
		return resultat;
	}
	
	public Complexe multiplication(Complexe x, Complexe y){
		Complexe resultat = new Complexe((x.reelle*y.reelle-x.imag*y.imag), (x.reelle*y.imag+y.reelle*x.imag)) ;
		return resultat ;
	}
	
	public boolean estReel (Complexe z){
		if (z.imag == 0) {
			return true ;
		}
		return false;
	}
	
}
