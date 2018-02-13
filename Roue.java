public class Roue {

	private int diametre;
	
	public Roue(){
		this(60);
	}
	
	public Roue(int diametre){
		this.diametre= diametre ; 
	}
	
	public String toString() {
		return ("le diametre de la roue est de "+diametre+" cm.");
	}
}
