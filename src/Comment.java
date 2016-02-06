
public class Comment {
	
	private String text;
	private User user;
	
	Comment(String text, User user){
		this.text = text;
		this.user = user;
	}
	
	@Override
	public String toString() {
		return user.getName() + " :\n" + text;
	}
}
