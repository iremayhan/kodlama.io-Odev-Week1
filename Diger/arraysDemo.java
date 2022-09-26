
public class arraysDemo {

	public static void main(String[] args) {

		String [] ogrenciler = new String [4]; //dizi bu şekilde tanımlanmaktadır.
		ogrenciler[0]="İrem";
		ogrenciler[1]="Ali";
		ogrenciler[2]="Fadime";
		ogrenciler[3]= "Davut";
		
		
		for(int i=0;i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		}
		
		for(String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}
		
		
	}

}
