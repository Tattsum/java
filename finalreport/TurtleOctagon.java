public class TurtleOctagon extends TurtleRemoCon {
    private int speed, length;
    private int movedLength;  // これまで動いた距離

    /** tが (x0, y0) から, speedの速さで移動し，1辺の長さがlenの三角形を描く */
    public TurtleOctagon(Turtle t, int x0, int y0, int speed, int len) {
      	super(t);

      	this.speed = speed;
      	this.length = len;

      	this.movedLength = 0;
      	this.t.move(x0, y0);
      	this.t.penDown();
    }

    /** 1ステップ描く */
    public void step() {
      	// speed分だけ進める
      	t.go(speed);

      	// これまで動いた長さにspeedを足す
      	movedLength += speed;

      	// 一辺の長さ(length)以上動いてたら，向きを変える
      	if (movedLength >= length) {
      	    t.rotate(45);
      	    movedLength = 0; // リセット
      	}
    }

    /** テスト用mainメソッド */
    public static void main(String[] args) {
      	Turtle t1 = new Turtle();
      	TurtleOctagon oct1 = new TurtleOctagon(t1, 120, 200, 10, 30);

      	Turtle t2 = new Turtle();
      	t2.setColor(java.awt.Color.GREEN);
      	TurtleOctagon oct2 = new TurtleOctagon(t2, 90, 260, 30, 70);

      	while (true) {
      	    oct1.step();
      	    oct2.step();
      	}
          }
}
