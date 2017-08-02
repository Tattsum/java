public class TurtleTrap extends TurtleRemoCon {
    private int x, y;
    private int dx, dy;

    /** tが (x0, y0) から, x方向にxpseed, y方向にyspeedの速さで移動する */
    public TurtleTrap(Turtle t, int x0, int y0, int xspeed, int yspeed) {
	super(t);

	this.x = x0;
	this.y = y0;
	this.dx = xspeed;
	this.dy = yspeed;

	this.t.move(x, y);
	this.t.penDown();
    }

    /** 1ステップ描く */
    public void step() {
	if (x < 20 || 340 < x)
	    dx = -dx;
	if (y < 20 || 340 < y)
	    dy = -dy;

	x += dx;
	y += dy;
	t.move(x, y);
    }

    /** テスト用mainメソッド */
    public static void main(String[] args) {
	Turtle t1 = new Turtle();
	TurtleTrap trap1 = new TurtleTrap(t1, 100, 200, 10, 5);

	Turtle t2 = new Turtle();
	t2.setColor(java.awt.Color.RED);
	TurtleTrap trap2 = new TurtleTrap(t2, 150, 250, -10, 3);

	while (true) {
	    trap1.step();
	    trap2.step();
	}
    }
}
