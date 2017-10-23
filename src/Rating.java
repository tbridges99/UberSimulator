
public class Rating {
	double totalRating;
	int numRatings;
	
	public double getRating(){
		return totalRating / numRatings;
	}
	
	public void calcRating(double newRating) {
		totalRating += newRating;
		numRatings += 1;
	}
}
