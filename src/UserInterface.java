import java.util.ArrayList;

public class UserInterface {
	private ArrayList<Driver> drivers;
	private ArrayList<Passenger> passengers;
	private Grid grid;
	
	final int GRIDXMIN = 0;
	final int GRIDYMIN = 0;
	
	public UserInterface(ArrayList<Driver> Drivers, ArrayList<Passenger> Passengers, int gridSizeX, int gridSizeY) {
		setDrivers(Drivers);
		setPassengers(Passengers);
		grid = new Grid(GRIDXMIN, gridSizeX, GRIDYMIN, gridSizeY);
	}

	public ArrayList<Driver> getDrivers() {
		return drivers;
	}

	public void setDrivers(ArrayList<Driver> drivers) {
		this.drivers = drivers;
	}

	public ArrayList<Passenger> getPassengers() {
		return passengers;
	}

	public void setPassengers(ArrayList<Passenger> passengers) {
		this.passengers = passengers;
	}
	
	
}
