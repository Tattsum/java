public class TurtlePolygon extends TurtleRemoCon {
    private int speed, length;
    private int movedLength;

    public TurtlePolygon(Turtle t, int x0, int y0, int speed, int len) {
      	super(t);

      	this.speed = speed;
      	this.length = len;

      	this.movedLength = 0;
      	this.t.move(x0, y0);
      	this.t.penDown();
    }

    public void step() {

	      t.go(speed);
        movedLength += speed;

        if (movedLength >= length) {
            t.rotate(30);
        	  movedLength = 0;
        }
    }

    public static void main(String[] args) {
	      Turtle t1 = new Turtle();
	      TurtlePolygon pol1 = new TurtlePolygon(t1, 120, 200, 10, 30);

	       Turtle t2 = new Turtle();
	       t2.setColor(java.awt.Color.GREEN);
	       TurtlePolygon pol2 = new TurtlePolygon(t2, 90, 260, 30, 70);

	       while (true) {
	          pol1.step();
	          pol2.step();
	       }
    }
}
