/* Rectangle.java に保存 */
public class Rectangle implements Shape {
    private double a, b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    /** 図形を表示する　*/
    public void print() {
        System.out.println(a + " x " + b + "の長方形です．");
    }

    /** 面積を返す */
    public double getArea() {
        return a * b;
    }
}
