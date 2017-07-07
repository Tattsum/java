/**
 *  2次元の3頂点を保持するクラス
 */
public class ThreePoints {
    /** エラーを表すstaticフィールド(定数) */
    static final double ERROR = -1.0;

    /** 3頂点 */
    private Point p1, p2, p3;
    private double a,b,c,s,S;


    /** コンストラクタ
     *   3頂点の座標を p1, p2, p3 にする．
     */
    public ThreePoints(Point p1, Point p2, Point p3) {
	/* 記述せよ */
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    /** 3頂点 p1, p2, p3 が三角形を構成するならばtrueを返す
     *  3辺 a, b, c が
     *    a+b > c かつ b+c > a かつ c+a > b ならば三角形となる
     */
    public boolean isTriangle() {
	/* 記述せよ */
        a=p1.getLength(p2);
        b=p1.getLength(p3);
        c=p2.getLength(p3);
        if( a + b > c && b + c > a && c + a > b ){
            return true;
        }else{
            return false;
        }
    }

    /**
     * 3頂点 p1, p2, p3 が三角形ならば面積を返す．
     * 三角形でなければ ERROR を返す．
     */
    public double getArea() {
	/* 記述せよ */
        if(isTriangle()==true){
            s=(a+b+c)/2;
            S=Math.sqrt(s*(s-a)*(s-b)*(s-c));
            return S;
        }else{
            return ERROR;
        }
    }

    /** 3頂点を表示する */
    public void print() {
	/* 記述せよ */
        p1.print();
        p2.print();
        p3.print();
    }

    public static void main(String args[]) {
        Point o = new Point(); // 原点

        Point a1 = new Point(3.0, 0.0);
        Point a2 = new Point(0.0, 2.0);
        ThreePoints triA = new ThreePoints(o, a1, a2);

        Point b1 = new Point(1.0, 4.0);
        Point b2 = new Point(2.0, 3.0);
        Point b3 = new Point(3.0, 4.0);
        ThreePoints triB = new ThreePoints(b1, b2, b3);


        Point x1 = new Point(1.0, 0.0);
        Point x2 = new Point(-2.0, 0.0);
        ThreePoints triX = new ThreePoints(o, x1, x2);

        Point y1 = a2;
        Point y2 = new Point(0.0, -1.0);
        ThreePoints triY = new ThreePoints(y1, y2, o);

        System.out.print("triA:");
        triA.print();
        System.out.println();
        if (triA.isTriangle()) {
            System.out.println("三角形の面積: " + triA.getArea());
        } else {
            System.out.println("三角形ではありません");
        }

        System.out.print("triB:");
        triB.print();
        System.out.println();
        if (triB.isTriangle()) {
            System.out.println("三角形の面積: " + triB.getArea());
        } else {
            System.out.println("三角形ではありません");
        }

        System.out.print("triX:");
        triX.print();
        System.out.println();
        if (triX.isTriangle()) {
            System.out.println("三角形の面積: " + triX.getArea());
        } else {
            System.out.println("三角形ではありません");
        }

        System.out.print("triY:");
        triY.print();
        System.out.println();
        // getArea()のみで面積を表示させた例
        double areaY = triY.getArea();
        if (areaY == ThreePoints.ERROR) {
            System.out.println("三角形ではありません");
        } else {
            System.out.println("三角形の面積: " + areaY);
        }
    }

}
