public class TurtleTrap4{
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

    public void setColor(java.awt.Color c){
        this.t.setColor(c);
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
	TurtleTrap4 trapA = new TurtleTrap4();
	trapA.init(100, 200, 10, 5);


	TurtleTrap4 trapB = new TurtleTrap4();
	trapB.init(150, 250, -10, 3);
	trapB.t.setColor(java.awt.Color.GREEN);

	while (true) {
	    trapA.step();
	    trapB.step();
	}
    }
}
