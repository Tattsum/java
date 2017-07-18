/**
   「やさしいJavaプログラミング」リスト9-1改
    goで進むと点線を描く
 */
public class BrokenLiner {
    /*** フィールドをprivateに変更 ***/
    private Turtle turtle;
    private int length; // 点線の長さ

    // コンストラクタ
    public BrokenLiner() {
	turtle = new Turtle();
	length = 10;
    }

    // turtleに処理を委任(delegate)
    public void penDown() {
	turtle.penDown();
    }
    public void penUp() {
	turtle.penUp();
    }
    public void rotate(int r) {
	turtle.rotate(r);
    }
    public void move(int x, int y) {
	turtle.move(x, y);
    }

    /** 点線の長さを設定 */
    public void setLength(int len) {
	length = len;
    }

    /** goで進むと点線を描く */
    public void go(int d) {
	int length2 = length*2;
	turtle.penDown();
	while (d > length2) {
	    turtle.go(length);
	    turtle.penUp();
	    turtle.go(length);
	    turtle.penDown();
	    d -= length2;
	}
	turtle.go(d);
    }

}
