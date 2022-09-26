
public class sesliHarflerHocadan {

	public static void main(String[] args) {
		char harf = 'ö';
		
		switch (harf) {
		case 'a':
		case 'ı':
		case 'o':
		case 'u':
			System.out.println("Kalın sesli harftir.");
			break;
			default:
				System.out.println("İnce sesli harftir.");
		}

	}

}
