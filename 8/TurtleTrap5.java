public class TurtleTrap5 {
    // フィールドは private にする
    // このプログラムでは外部からフィールドにアクセスする必要はないので
    // アクセス用のメソッドも作らない
    private int x, y;
    private int dx, dy;
    private Turtle t;

    // コンストラクタ
    public TurtleTrap5(int xpos, int ypos, int xspeed, int yspeed) {
	this.x = xpos;
	this.y = ypos;
	this.dx = xspeed;
	this.dy = yspeed;
	this.t = new Turtle();
	this.t.move(xpos, ypos);
	this.t.penDown();
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

    public void setColor(java.awt.Color c) {
	this.t.setColor(c);
    }

    public static void main(String[] args) {
	// 引数付きのコンストラクタを使ってオブジェクトを生成
	TurtleTrap5 trapA = new TurtleTrap5(100, 200, 10, 5);

	TurtleTrap5 trapB = new TurtleTrap5(150, 250, -10, 3);
	trapB.setColor(java.awt.Color.RED);

	while (true) {
	    trapA.step();
	    trapB.step();
	}
    }
}
