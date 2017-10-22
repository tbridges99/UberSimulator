
public class Driver {
	private String name;
	private float balance;
	private String cartitle;
	private int[][] coordinates;
	private String status;
	private float rating;
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
		if (status.equals("available"))
			return true;
		else 
			return false;
	}
	
	public void addbalance(float fare) {
		balance += fare;
	}
	
	public void changeStatus() {
		if (status.equals("available")){
			status = "occupied";
		}
		else 
			status = "available";	
	}
	
	public void changeLocation(int coordinateX1, int coordinateY1, int coordinateX2, int coordinateY2) {
		coordinates[0][0] = coordinateX1;
		coordinates[1][0] = coordinateX2;
		coordinates[0][1] = coordinateY1;
		coordinates[1][1] = coordinateY2;
	}
	
	public void CalcRating(float newRating) {
		
	}
}
