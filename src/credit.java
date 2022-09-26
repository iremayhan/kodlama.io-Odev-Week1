import java.util.ArrayList;
//import java.util.Collections;

public class credit {

	public static void main(String[] args) {
		//CreditManager creditManager = new CreditManager();
		//creditManager.add();
		//creditManager.calculate();
		
		//MortgageManager mortgageManager = new MortgageManager();
		//mortgageManager.add();
		
		
		//CreditManager[] credits = new CreditManager[3];
		
		ArrayList<CreditManager> credits = new ArrayList<CreditManager>(); //Genericleri araştır. Bu bir generics örneğidir.
		//ArrayList arka planda bir diziyi tutar. ArrayList'e dizinin boyutlarını vermezsin. Sen operasyona ekledikçe koda eklenir.
		
		credits.add(new MortgageManager());
		credits.add(new VehicleManager());
		credits.add(new OfficerManager());
		
		for(CreditManager credit : credits) {
			credit.calculate();
		}
		
		
		//credits[0] = new MortgageManager();
		//credits[1] = new VehicleManager();
		//credits[2] = new OfficerManager();
		
			
		
		//for(int i=0; i<credits.length; i++) {
			//credits[i].calculate();
		//}
		
		
	}
		
}
