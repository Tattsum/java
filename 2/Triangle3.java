/* p.38  list 1-4 */
public class Triangle3 {
    public void drawTwo() {
	Turtle t1 = new Turtle();
	t1.move(10, 200);
	t1.penDown();
	t1.go(100);
	t1.rotate(120);
	t1.go(100);
	t1.rotate(120);
	t1.go(100);

	Turtle t2 = new Turtle();
	t2.move(30, 190);
	t2.penDown();
	t2.go(70);
	t2.rotate(120);
	t2.go(70);
	t2.rotate(120);
	t2.go(70);

    }

    public static void main(String[] args) {
	Triangle3 tri = new Triangle3();
	tri.drawTwo();
    }
}
	
