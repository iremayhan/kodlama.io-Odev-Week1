
public class diziler {

	public static void main(String[] args) {
		String[] sehirler1 = new String[] {"Niğde", "Bartın", "İstanbul"};
		
		for(String sehir : sehirler1) {
			System.out.println(sehir);
			
		}
		
		//klasik for döngüsü şöyledir;
		for(int i=0; i<3; i++) {
			System.out.println(sehirler1[i]);
			
		}
		
		String[] sehirrler1 = new String[] {"Ankara", "İstanbul", "İzmir"};
		String[] sehirler2 = new String[] {"Muğla", "Samsun", "Çanakkale"};
		
		sehirrler1=sehirler2;
		sehirrler1[0]="Mersin";
		System.out.println(sehirler2[0]);
		
		
		sehirrler1 = new String[4];
		sehirrler1[3]="Bursa";
		
		System.out.println(sehirrler1[1]);
		
			int sayi1=10;
			int sayi2=20;
			
			sayi1 = sayi2;
			sayi2 = 30;
			System.out.println(sayi1);
		
		
		//Value Types : bool, int, double...
		//Reference Types: array, class, abstract, interface
		
		
	}
}
