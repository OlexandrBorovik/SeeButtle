package seaBattle;

public class Ship {
	
	private int lengh;
	private boolean dead;
	private boolean wound;
	private String location;
	public Ship() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ship(int lengh, boolean dead, boolean wound, String location) {
		super();
		this.lengh = lengh;
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
		return "Ship [lengh=" + lengh + ", dead=" + dead + ", wound=" + wound + ", location=" + location + "]";
	}

}
