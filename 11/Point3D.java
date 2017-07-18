// 「やさしいJavaプログラミング」リスト9-10 改
public class Point3D extends Point {
    // private に変更
    private int z;

    public Point3D(int x0, int y0, int z0) {
	super(x0, y0);
	z = z0;
    }

    public String toString() {
	return "(" + x + ", " + y + ", " + z + ")";
    }

    public static void main(String args[]) {
	Point p = new Point(1,2);
	p.print();  // Point の toString() が呼ばれる．

	Point3D q = new Point3D(3, 4, 5);
	q.print();  // Point3D の toString() が呼ばれる．

	// 変数rの型はPoint, rが表すオブジェクトの型はPoint3D
	Point r = new Point3D(6, 7, 8);
	r.print();  // Point3D の toString() が呼ばれる．
    }

}
