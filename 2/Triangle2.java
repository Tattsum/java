/* p.35  list 1-3 */
public class Triangle2 {
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

    public void drawSmall() {
	Turtle s = new Turtle();
	s.move(200, 200);
	s.penDown();
	s.go(50);
	s.rotate(120);
	s.go(50);
	s.rotate(120);
	s.go(50);

    }

    public static void main(String[] args) {
	Triangle2 tri = new Triangle2();
	tri.draw();
	tri.drawSmall();
    }
}
	
