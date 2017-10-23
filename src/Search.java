import java.util.ArrayList;
import java.util.Collections;

public class Search {
	private ArrayList<DriverDistance> distances;
	private int[] passengerLocation;
	
	public Search() {
		distances = new ArrayList<DriverDistance>();
	}
	
	public Driver SearchDrivers(ArrayList<Driver> Drivers, Passenger requester, int[] destination, float rate) {
		int[] driverLocation;
		passengerLocation = requester.getLocation();
		for (int i = 0; i < Drivers.size(); i++) {
			driverLocation = Drivers.get(i).getLocation();
			float d = Distance.calculateDistance(driverLocation[0], driverLocation[1], passengerLocation[0] , passengerLocation[1]);
			distances.add(new DriverDistance(i, d));
		}
		Collections.sort(distances);
		for (DriverDistance ddist : distances) {
			if (Drivers.get(ddist.index).acceptRequest()) {
				float destDist = Distance.calculateDistance(passengerLocation[0], passengerLocation[1], destination[0], destination[1]);
				float fare = Fare.CalculateFare(ddist.distance, destDist, rate);
				Transaction.completeTransaction(Drivers.get(ddist.index), requester, fare);
				return Drivers.get(ddist.index);
			}
		}
		return null;
	}
	
	public float AddDistances(Passenger requester, Driver driver) {
		return (float) 1.00;
	}


	public ArrayList<DriverDistance> getDistances() {
		return distances;
	}
	
	private class DriverDistance implements Comparable<DriverDistance>{
		int index;
		float distance;
		
		public DriverDistance(int index, float distance){
			this.index = index;
			this.distance = distance;
		}

		@Override
		public int compareTo(DriverDistance o) {
			// TODO Auto-generated method stub
			return (int) (this.distance - o.distance);
		}

	}
}
