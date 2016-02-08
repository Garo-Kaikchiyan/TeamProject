import java.util.Scanner;

public class Demo {

	static Server server = Server.getInstance();
	static User curUser;
	public static void main(String[] args) {
		//server.addUser();
		Scanner sc = new Scanner(System.in);
		while(true){
			int option = 0;
			do{
				System.out.println("Please enter the number of the option you want:");
				System.out.println("1.Register\n2.Login\n3.View Pictures");
				option = sc.nextInt();
				if(option >= 1 && option <= 3)
					break;
				else
					System.out.println("Please enter a valid option (1, 2 or 3)");
			}while(true);
			
			switch(option){
			case 1:
				server.addUser();
				break;
			case 2:
				logIn();
				break;
			}
		}
	}
	
	public static void logIn(){
		String username, pass;
		curUser = null;
		Scanner sc = new Scanner(System.in);
		while(curUser == null){
			System.out.print("Please enter your username: ");
			username = sc.nextLine();
			System.out.print("Please enter your password: ");
			pass = sc.nextLine();
			curUser = server.findUser(username, pass);
		}
		System.out.println("Login succesful!");
		
	}

}
