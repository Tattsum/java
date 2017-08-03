public class RainbowDotTurtle extends DotTurtle {
    private int dotNum;

    public RainbowDotTurtle() {

  	super();

  	dotNum = 0;

    }

    public void go(int d) {

        switch (dotNum % 6) {
        case 0:
          setColor(java.awt.Color.RED);
          break;

        case 1:
          setColor(java.awt.Color.ORANGE);
          break;

        case 2:
          setColor(java.awt.Color.YELLOW);
          break;

        case 3:
          setColor(java.awt.Color.GREEN);
          break;

        case 4:
          setColor(java.awt.Color.BLUE);
          break;

        case 5:
          setColor(java.awt.Color.MAGENTA);
          break;
        }
	      dotNum++;
	      super.go(d);
    }
}
