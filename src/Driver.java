
public class Driver {
	private String name;
	private float balance;
	private String cartitle;
	private int[] coordinates;
	private String status;
	private Rating rating;
	public Driver(String name, float balance, String cartitle, int coordinateX, int coordinateY) {
		this.setName(name);
		this.setBalance(balance);
		this.setCartitle(cartitle);
		coordinates = new int[2];
		coordinates[0] = coordinateX;
		coordinates[1] = coordinateY;
		status = "available";
 	}
	
	public int[] getLocation() {
		return coordinates;
	}
	
 	public boolean acceptRequest() {
		if (status.equals("available")){
			changeStatus();
			return true;
		}
		else 
			return false;
	}
	
	public void addbalance(float fare) {
		setBalance(getBalance() + fare);
	}
	
	public void changeStatus() {
		if (status.equals("available")){
			status = "occupied";
		}
		else 
			status = "available";	
	}
	
	public String getStatus() {
		return status;
	}
	
	public void changeLocation(int coordinateX, int coordinateY) {
		coordinates[0] = coordinateX;
		coordinates[1] = coordinateY;
	}
	
	public void addRating(double newRating) {
		rating.calcRating(newRating);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public String getCartitle() {
		return cartitle;
	}

	public void setCartitle(String cartitle) {
		this.cartitle = cartitle;
	}
}
