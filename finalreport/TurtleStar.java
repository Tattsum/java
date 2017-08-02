public class TurtleStar extends TurtleRemoCon {
    private int speed, length;
    private int movedLength;  // これまで動いた距離

    /** tが (x0, y0) から, 初期角度degの方向に，speedの速さで移動し，
       長さがlenの星を描く */
    public TurtleStar(Turtle t, int x0, int y0, int speed, int len,
		      int deg) {
	super(t);

	this.speed = speed;
	this.length = len;
	movedLength = 0;

	this.t.move(x0, y0);
	this.t.penDown();
	this.t.rotate(deg); // deg 回転する
    }

    /** tが (x0, y0) から, speedの速さで移動し，長さがlenの星を描く */
    public TurtleStar(Turtle t, int x0, int y0, int speed, int len) {
	this(t, x0, y0, speed, len, 252); // 左下向きに進む
    }

    /** 1ステップ描く */
    public void step() {
	// speed分だけ進める
	t.go(speed);

	// これまで動いた長さにspeedを足す
	movedLength += speed;

	// 一辺の長さ(length)以上動いてたら，向きを変える
	if (movedLength >= length) {
	    t.rotate(144);
	    movedLength = 0; // リセット
	}
    }

    /** テスト用mainメソッド */
    public static void main(String[] args) {
	Turtle t1 = new Turtle();
	t1.setColor(java.awt.Color.MAGENTA);
	TurtleStar star1 = new TurtleStar(t1, 200, 50, 10, 200);

	Turtle t2 = new Turtle();
	t2.setColor(java.awt.Color.ORANGE);
	TurtleStar star2 = new TurtleStar(t2, 200, 165, 10, 30, 72);
	while (true) {
	    star1.step();
	    star2.step();
	}
    }


}
