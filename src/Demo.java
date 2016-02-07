import java.util.Scanner;

public class Demo {

	static Server server = Server.getInstance();
	static User curUser;
	public static void main(String[] args) {
		//server.addUser();
		Scanner sc = new Scanner(System.in);
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
			logIn()
		}
	}
	
	public static boolean logIn(){
		curUser = server.findUser(username, pass);
		if(curUser == null)
			return false;
		return true;
	}

}
