public class TurtleRemoConTester {
    public static void draw(TurtleRemoCon[] trc) {
      	while (true) {
      	    for (int i = 0; i < trc.length; i++) {
      		trc[i].step();
      	    }
      	}
    }

    public static void main(String args[]) {
      	TurtleRemoCon remocons[];
      	remocons = new TurtleRemoCon[5];


      	/* 問題3に合わせて記述せよ */
        int x1 = 1, x2 = 4, z1 = 0, z2 = 4, z3= 2;
        int x0 = 200 + z2 * 10 + z3;
        int y0 = 100 + x2 * 10 + x1;
        int xspeed = 10 + z3;
        int yspeed = 10 + z2;

        if ((z1 + z2 + z3 ) % 3 == 0 ){
          Turtle t0 = new Turtle();
          t0.setColor(java.awt.Color.ORANGE);
          remocons[0] = new TurtleTrap(t0, x0, y0, xspeed,yspeed);
        } else if ((z1 + z2 + z3 ) % 3 == 1) {
          Turtle t0 = new Turtle();
          t0.setColor(java.awt.Color.GREEN);
          remocons[0] = new TurtleTrap(t0, x0, y0, xspeed,yspeed);
        } else {
          Turtle t0 = new Turtle();
          t0.setColor(java.awt.Color.MAGENTA);
          remocons[0] = new TurtleTrap(t0, x0, y0, xspeed,yspeed);
        }

        int a = (z1 + z2 + z3) % 6 +5;
        ZigZagTurtle t1 = new ZigZagTurtle(a);
      	remocons[1] = new TurtleTriangleY(t1, 75, 200, 4*a, 12*a);

        int b = z1 * 100 + z2 * 10 +z3;
        RainbowTurtle t2 = new RainbowTurtle();
        remocons[2] = new TurtleStar(t2, 250, 100, 20, 60, b);

        DotTurtle t3 = new DotTurtle();
        t3.setColor(java.awt.Color.RED);
        t3.setLength(5);
        remocons[3] = new TurtleOctagon(t3, 170, 280, 20, 50);

        RainbowTurtle t4 = new RainbowTurtle();
        remocons[4] = new TurtleOctagon(t4, 185, 250, 10, 30);

        draw(remocons);
    }
}
