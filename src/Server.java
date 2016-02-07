import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Server {

	private static Server instance = new Server();
	ArrayList<Picture> allPictures = new  ArrayList();
	TreeMap<String, User> allUsers = new TreeMap();
	
	private Server(){}
	
	public static Server getInstance(){
		return instance;
	}
	public User findUser(String name, String password){
		if(allUsers.containsKey(name))
		{
			if(allUsers.get(name).getPassword().equals(password))
				return allUsers.get(name);
			else{
				System.out.println("Incorrect password");
				return null;
			}
		}
		System.out.println("Incorrect username");
		return null;
	}
	
	public void addUser()
	{
		String name, pass, passConfirm;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.print("Enter username: ");
			name = sc.next();
		}
		while(!nameValidation(name));
		
		do
		{
			System.out.print("Enter passoword: ");
			pass = sc.next();
		}
		while(!passValidation(pass));
		
		do
		{
			System.out.print("Confirm password: ");
			passConfirm = sc.next();
			if(!pass.equals(passConfirm))
				System.out.println("Password missmatch");
		}
		while(!pass.equals(passConfirm));
		
		allUsers.put(name, new User(name, pass));//adding a valid user to the database
		
	}
	
	private boolean nameValidation(String name){
		if(allUsers.containsKey(name))
		{
			System.out.println("Username already in use");
			return false;
		}
		return true;
	}
	
	private boolean passValidation(String pass)
	{
		if(pass.length() < 8)
		{
			System.out.println("Password too short");
			return false;
		}
		//add Upper case, lower case and digit validation
		return true;
	}
	

}
