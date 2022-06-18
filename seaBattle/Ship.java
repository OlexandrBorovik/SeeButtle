package seaBattle;

public class Ship {
	
	private int lengh;
	private int y ;
	private int x;
	private boolean dead = false;
	private boolean wound = false;
	private String location = "G";
	public Ship() {
		super();
		// TODO Auto-generated constructor stub

	}
	public Ship(int lengh, int y, int x, boolean dead, boolean wound, String location) {
		super();
		this.lengh = lengh;
		this.y = y;
		this.x = x;
		this.dead = dead;
		this.wound = wound;
		this.location = location;
	}
	public int getLengh() {
		return lengh;
	}
	public void setLengh(int lengh) {
		this.lengh = lengh;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public boolean isDead() {
		return dead;
	}
	public void setDead(boolean dead) {
		this.dead = dead;
	}
	public boolean isWound() {
		return wound;
	}
	public void setWound(boolean wound) {
		this.wound = wound;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Ship [lengh=" + lengh + ", x=" + x + ", y=" + y + ", dead=" + dead + ", wound=" + wound + ", location="
				+ location + "]";
	}
}
