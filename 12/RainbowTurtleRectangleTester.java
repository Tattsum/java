public class RainbowTurtleRectangleTester {
    public static void main(String[] args) {
	RainbowTurtleRectangle
	    rect1 = new RainbowTurtleRectangle(50, 250, 10, 150, 100);

	RainbowTurtleRectangle
	    rect2 = new RainbowTurtleRectangle(200, 200, 5, 80, 80);

	while (true) {
	    rect1.step();
	    rect2.step();
	}
    }
}
