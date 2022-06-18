package seaBattle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Stack;

public class Fleet {

	String[][] sea = new String[13][13];

	Ship one1 = new Ship();
	Ship one2 = new Ship();
	Ship one3 = new Ship();
	Ship one4 = new Ship();
	Ship two1 = new Ship();
	Ship two2 = new Ship();
	Ship two3 = new Ship();
	Ship three1 = new Ship();
	Ship three2 = new Ship();
	Ship four = new Ship();
	Stack <Ship> stackShip = new Stack<Ship>();
	
	List<Ship> list = new ArrayList<Ship>();

	public List shuf() {
		
		stackShip.push(four);
		stackShip.push(three1);
		stackShip.push(three2);
		stackShip.push(two1);
		stackShip.push(two2);
		stackShip.push(two3);
		stackShip.push(one1);
		stackShip.push(one2);
		stackShip.push(one3);
		stackShip.push(one4);
		

	
// расстановка однопалубных кораблей.
		for (int i = 0; i < 4;) {
			int x = (int) (Math.random() * 10) + 1;
			int y = (int) (Math.random() * 10) + 1;

			if (sea[x][y] == null && sea[x + 1][y + 1] == null && sea[x - 1][y - 1] == null && sea[x][y - 1] == null
					&& sea[x][y + 1] == null && sea[x - 1][y] == null && sea[x + 1][y] == null
					&& sea[x - 1][y + 1] == null && sea[x + 1][y - 1] == null) {
				sea[x][y] = "*";
				i++;
				
				Ship ship = stackShip.pop();
				ship.setX(x);
				ship.setY(y);
				ship.setLenght(1);
				
				this.setXY(x, y, ship, ship.getLocation());
				
				list.add(ship);
				

			}
		}
		
		// расстановка двухпалубных кораблей.		
		
		for (int i = 0; i < 3;) {
			
			int location = (int) (Math.random()*2);
			//1 vertical
			
			if (location > 0) {
				int x = (int) (Math.random() * 9) + 1;
			int y = (int) (Math.random() * 10) + 1;
				if(sea[x][y]==null && sea[x+1][y]==null &&sea[x-1][y]==null &&sea[x+2][y]==null &&sea[x-1][y+1]==null &&sea[x][y+1]==null &&
						sea[x+1][y+1]==null &&sea[x+2][y+1]==null &&sea[x+2][y-1]==null &&sea[x+1][y-1]==null &&sea[x][y-1]==null &&sea[x-1][y-1]==null &&sea[x-1][y+2]==null) {
					sea[x][y]="*";
					sea[x+1][y]="*";
					i++;
					Ship ship = stackShip.pop();
					ship.setX(x);
					ship.setY(y);
					ship.setLenght(2);
					ship.setLocation("V");
					this.setXY(x, y, ship, ship.getLocation());
					list.add(ship);
				}
				
				
				
				
			}else {
				int x = (int) (Math.random() * 10) + 1;
				int y = (int) (Math.random() * 9) + 1;
				if (sea[x][y] == null && sea[x][y+1] == null &&sea[x][y+2] == null &&sea[x+1][y+2] == null &&sea[x+1][y+1] == null &&sea[x+1][y] == null 
					&&sea[x+1][y-1] == null &&sea[x][y-1] == null &&sea[x-1][y-1] == null &&sea[x-1][y] == null &&sea[x-1][y+1] == null &&sea[x-1][y+2] == null) {
				sea[x][y] = "*";
				sea[x][y+1] = "*";
				i++;
				Ship ship = stackShip.pop();
				ship.setX(x);
				ship.setY(y);
				ship.setLenght(2);
				ship.setLocation("G");
				this.setXY(x, y, ship, ship.getLocation());
				list.add(ship);

			}
			}

			
		}
		// расстановка трех палубных кораблей.		
		
		for (int i = 0; i < 2;) {
			
			int location = (int) (Math.random()*2);
			//1 vertical
			
			if (location > 0) {
				int x = (int) (Math.random() * 8) + 1;
			int y = (int) (Math.random() * 10) + 1;
				if(sea[x][y]==null && sea[x+1][y]==null &&sea[x-1][y]==null &&sea[x+2][y]==null &&sea[x-1][y+1]==null &&sea[x][y+1]==null &&
						sea[x+1][y+1]==null &&sea[x+2][y+1]==null &&sea[x+2][y-1]==null &&sea[x+1][y-1]==null &&sea[x][y-1]==null &&sea[x-1][y-1]==null &&
						sea[x+2][y]==null &&sea[x+2][y-1]==null &&sea[x+2][y+1]==null&&sea[x+3][y-1]==null &&sea[x+3][y+1]==null&&sea[x+3][y]==null) {
					sea[x][y]="*";
					sea[x+1][y]="*";
					sea[x+2][y]="*";
					i++;
					Ship ship = stackShip.pop();
					ship.setX(x);
					ship.setY(y);
					ship.setLenght(3);
					ship.setLocation("V");
					this.setXY(x, y, ship, ship.getLocation());
					list.add(ship);
				}
				
				
				
				
			}else {
				int x = (int) (Math.random() * 10) + 1;
				int y = (int) (Math.random() * 8) + 1;
				if (sea[x][y] == null && sea[x][y+1] == null &&sea[x][y+2] == null &&sea[x+1][y+2] == null &&sea[x+1][y+1] == null &&sea[x+1][y] == null 
					&&sea[x+1][y-1] == null &&sea[x][y-1] == null &&sea[x-1][y-1] == null &&sea[x-1][y] == null &&sea[x-1][y+1] == null &&sea[x-1][y+2] == null
					&&sea[x][y+2] == null &&sea[x+1][y+2] == null &&sea[x-1][y+2] == null &&sea[x+1][y+3] == null &&sea[x-1][y+3] == null &&sea[x][y+3] == null) {
				sea[x][y] = "*";
				sea[x][y+1] = "*";
				sea[x][y+2] = "*";
				i++;
				Ship ship = stackShip.pop();
				ship.setX(x);
				ship.setY(y);
				ship.setLenght(3);
				ship.setLocation("G");
				this.setXY(x, y, ship, ship.getLocation());
				list.add(ship);

			}
			}

			
		}
		// расстановка 4палубных кораблей.	
	    int l = 0;
		while (l==0) {	
			int location = (int) (Math.random()*2);
			//1 vertical
			
			if (location > 0) {
				int x = (int) (Math.random() * 7) + 1;
			int y = (int) (Math.random() * 10) + 1;
				if(sea[x][y]==null && sea[x+1][y]==null &&sea[x-1][y]==null &&sea[x+2][y]==null &&sea[x-1][y+1]==null &&sea[x][y+1]==null &&
						sea[x+1][y+1]==null &&sea[x+2][y+1]==null &&sea[x+2][y-1]==null &&sea[x+1][y-1]==null &&sea[x][y-1]==null &&sea[x-1][y-1]==null &&
						sea[x+2][y]==null &&sea[x+2][y-1]==null &&sea[x+2][y+1]==null&&sea[x+3][y-1]==null &&sea[x+3][y+1]==null&&sea[x+3][y]==null
						&&sea[x+4][y]==null&&sea[x+4][y-1]==null&&sea[x+4][y+1]==null) {
					sea[x][y]="*";
					sea[x+1][y]="*";
					sea[x+2][y]="*";
					sea[x+3][y]="*";
				l++;
				Ship ship = stackShip.pop();
				ship.setX(x);
				ship.setY(y);
				ship.setLenght(4);
				ship.setLocation("V");
				this.setXY(x, y, ship, ship.getLocation());
				list.add(ship);
				}
				
				
				
				
			}else {
				int x = (int) (Math.random() * 10) + 1;
				int y = (int) (Math.random() * 7) + 1;
				if (sea[x][y] == null && sea[x][y+1] == null &&sea[x][y+2] == null &&sea[x+1][y+2] == null &&sea[x+1][y+1] == null &&sea[x+1][y] == null 
					&&sea[x+1][y-1] == null &&sea[x][y-1] == null &&sea[x-1][y-1] == null &&sea[x-1][y] == null &&sea[x-1][y+1] == null &&sea[x-1][y+2] == null
					&&sea[x][y+2] == null &&sea[x+1][y+2] == null &&sea[x-1][y+2] == null &&sea[x+1][y+3] == null &&sea[x-1][y+3] == null &&sea[x][y+3] == null
					 &&sea[x][y+4] == null &&sea[x+1][y+4] == null &&sea[x-1][y+4] == null) {
				sea[x][y] = "*";
				sea[x][y+1] = "*";
				sea[x][y+2] = "*";
				sea[x][y+3] = "*";
				l++;
				Ship ship = stackShip.pop();
				ship.setX(x);
				ship.setY(y);
				ship.setLenght(4);
				ship.setLocation("G");
				this.setXY(x, y, ship, ship.getLocation());
				list.add(ship);

			}
			}
		}
		
		System.out.println(list.toString());
	
		for (int i = 1; i < 11; i++) {
		
			for (int j = 1; j < 11; j++) {
				
				if (sea[i][j] == null) {
					System.out.print("0");
				} else {
					System.out.print(sea[i][j]);
				}
			}
			System.out.println();
		}
		return list;

	}
	// добавление массива располажения палуб
	public void setXY(int x, int y, Ship ship, String orientation) {
		int [] a = ship.getAll();
	if (orientation.equals("G")) {
		for(int i = 0 ; i<ship.getLenght();i++) {
			a[i]= (x*10)+y+i;
			
		
	}
	}else {
			for(int i = 0 ; i<ship.getLenght();i++) {
				a[i]= ((x+i)*10)+y;
	}
	}
}}