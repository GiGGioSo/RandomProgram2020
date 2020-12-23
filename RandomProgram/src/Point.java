public class Point {
	
	int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return (x + ", " + y);
	}
	
	public float distanceFrom(Point p) {
		int dx, dy;
		if(p.x > x) { dx = p.x - x;
		} else { dx = x - p.x; }
		
		if(p.y > y) { dy = p.y - y;
		} else { dy = y - p.y; }
		
		return (float) Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
	}

}
