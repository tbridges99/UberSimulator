
public class Distance {

	public static float calculateDistance(int x1, int y1, int x2, int y2) {
		double xsquared = Math.pow((x2-x1), 2);
		double ysquared = Math.pow((y2-y1), 2);
		double sum = xsquared + ysquared;
		float distance = (float)Math.sqrt(sum);
		return distance;
	}
}
