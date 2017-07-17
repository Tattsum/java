/* ShapeTester.java に保存 */
public class ShapeTester {
    public static void info(Shape s) {
        s.print();
        System.out.println("面積 = " + s.getArea());
    }

    public static void main(String args[]) {
        Shape s1 = new Rectangle(1.5, 2.0);
        info(s1);

        Circle c = new Circle(2.0);
        info(c);
        System.out.println("cの円周 = " + c.getLength());

        Shape s2 = c;
        info(s2);
        System.out.println("s2の円周 = " + s2.getLength());
    }
}
