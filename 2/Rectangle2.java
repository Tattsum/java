public class Rectangle2 {
    public void draw() {
	Turtle t1 = new Turtle();
	t1.move(50, 200);

	Turtle t2 = new Turtle();
	t2.move(200, 200);

	Turtle t3 = new Turtle();
	t3.move(200, 100);

	Turtle t4 = new Turtle();
	t4.move(50, 100);

	t1.penDown();
	t1.go(150);

	t2.penDown();
	t2.rotate(90);
	t2.go(100);

	t3.penDown();
	t3.rotate(180);
	t3.go(150);

	t4.penDown();
	t4.rotate(270);
	t4.go(100);
    }

    public static void main(String[] args) {
	Rectangle2 rect = new Rectangle2();
	rect.draw();
    }
}
