// リスト7-3 改
public class TurtleTrap3 {
    public int x, y;
    public int dx, dy;
    public Turtle t;

    public void init(int xpos, int ypos, int xspeed, int yspeed) {
	this.x = xpos;
	this.y = ypos;
	this.dx = xspeed;
	this.dy = yspeed;
	this.t = new Turtle();
	this.t.move(xpos, ypos);
	this.t.penDown();
    }

    public void step() {
	if (this.x < 20 || 340 < this.x)
	    this.dx = -this.dx;
	if (this.y < 20 || 340 < this.y)
	    this.dy = -this.dy;

	this.x += this.dx;
	this.y += this.dy;
	this.t.move(this.x, this.y);
    }

    public static void main(String[] args) {
	TurtleTrap3 trapA = new TurtleTrap3();
	trapA.init(100, 200, 10, 5);

	TurtleTrap3 trapB = new TurtleTrap3();
	trapB.init(150, 250, -10, 3);
	trapB.t.setColor(java.awt.Color.RED);

	while (true) {
	    trapA.step();
	    trapB.step();
	}
    }
}
