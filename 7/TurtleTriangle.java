/**
  一辺の長さがlengthの三角形を書く (TurtleCirclerの別バージョン)
  (speed と length の値によってはピッタリlengthにならない場合もある)
*/
public class TurtleTriangle {
    public int length;  // 三角形の一辺の長さ
    public int speed;   // 1stepで動く速さ
    public int movedLength;  // これまで動いた距離
    public Turtle t;

    public void init(int xpos, int ypos, int xspeed, int len) {
	this.speed = xspeed;
	this.length = len;
	this.movedLength = 0;
	this.t = new Turtle();
	this.t.move(xpos, ypos);
	this.t.penDown();
    }

    public void step() {
	// speed分だけ進める
	this.t.go(this.speed);

	// これまで動いた長さにspeedを足す
	this.movedLength += this.speed;

	// 一辺の長さ(length)以上動いてたら，向きを変える
	if (this.movedLength >= this.length) {
	    this.t.rotate(120);
	    this.movedLength = 0; // これまで動いた距離をリセット
	}
    }

    public static void main(String[] args) {
	TurtleTrap3 trap = new TurtleTrap3();
	trap.init(100, 200, 10, 5);
	trap.t.setColor(java.awt.Color.RED);

	TurtleTriangle tri1 = new TurtleTriangle();
	tri1.init(50, 250, 10, 200);

	TurtleTriangle tri2 = new TurtleTriangle();
	tri2.init(100, 200, 20, 60);
	tri2.t.setColor(java.awt.Color.GREEN);

	while (true) {
	    trap.step();
	    tri1.step();
	    tri2.step();
	}
    }
}
