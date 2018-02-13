public class Segment{
	// public static void main (String[] args){
		public double x ;
		public double y ; 
		
		public Segment(int extX, int extY){
			x = extX;
			y = extY;
		}
		
		public double longueur(){
			if (x-y > 0){
				return x-y ;
			}
			else{
				return y-x ;
			}
		}
		
		public String toString () {
			String s = "Segment ["+x+","+y+"]";
			return s;
		}
		
}
