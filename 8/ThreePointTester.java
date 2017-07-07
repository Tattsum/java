public class ThreePointsTester {
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
