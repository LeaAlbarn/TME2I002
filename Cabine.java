public class Cabine {
	
	public double volume ;
	public String couleur ; 
	
	public Cabine(double volume, String couleur) {
		this.volume = volume;
		this.couleur = couleur;
	}
	
	public String toString() {
		String s = "Le volume de la cabine est "+volume+" et sa couleur est "+couleur;
		return s;
	}
	
	public void setCouleur(String couleur){
		this.couleur= couleur;
	}
}
