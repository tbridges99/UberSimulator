
public class Grid {
	private int xMin;
	private int xMax;
	private int yMin;
	private int yMax;
	
	public Grid(int xMin, int xMax, int yMin, int yMax){
		this.xMin = xMin;
		this.xMax = xMax;
		this.yMin = yMin;
		this.yMax = yMax;
	}
	
	public boolean isInGrid(int xMin, int xMax, int yMin, int yMax) {
		if (xMin < this.xMin) {
			return false;
		}
		else if (xMax > this.xMax){
			return false;
		}
		else if (yMin < this.yMin){
			return false;
		}
		else if (yMax > this.yMax) {
			return false;
		}
		
		return true;
	}
}
