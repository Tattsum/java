/**
   「やさしいJavaプログラミング」リスト9-2
   BrokenLinerオブジェクトを使って，点線で三角形を描く
*/
public class BrokenTriangle {
    public static void main(String args[]) {
	BrokenLiner t = new BrokenLiner();
	t.setLength(5);
	t.move(10, 200);
	t.penDown();
	t.go(200);
	t.rotate(120);
	t.go(200);
	t.rotate(120);
	t.go(200);
    }
}
