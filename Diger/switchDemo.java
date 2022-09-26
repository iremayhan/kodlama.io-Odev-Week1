
public class switchDemo {

	public static void main(String[] args) {
		char grade = 'F';
		
		switch (grade) {
			case 'A':
				System.out.println("Süper: Geçtiniz");
				break;
			case 'B':
				System.out.println("Baya iyi : Geçtiniz");
				break;
			case 'C':
				System.out.println("İyi : Geçtiniz");
				break;
			case 'D':
				System.out.println("Nerdeyse kalıyordunuz ama : Geçtiniz");
				break;
			case 'F':
				System.out.println("Lütfen tekrar deneyiniz : Kaldınız");
				break;
			default:
					System.out.println("Geçersiz not!");
			}
		
	}

}
