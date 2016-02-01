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
		String number = null, cardHolderName = null;
		int secretCode = 0, expireDay = 0, expireMonth = 0;
		//add card validation
		cards.add(new CreditCard(number, cardHolderName, secretCode, expireDay, expireMonth));
	}
}
	
	
	


