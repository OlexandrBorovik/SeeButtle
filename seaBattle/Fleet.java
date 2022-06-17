package seaBattle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Fleet {

	String[][] sea = new String[13][13];

	int ran = (int) (Math.random() * 10);
	Random r = new Random(ran);
	Ship oneQ = new Ship(1, false, false, "x");
	Ship oneW = new Ship(2, false, false, "x");
	Ship oneR = new Ship(3, false, false, "x");
	Ship oneT = new Ship(4, false, false, "x");
	List<Ship> list = new ArrayList<Ship>();

	public void shuf() {
		list.add(oneQ);
		list.add(oneW);
		list.add(oneR);
		list.add(oneT);

		Collections.shuffle(list, r);
		System.out.println("After shuffling: " + list.toString());
// расстановка однопалубных кораблей.
		for (int i = 0; i < 4;) {
			int x = (int) (Math.random() * 10) + 1;
			int y = (int) (Math.random() * 10) + 1;

			if (sea[x][y] == null && sea[x + 1][y + 1] == null && sea[x - 1][y - 1] == null && sea[x][y - 1] == null
					&& sea[x][y + 1] == null && sea[x - 1][y] == null && sea[x + 1][y] == null
					&& sea[x - 1][y + 1] == null && sea[x + 1][y - 1] == null) {
				sea[x][y] = "*";
				i++;

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
				}
				
				
				
				
			}else {
				int x = (int) (Math.random() * 10) + 1;
				int y = (int) (Math.random() * 9) + 1;
				if (sea[x][y] == null && sea[x][y+1] == null &&sea[x][y+2] == null &&sea[x+1][y+2] == null &&sea[x+1][y+1] == null &&sea[x+1][y] == null 
					&&sea[x+1][y-1] == null &&sea[x][y-1] == null &&sea[x-1][y-1] == null &&sea[x-1][y] == null &&sea[x-1][y+1] == null &&sea[x-1][y+2] == null) {
				sea[x][y] = "*";
				sea[x][y+1] = "*";
				i++;

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

			}
			}
		}
		
		

		for (int i = 1; i < 11; i++) {
			for (int j = 1; j < 11; j++) {
				if (sea[i][j] == null) {
					System.out.print(" ");
				} else {
					System.out.print(sea[i][j]);
				}
			}
			System.out.println();
		}

	}

}
