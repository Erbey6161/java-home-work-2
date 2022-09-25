public class Main {
	public static void main(String[] args) {

		sayiBulmaca(); 
		
			
	}

	
	
	
	
	public static void sayiBulmaca () {
		int[] sayilar = new int[] {1,2,5,7,9,0};
		
		int aranacak = 9 ;
		boolean varmi = false;
		
		for (int i = 0; i < sayilar.length; i++) {
			if (aranacak == sayilar[i]) {
				varmi = true;
				break;
			}
						
		}
		if (varmi) {
			mesajVer("sayı mevcut değildir"+ aranacak);
		}else {
			mesajVer("sayı mevcut değildir"+ aranacak);
		}
	}
	
	public static void mesajVer (String mesaj) {
		
		System.out.println(mesaj);
	}	
		
		
	

}
