
public class Main {
	public static void main(String[] args) {
		
		//OgretmenKrediManager krediManager = new OgretmenKrediManager();
		//krediManager.hesapla();
		
		CrediUI crediUI = new CrediUI();
		crediUI.krediHesapla(new AskerKrediManager());
		
	}
}