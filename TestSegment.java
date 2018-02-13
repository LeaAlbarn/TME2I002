public class TestSegment  {
	public static void main (String[] args){
	
	Segment segment1 = new Segment(6,8);
	Segment segment2 = new Segment(5,12);
	
	System.out.println(segment1.toString());
	System.out.println(segment2.toString());
	
	if (segment1.longueur > segment2.longueur){
		System.out.println("La longueur du segment le plus long, le segment 1, est :" 	+segment1.longueur);
		}
		
	else {
	 System.out.println("La longueur du segment le plus long, le segment 2, est :" 	+segment1.longueur);
		}
	}
}
