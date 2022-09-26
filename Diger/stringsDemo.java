
public class stringsDemo {

	public static void main(String[] args) {
		String mesaj = "  Saat çok geç oldu.  ";
		System.out.println(mesaj);
		
			/*System.out.println("Eleman sayısı: "+mesaj.length());
			System.out.println("6. eleman: "+mesaj.charAt(5));
			System.out.println(mesaj.concat("Yaşasın!"));
			System.out.println(mesaj.startsWith("S"));
			System.out.println(mesaj.startsWith("s"));
			System.out.println(mesaj.endsWith("."));
			char[] karakterler = new char[5];
			
			mesaj.getChars(0, 5, karakterler, 0);
			System.out.println(karakterler);
			
			System.out.println(mesaj.indexOf("aa")); //karakterler arasından ilk bulduğunun sırasını verir.
			//sonraki aynı karakterleri önemsemez.
			System.out.println(mesaj.lastIndexOf('a'));*/
			
		
			String yeniMesaj = mesaj.replace(' ', '-');
			System.out.println(yeniMesaj);
			System.out.println(mesaj.substring(2,7));//Mesajın 2. indexinden itibaren aldı. 7. indexi dahil etmeden 7.indexe kadar yazdırdı.
			
			for(String kelime : mesaj.split(" ")) {
				System.out.println(kelime);
			}
			
			System.out.println(mesaj.toLowerCase());
			System.out.println(mesaj.toUpperCase());
			System.out.println(mesaj.trim());
			
	}

}
