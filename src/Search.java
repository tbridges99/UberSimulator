import java.util.ArrayList;

public class Search {
	private ArrayList<Distance> distances;
	private int[][] passengerLocation;
	
	public Search() {
		distances = new ArrayList<Distance>();
		passengerLocation = new int[2][2];
	}
	
	public Driver SearchDrivers(ArrayList<Driver> Drivers, Passenger requester) {
		return new Driver(null, 0, null, null, null);
	}
	
	public float AddDistance(Passenger requester, Driver driver) {
		return (float) 1.00;
	}
}
