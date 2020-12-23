
public class MainClass {
	
	static Point p1;
	
	public static void main(String[] args) {
		initialize();
		getInfo();
	}
	
	public static void initialize() {
		p1 = new Point(4, 5);
	}
	
	public static void getInfo() {
		System.out.println("Point 1: " + p1.toString());
		System.out.println("Those were all the points, have a great day!");
	}

}
