import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class User {
	
	private String name;
	private String password;
	private ArrayList<Picture> picturesOwned;
	static Server server;
	private ArrayList<CreditCard> cards;
	
	
	//Adding new user in the database
	public User(String name, String password) {
		/*//Password verification
		if(password.length() < 8) {
			System.out.println("Your password should be at least 8 characters.\n Please enter it again");
		}
		else {
			this.password = password;
		//Username verification	
		for(Map.Entry<String, User> entry : this.server.allUsers.entrySet()) {
			String key = entry.getKey();
			if(!(key.equals(name))) {
				this.name = name;
			} else {
				System.out.println("The username has already been used!");
			}
		}
		//If the username and password are set, put the user in the database
		if(this.name != null && this.password != null) {
			server.allUsers.put(this.name, this);
			}
		}*/
		this.name = name;
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
	
	//Change the password
	void changePassword(String newPassword) {
		this.password = newPassword;
	}
	
	
	//Buy a wallpaper
	void buyPicture(Picture picture) {
		if(this.picturesOwned.contains(picture)) {
			System.out.println("You already own this picture.");
		} else {
			this.picturesOwned.add(picture);
		}
	}
	
	//View all pictures
	void viewAllPictures() {
		for(int i = 0; i < server.allPictures.size(); i++) {
			server.allPictures.get(i);
		}
	}
	
	//Search by categories
	void searchByCategories(String category) {
		for(int i = 0; i < server.allPictures.size(); i++) {
			if(server.allPictures.get(i).getCategories().contains(category)) {
				server.allPictures.get(i);
			}
		}
	}
	
	void addCard()
	{
		Scanner sc = new Scanner(System.in);
		String number, cardHolderName;
		int secretCode, expireDay, expireMonth;
		do
		{
			System.out.print("Enter card number: ");
			number = sc.next();
		}
		while(!cardNumberValidation(number));
		
		do
		{
			System.out.print("Enter cardholder name: ");
			cardHolderName = sc.next();
		}
		while(!cardNameValidation(cardHolderName));
		
		while(true)//Secret code validation
		{
			System.out.print("Enter secret code: ");
			secretCode = sc.nextInt();
			if(secretCode / 100 < 1 || secretCode / 100 > 9)
				System.out.println("The secred code contains 3 digits");
			else
				break;
		}
		
		while(true)//Expiration day validation
		{
			System.out.print("Enter exparation day: ");
			expireDay = sc.nextInt();
			if(!(expireDay > 0 && expireDay <= 31))
				System.out.println("Please enter a valid day of the month");
			else
				break;
		}
		
		while(true)//Expiration month validation
		{
			System.out.print("Enter exparation day: ");
			expireMonth = sc.nextInt();
			if(!(expireMonth > 0 && expireMonth <= 12))
				System.out.println("Please enter a valid month");
			else
				break;
		}
		
		
		cards.add(new CreditCard(number, cardHolderName, secretCode, expireDay, expireMonth));
	}
		

	public String getName() {
		return name;
	}

	private boolean cardNumberValidation(String number)
	{
		if(number.length() != 16)
		{
			System.out.println("Card numbers have 16 digits");
			return false;
		}
		for(int i = 0; i < number.length(); i++)
		{
			if(number.charAt(i) < '0' || number.charAt(i) > '9')
			{
				System.out.println("The card number can only have digits");
				return false;
			}
		}
		return true;
	}
	
	private boolean cardNameValidation(String cardHolderName)
	{
		String name = cardHolderName.toLowerCase();
		for(int i = 0; i < name.length(); i++)
		{
			if(name.charAt(i) < 'a' || name.charAt(i) > 'z')
			{
				System.out.println("The cardholder name can only have letters");
				return false;
			}
		}
		return true;
	}
}
	
	
	


