
public class loopDemo {

	public static void main(String[] args) {
		//for
		for(int i =1; i<=10; i++) {
			System.out.println(i);
		}
		System.out.println("Döngü bitti.");
		
		for(int i =1; i<=10; i+=2) {
			System.out.println(i);
		}
		System.out.println("Döngü bitti.");
		
		for(int i =2; i<=10; i+=2) {
			System.out.println(i);
		}
		System.out.println("For döngüsü bitti.");
		
		//while
		int i = 1;
		while(i<=10) {
			System.out.println(i);
			i++; //While döngüsünde sayacın ilerleyişi bu şekilde belirtilmezse sonsuz döngüye girer.
		}
		System.out.println("While döngüsü bitti");
		
		//Do-while
		int j = 1;
		do {
				System.out.println(j);
				j++;
		}while(j<=10);
		System.out.println("Do-while döngüsü bitti.");
		//do-while bloğunda şart sağlanmasa bile döngü çalışır. 
	}
//döngü, bir programda birbirine benzeyen işleri yaptırmaya yarar.
}
