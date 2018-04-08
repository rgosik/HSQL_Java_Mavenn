package Ships;

public class Ship {
	
	int x;
	int y;
	char direction;
	char[][] map = { {'w', 'w', 'w', 'w', 'w', 'x', 'w', 'w', 'x', 'w'},
					 {'w', 'x', 'w', 'w', 'x', 'w', 'w', 'w', 'w', 'w'},
					 {'w', 'w', 'w', 'x', 'w', 'w', 'w', 'x', 'w', 'w'},
					 {'x', 'w', 'w', 'w', 'w', 'x', 'w', 'w', 'w', 'w'},
					 {'w', 'w', 'x', 'w', 'w', 'w', 'w', 'x', 'w', 'w'},
					 {'w', 'w', 'w', 'w', 'x', 'w', 'w', 'w', 'w', 'x'},
					 {'w', 'x', 'w', 'w', 'w', 'w', 'x', 'w', 'w', 'w'},
					 {'w', 'w', 'w', 'x', 'w', 'w', 'w', 'w', 'x', 'w'},
					 {'x', 'w', 'x', 'w', 'w', 'w', 'w', 'w', 'w', 'w'},
					 {'w', 'w', 'w', 'w', 'x', 'w', 'w', 'w', 'x', 'w'}, };
	
	public Ship() {}	
	
	public Ship(int x, int y, char dir) {
		this.x = x;
		this.y = y;
		direction = dir;
	}
	
	public void move(char c) {
		if (c == 'n') {
			switch (direction) {
				case 'N':
					y += 1;
					break;
				case 'S':
					y -= 1;
					break;
				case 'W':
					x -= 1;
					break;
				case 'E':
					x += 1;
			}
		}
		if (c == 'w') {
			switch (direction) {
				case 'N':
					y -= 1;
					break;
				case 'S':
					y += 1;
					break;
				case 'W':
					x += 1;
					break;
				case 'E':
					x -= 1;
			}
		}
		if (c == 'l') {
			switch(direction) {
				case 'n': direction = 'w';
					break;
				case 'e': direction = 'n';
					break;
				case 's': direction = 'e';
					break;
				case 'w': direction = 's';
			}
		}
		if (c == 'p') {
			switch(direction) {
				case 'n': direction = 'e';
					break;
				case 'e': direction = 's';
					break;
				case 's': direction = 'w';
					break;
				case 'w': direction = 'n';
			}
		}		
	}
	public boolean checkIfLand(int x, int y) {
		return true;
		
	}
	
	
	
}

