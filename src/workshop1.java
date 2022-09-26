
public class workshop1 {

	public static void main(String[] args) {
	int[] sayilar = new int[] {1,2,3,4,5,6,7,8,9,10};
	int aranan = 3;
	
	boolean varMidir = sayiBul(sayilar, aranan);
	mesajVer(varMidir,aranan);
	
	}
	
	public static void mesajVer(boolean varMidir, int aranan) {
		String mesaj = "";
		
			if(varMidir) {
				mesaj= "Aranan sayı bulundu: " + aranan;
				System.out.println(mesaj);
			}else {
				mesaj = "Aranan sayı bulunamadı: "+ aranan;
				System.out.println(mesaj);
			}
	}
	
	public static boolean sayiBul (int[] sayilar, int aranan) {
		
		
		boolean varMidir = false;
		
		for(int sayi : sayilar) {
			if(sayi == aranan) {
				varMidir = true;
			}
			
		}
		
		return varMidir;
		
		
		}
		
	
	//Bir fonksiyon yaz, bool döndürsün. fonksiyonun adı sayiBul olsun.
	//İki parametre alsın. p1: dizi p2: 3
	//3 sayısı dizide vardır.
		
}
