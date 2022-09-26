
public class metotlar {

	public static void main(String[] args) {
		mesajVer("İrem");
		mesajVer("Onur");
		
		hesapla();
		
		System.out.println(toplananSayilarinYuzdeOnu(100,0));
		System.out.println(toplananSayilarinYuzdeOnu(7,55));
		
	}

	
	public static void mesajVer(String isim) {
		System.out.println("Merhaba " + isim);
		//10larca satır olduğunda
	}
	
	public static void hesapla() {
		System.out.println("Hesaplandı");
		//10larca satır olduğunda
	}
	
	public static int topla(int sayi1, int sayi2) {
		int toplam = sayi1 + sayi2;
		return toplam;
	}
	
	//toplanan iki sayının %10 unu bul
	public static double toplananSayilarinYuzdeOnu(int sayi1, int sayi2) {
		int toplam = topla(sayi1,sayi2);
		double sonuc = toplam * 10/100;
		return sonuc; 
	}
	
	public static double krediHesapla(double krediMiktari) {
		//hesaplar yapılır
		return 350000;
		
	}
	
	
	//DRY : Do not repeat yourself (temiz kod yazmak için çok önemli bir prensip)
	//Temiz kod tekniklerinde bir kod sadece bir işi yapmalıdır, iç içe yazılmamalıdır.
}
