public class TestLettre  {
	public static void main (String [] args) {
	
	for (char i = 'a'; i<= 'z'; i++){
		Lettre k = new Lettre(i);
		System.out.println(k.getCodeAscii());
	}
	int compteur = 0;
	
	for (char j = 'a'; j<='z'; j++){
		
			Lettre l = new Lettre(j);
			System.out.print(l.getCarac()+" ");
			compteur = compteur + 1;
			if (compteur%5 == 0){
				System.out.print("\n");
			}
		
	}
	
	
	}
}
