
public class donguler {

	public static void main(String[] args) {
		
			//i, index anlamındadır.
			String urun = "Kahve";
			for (int i = 1;i<10;i++) {
				System.out.println(urun + i);
			}
			for(int i=0;i<=10;i+=2) {
				System.out.println(i);
			}
			
			int sayi = 10;
			while(sayi<=100) {
				System.out.println(sayi);
				sayi = sayi + 10;
			}
			
			//do-while şartımız doğru olmasa bile bir kere çalışan döngü türüdür.
			int sayi2 = 11;
			do{
				System.out.println(sayi2);
				sayi = sayi + 10;
				
			}while(sayi2>100);
			
	}

}
