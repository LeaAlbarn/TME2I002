public class Personne {
	private String nom ;
	public Personne conjoint ;
	
	public Personne() {
		this("Individu");
		nom = nom + tirageLettre()+ tirageLettre() + tirageLettre() ; 
		conjoint = null ;
	}
	
	public Personne(String nom) {
		this.nom=nom;
	}
	
	private char tirageLettre() {
		return (char)((int) (Math.random()*26)+'A');
	}
	
	public String toString () {
		if (this.conjoint==null)
			return (this.nom+" , celibataire");
		return (this.nom+", mari(e)");
	}
	
	public void epouser (Personne p) {
		if ((this.conjoint==null)&&(p.conjoint==null)){
			conjoint = p;
			p.conjoint = this;
		}else {
			System.out.println("Ce mariage est impossible!");
		}
	}
	
	public void divorcer() {
		if (this.conjoint!=null){
			this.conjoint.conjoint=null;
			this.conjoint=null;
		}
	}
	
}
