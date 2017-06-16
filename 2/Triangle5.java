/* pp.40-41  */
public class Triangle5 {
    public void drawTwo() {
	Turtle t1 = new Turtle();
	t1.move(10, 200);
	t1.penDown();
	t1.go(100);
	t1.rotate(120);
	t1.go(100);
	t1.rotate(120);
	t1.go(100);

	t1 = new Turtle();
	t1.move(30, 190);
	t1.penDown();
	t1.go(70);
	t1.rotate(120);
	t1.go(70);
	t1.rotate(120);
	t1.go(70);
    }

    public static void main(String[] args) {
	Triangle5 tri = new Triangle5();
	tri.drawTwo();
    }
}
