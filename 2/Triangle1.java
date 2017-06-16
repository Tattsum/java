/* p.25  list 1-1 */
public class Triangle1 {
    public void draw() {
	Turtle t = new Turtle();
	t.move(10, 200);
	t.penDown();
	t.go(100);
	t.rotate(120);
	t.go(100);
	t.rotate(120);
	t.go(100);
    }

    public static void main(String[] args) {
	Triangle1 tri = new Triangle1();
	tri.draw();
    }
}
			      
