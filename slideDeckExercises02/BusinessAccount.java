/**
 * 
 */
package slideDeckExercises02;

/**
 * 
 */
public class BusinessAccount extends BankAccount implements Printable {
	
	private String businessName;

	/**
	 * This is the default constructor for BusinessAccount
	 */
	public BusinessAccount() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor with args for BusinessAccount
	 * @param accNumber
	 * @param businessName
	 */
	public BusinessAccount(int accNumber, String businessName) {
		super(accNumber);
		this.setBusinessName(businessName);
	}

	
	// Getters and Setters
	
	/**
	 * @return the businessName
	 */
	public String getBusinessName() {
		return businessName;
	}

	/**
	 * @param businessName the businessName to set
	 */
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	@Override
	public void displayAll() {
		// TODO Auto-generated method stub
		super.displayAll();
		System.out.println("Business name: " +businessName);
	}

	@Override
	public void printStatement() {
		System.out.println("Some function");
	}

}
