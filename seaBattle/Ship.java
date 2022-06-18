package seaBattle;

import java.util.Arrays;

public class Ship {
	
	private int lenght;
	private int y ;
	private int x;
	private boolean dead = false;
	private boolean wound = false;
	private String location = "G";
	private int [] all = {0,0,0,0};
	public Ship() {
		super();
		// TODO Auto-generated constructor stub

	}
	public Ship(int lenght, int y, int x, boolean dead, boolean wound, String location, int[] all) {
		super();
		this.lenght = lenght;
		this.y = y;
		this.x = x;
		this.dead = dead;
		this.wound = wound;
		this.location = location;
		this.all = all;
	}
	public int getLenght() {
		return lenght;
	}
	public void setLenght(int lenght) {
		this.lenght = lenght;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
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
	public int[] getAll() {
		return all;
	}
	public void setAll(int[] all) {
		this.all = all;
	}
	@Override
	public String toString() {
		return "Ship [lenght=" + lenght + ", y=" + y + ", x=" + x + ", dead=" + dead + ", wound=" + wound
				+ ", location=" + location + ", all=" + Arrays.toString(all) + "]";
	}
	
}