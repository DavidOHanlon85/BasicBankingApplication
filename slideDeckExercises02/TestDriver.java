package slideDeckExercises02;

import java.util.ArrayList;

public class TestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount pa = new PersonalAccount(12345678, "John", "Doe");
		
		pa.displayAll();
		
		BankAccount ba = new BusinessAccount(12345678, "ConnectTheDotsDesign");
		
		ba.displayAll();
		
		if (ba instanceof BusinessAccount) {
			BusinessAccount temp = (BusinessAccount) ba;
			temp.printStatement();
		}
		
		ArrayList<BankAccount> accs = new ArrayList<BankAccount>();
		accs.add(pa);
		accs.add(ba);
		
		System.out.println();
		System.out.println("Printing in the general");
		System.out.println();
		for (BankAccount b : accs) {
			b.displayAll();
			System.out.println();
		}
		
		
		
	}
	
	

}
