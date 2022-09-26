public class ReCapDemo1 {

	public static void main(String[] args) {
		int sayi1 = 27;
		int sayi2 = 25;
		int sayi3 = 28;
		
		int enBüyük = sayi2;
		
		if (enBüyük<sayi1) {
			enBüyük = sayi1;	
		}
		
		if (enBüyük<sayi3) {
			enBüyük = sayi3;
		}
		
		System.out.println("En büyük sayı: " + enBüyük);
		
	}
}