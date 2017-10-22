
public class Passenger {
	String name;
	float balance;
	int[][] coordinates;
	
	public Passenger(String name, float balance, int locationX1, int locationY1, int locationX2, int locationY2) {
		this.name = name;
		this.balance = balance;
		coordinates = new int[2][2];
		coordinates[0][0] = locationX1;
		coordinates[1][0] = locationX2;
		coordinates[0][1] = locationY1;
		coordinates[1][1] = locationY2;
 	}
	
	public void subtractBalance(float fare) {
		balance -= fare;
	}
}
