/**
 * 
 */
package slideDeckExercises02;

/**
 * This is the Bank Account class
 */
public class BankAccount {

	private int accNumber;

	/**
	 * Default constructor for Bank Account
	 */

	public BankAccount() {

	}

	/**
	 * Constructor with args
	 * 
	 * @param accNumber
	 */
	public BankAccount(int accNumber) {
		this.setAccNumber(accNumber);
	}

	// Getters and Setters

	/**
	 * @return the accNumber
	 */
	public int getAccNumber() {
		return accNumber;
	}

	/**
	 * @param accNumber the accNumber to set
	 */
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
	
	// displayAll Method
	
	public void displayAll() {
		System.out.println("Acc Number: " + accNumber);
	}

}
