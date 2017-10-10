
public class Driver {
	private String name;
	private float balance;
	private String cartitle;
	private int[][] coordinates;
	private String status;
	private Rating rating;
	public Driver(String name, float balance, String cartitle, int[] coordinatesX, int[] coordinatesY) {
		this.name = name;
		this.balance = balance;
		this.cartitle = cartitle;
		coordinates = new int[2][2];
		coordinates[0][0] = coordinatesX[0];
		coordinates[1][0] = coordinatesX[1];
		coordinates[0][1] = coordinatesY[0];
		coordinates[1][1] = coordinatesY[1];
		status = "available";
 	}
	
	public boolean acceptRequest() {
		return true;
	}
	
	public void addbalance(float fare) {
		
	}
	
	public void changeStatus() {
		
	}
	
	public void changeLocation() {
		
	}
	
	public void CalcRating(Rating newRating) {
		
	}
}
