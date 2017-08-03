public class RainbowDotTurtlePolygon {
    public static void draw(TurtleRemoCon[] trc) {

	while (true) {
	    trc[0].step();
	    trc[1].step();
	}
    }

    public static void main(String args[]) {
	     TurtleRemoCon remocons[] = new TurtleRemoCon[2];

       Turtle t0 = new Turtle();
       remocons[0] = new TurtlePolygon(t0,180,245,20,30);

       RainbowDotTurtle t1 = new RainbowDotTurtle();
       t1.setLength(5);
       remocons[1] = new TurtlePolygon(t1,170,280,20,50);

	     draw(remocons);
    }
}
