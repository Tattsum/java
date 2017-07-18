/**
   「やさしいJavaプログラミング」リスト9-3改
   goで進むと点線を描く亀
   Turtleを継承している
*/
public class DotTurtle extends Turtle {
    /*** フィールドをprivateに変更 ***/
    private int length; // 点線の長さ

    public DotTurtle() {
	super();
	length = 10;
    }

    /** 点線の長さを設定 */
    public void setLength(int len) {
	length = len;
    }

    /** goで進むと点線を描く
	Turlteのgoをオーバライド(上書き)
     */
    public void go(int d) {
	int length2 = length*2;
	this.penDown();
	while (d > length2) {
	    super.go(length);  // Turtleクラスのgo
	    this.penUp();
	    super.go(length);  // Turtleクラスのgo
	    this.penDown();
	    d -= length2;
	}
	super.go(d);   // Turtleクラスのgo
    }
}
