/**
 * 
 */
package slideDeckExercises02;

import inClassCodingAlongBankAccount.BankAccount;

/**
 * 
 */
public class PersonalAccount extends slideDeckExercises02.BankAccount {
	
	private String firstName;
	private String lastName;

	/**
	 * Default constructor for Bank Account
	 */
	public PersonalAccount() {
	}
	
	
	
	/**
	 * Constructor with args
	 * 
	 * @param accNumber
	 * @param firstName
	 * @param lastName
	 */
	public PersonalAccount(int accNumber, String firstName, String lastName) {
		super(accNumber);
		this.firstName = firstName;
		this.lastName = lastName;
	}

	// Getters and Setters

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public void displayAll() {
		super.displayAll();
		System.out.println("First name: " +firstName);
		System.out.println("Last name: " +lastName);
	}
	

}
