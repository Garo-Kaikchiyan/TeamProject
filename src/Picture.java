import java.util.ArrayList;

public class Picture {
	
	private String url;
	private static int ID = 0;
	private int id;
	private double price;
	private ArrayList<String> categories;
	private ArrayList<Comment> comments;
	private int timesBought;
	private int timesAddedInFavourites;
	//static Server server;
	
	Picture(ArrayList<String> categories, String url, double price){
		this.categories = categories;
		this.url = url;
		this.price = price;
		id = ID++;
	}
	public ArrayList<String> getCategories() {
		return categories;
	}
	
	public void printComments(){
		for(Comment c : comments)
			System.out.println(c);
	}
	@Override
	public String toString() {
		return "-----Picture " + id + "-----";
	}
	public void showInfo(){
		System.out.println("-----Picture " + id + "-----");
		for(String category: categories)
			System.out.print(category + " ");
		System.out.println("Price : " + price);
		System.out.println("Times bought : " + timesBought);
		
	}
	
	public void buyPicture(User user){
		user.buyPicture(this);
	}
	
	

}
