// リスト 7-2
public class TurtleTrap2 {
    public void run() {
	int x1 = 100;
	int y1 = 200;
	int dx1 = 10;
	int dy1 = 5;

	Turtle t1 = new Turtle();
	t1.move(x1, y1);
	t1.penDown();

	int x2 = 150;
	int y2 = 250;
	int dx2 = -10;
	int dy2 = -3;

	Turtle t2 = new Turtle();
	t2.move(x2, y2);
	t2.setColor(java.awt.Color.RED);
	t2.penDown();

	while (true) {
	    if (x1 < 20 || 340 < x1)
		dx1 = -dx1;
	    if (y1 < 20 || 340 < y1)
		dy1 = -dy1;

	    x1 += dx1;
	    y1 += dy1;
	    t1.move(x1, y1);

	    if (x2 < 20 || 340 < x2)
		dx2 = -dx2;
	    if (y2 < 20 || 340 < y2)
		dy2 = -dy2;

	    x2 += dx2;
	    y2 += dy2;
	    t2.move(x2, y2);

	}
    }

    public static void main(String[] args) {
	TurtleTrap2 trap = new TurtleTrap2();
	trap.run();
    }
}
