// リスト7-5
public class TurtleCircler {
    public int counter;
    public int speed, length;
    public Turtle t;

    public void init(int xpos, int ypos, int xspeed, int len) {
	this.counter = 0;
	this.speed = xspeed;
	this.length = len;
	this.t = new Turtle();
	this.t.move(xpos, ypos);
	this.t.penDown();
    }

    public void step() {
	this.t.go(this.speed);

	if (++this.counter >= this.length) {
	    this.t.rotate(120);
	    this.counter = 0;
	}
    }

    public static void main(String[] args) {
	TurtleTrap3 trap = new TurtleTrap3();
	trap.init(100, 200, 10, 5);
	trap.t.setColor(java.awt.Color.RED);

	TurtleCircler circle = new TurtleCircler();
	circle.init(50, 250, 10, 20);

	while (true) {
	    trap.step();
	    circle.step();
	}
    }
}
