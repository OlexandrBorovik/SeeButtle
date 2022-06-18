package seaBattle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Buttle {
	
		
	Fleet c = new Fleet ();
	private List<Ship> com = c.shuf() ;
	private List<Ship> pers;
	private boolean game = true;
	Scanner sc = new Scanner(System.in);
	
	public void buttle () {
		
	System.out.println("x");
	int one = sc.nextInt();
	
	System.out.println("y");
	int two = sc.nextInt();
	
	this.checkFleet(one,two);
	
	for (int i = 0; i>c.list.size();i++ ) {
		

	}
		
	}
		
		
		
		
	public void checkFleet (int x, int y) {	
		boolean result = true;
	
	for (int i = 0; i< com.size(); i++) {
		Ship ship = com.get(i);
		String location = ship.getLocation();
		if (location.equals("V")) {
		for (int j = 0; j<ship.getLengh();j++ ) {
			if (ship.getX()==x && ship.getY()==y+j) {
				System.out.println("popal");
			}else {
				System.out.println("mimo");
			}
		}
			
		
	}else {
		for (int j = 0; j<ship.getLengh();j++ ) {
			if (ship.getX()==x+j && ship.getY()==y) {
				System.out.println("popal");
			}else {
				System.out.println("mimo");
			}
		}
	}

	}
}}