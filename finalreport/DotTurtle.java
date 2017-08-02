// 参考書 p.258 リスト9-3 改
public class DotTurtle extends Turtle {
    private int length;

    public DotTurtle() {
	super();
	length = 10;
    }

    /** 点線の長さをlenに設定 */
    public void setLength(int len) {
	length = len;
    }

    /** 長さd進む */
    public void go(int d) {
	int length2 = length*2;
	this.penDown();
	while (d > length2) {
	    super.go(length);
	    this.penUp();
	    super.go(length);
	    this.penDown();
	    d -= length2;
	}
	super.go(d);
    }

    /** テスト用mainメソッド */
    public static void  main(String args[]) {
	DotTurtle dt1 = new DotTurtle();
	dt1.move(50, 300);
	/* 正方形を描く */
	dt1.penDown();
	for (int i = 1; i <= 4; i++) {
	    dt1.go(150);
	    dt1.rotate(90);
	}

	DotTurtle dt2 = new DotTurtle();
	dt2.move(100, 250);
	dt2.setColor(java.awt.Color.RED);
	dt2.setLength(5);
	/* 正方形を描く */
	dt2.penDown();
	for (int i = 1; i <= 4; i++) {
	    dt2.go(50);
	    dt2.rotate(90);
	}
    }
}
