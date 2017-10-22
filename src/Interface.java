import java.util.ArrayList;

public class UserInterface {
	private ArrayList<Driver> drivers;
	private ArrayList<Passenger> passengers;
	private Grid grid;
	
	final int GRIDXMIN = 0;
	final int GRIDYMIN = 0;
	
	public UserInterface(ArrayList<Driver> Drivers, ArrayList<Passenger> Passengers, int gridSizeX, int gridSizeY) {
		drivers = Drivers;
		passengers = Passengers;
		grid = new Grid(GRIDXMIN, gridSizeX, GRIDYMIN, gridSizeY);
	}
	
	
}
