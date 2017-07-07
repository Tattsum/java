/** 2次元座標を表すクラス */
public class Point {
    /** 座標 (x, y) */
    private double x, y;

    /**
     *  引数なしコンストラクタ
     *  座標は (0.0, 0.0) に設定する
     */
    public Point() {
	x = 0.0;
	y = 0.0;
    }

    /**
     *  引数つきコンストラクタ
     *  座標を (x, y) に設定する
     */
    public Point(double x, double y) {
	this.x = x;
	this.y = y;
    }

    /** x座標を返す */
    public double getX() {
	return x;
    }

    /** y座標を返す */
    public double getY() {
	return y;
    }

    /** 原点からの距離を返す */
    public double getLength() {
	// Math.sqrt は平方根を求める(Mathクラスのstaticメソッド)
	return Math.sqrt(x*x + y*y);
    }

    /** 点pからの距離を返す */
    public double getLength(Point p) {
	double diffX = p.getX() - x;
	double diffY = p.getY() - y;

	return Math.sqrt(diffX*diffX + diffY*diffY);
    }

    /** 座標を表示する */
    public void print() {
	System.out.print("(" + x + ", " + y + ")");
    }

    /** テスト用メインメソッド */
    public static void main(String args[]) {
	Point p0 = new Point();  // 原点
	Point p1 = new Point(1.0, 1.0);
	Point p2 = new Point(-2.5, -4.3);


	System.out.print("p0 = ");
	p0.print();
	System.out.println();

	System.out.print("p1 = ");
	p1.print();
	System.out.println();

	System.out.print("p2 = ");
	p2.print();
	System.out.println();


	System.out.println("p1の原点からの距離: p1.getLength()   = "
			 + p1.getLength());

	System.out.println("p1のp0からの距離:   p1.getLength(p0) = "
			 + p1.getLength(p0));

	System.out.println("p2の原点からの距離: p2.getLength()   = "
			 + p2.getLength());

	System.out.println("p2のp1からの距離:   p2.getLength(p1) = "
			 + p2.getLength(p1));



    }

}
