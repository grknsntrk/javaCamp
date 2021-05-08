public class UserManager {

	public void add(User user) {

		System.out.println(user.nickname + "-->" + user.type +" Sisteme eklendi");

	}

	public void cokluekle(User[] users) {
		for(User user : users) {
			
			add(user);
			
		}
		
	}
		
	
	
	
	

}
