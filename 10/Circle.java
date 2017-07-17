/* Circle.java に保存 */
public class Circle implements Shape {
    /** 円周率 */
    public static final double PI = 3.14;

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    /** 図形を表示する　*/
    public void print() {
        System.out.println("半径 " + r + "の円です．");
    }

    /** 面積を返す */
    public double getArea() {
        return PI * r * r;
    }

    /** 円周を返す */
    public double getLength() {
        return 2 * PI * r;
    }
}
