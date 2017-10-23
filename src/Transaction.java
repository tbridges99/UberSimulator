
public class Transaction {
	public static boolean completeTransaction(Driver driver, Passenger passenger, float Fare) {
		if (passenger.getBalance() >= Fare) {
			passenger.subtractBalance(Fare);
			driver.addbalance(Fare);
			return true;
		}
		else 
			return false;
	}
}
