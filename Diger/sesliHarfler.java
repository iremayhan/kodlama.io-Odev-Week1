
public class sesliHarfler {

	public static void main(String[] args) {
		char harf = 'k';
		boolean inceSesliMi = false;

		char[][] harfler = new char[2][4];

		harfler[0][0] = 'e';
		harfler[0][1] = 'i';
		harfler[0][2] = 'ö';
		harfler[0][3] = 'ü';
		harfler[1][0] = 'a';
		harfler[1][1] = 'ı';
		harfler[1][2] = 'o';
		harfler[1][3] = 'u';

		for (int i = 0; i <= 0; i++) {
			// System.out.println(" ");
			for (int j = 0; j <= 3; j++) {
				// System.out.println(harfler[i][j]);
				if (harf == harfler[i][j]) {
					inceSesliMi = true;

				}

			}

		}

		if (inceSesliMi == true) {
			System.out.println("Bu bir ince seslidir: " + harf);
		} else {
			System.out.println("Bu bir kalın seslidir: " + harf);
		}

	}

}
