//  リスト7-1
public class TurtleTrap1 {
    public void run() {
	int x = 100;
	int y = 200;
	int dx = 10;
	int dy = 5;

	Turtle t = new Turtle();
	t.move(x, y);
	t.penDown();

	while (true) {
	    if (x < 20 || 340 < x)
		dx = -dx;
	    if (y < 20 || 340 < y)
		dy = -dy;

	    x += dx;
	    y += dy;
	    t.move(x, y);
	}
    }

    public static void main(String[] args) {
	TurtleTrap1 trap = new TurtleTrap1();
	trap.run();
    }
}
