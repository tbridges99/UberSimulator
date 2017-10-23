
public class Passenger {
	String name;
	float balance;
	int[] coordinates;
	
	public Passenger(String name, float balance, int locationX1, int locationY1, int locationX2, int locationY2) {
		this.name = name;
		this.balance = balance;
		coordinates = new int[2];
		coordinates[0] = locationX1;
		coordinates[1] = locationY1;
 	}
	
	public int[] getLocation() {
		return coordinates;
	}
	
	public float getBalance() {
		return balance;
	}
	public void updateLocation(int x, int y) {
		coordinates[0] = x;
		coordinates[y] = y;
	}
	
	public void subtractBalance(float fare) {
		balance -= fare;
	}
}
