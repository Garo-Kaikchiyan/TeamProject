public class CreditCard {
	
	private String number, cardHolderName;
	private int secretCode, expireDay, expireMonth;
	

	

	public CreditCard(String number, String cardHolderName, int secretCode, int expireDay, int expireMonth) {
		this.number = number;
		this.cardHolderName = cardHolderName;
		this.secretCode = secretCode;
		this.expireDay = expireDay;
		this.expireMonth = expireMonth;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	

}
