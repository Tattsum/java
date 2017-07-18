// 「やさしいJavaプログラミング」リスト9-10 改
public class Point {
    // サブクラスから参照するので private でなく，
    // protected にしている．
    protected int x, y;

    public Point(int x0, int y0) {
	x = x0;
	y = y0;
    }

    public void print() {
	// toString()を呼び出す．
	System.out.println(toString());
    }

    public String toString() {
	return "(" + x + ", " + y + ")";
    }
}
