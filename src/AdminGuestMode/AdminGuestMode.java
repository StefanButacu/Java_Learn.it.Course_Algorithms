package AdminGuestMode;

public class AdminGuestMode {
	public static void main(String[] args) {
		boolean isGuest = false;
		boolean isAdmin = false;
		for(String s: args) {
			if (s.equals("--admin"))
				isAdmin = true;
			if (s.equals("--guest"))
				isGuest = true;
		}
		if(isAdmin && isGuest)
			System.out.println("Please select either 'admin' or 'guest' mode");
		else if(isAdmin)
			System.out.println("Hello admin");
		else if(isGuest)
			System.out.println("Hello guest");

		
	}
}
