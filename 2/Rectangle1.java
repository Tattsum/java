public class Rectangle1 {
    public void draw() {
	Turtle t = new Turtle();
	t.move(50, 200);
	t.penDown();
	t.go(150);
	t.rotate(90);
	t.go(100);
	t.rotate(90);
	t.go(150);
	t.rotate(90);
	t.go(100);
    }

    public static void main(String[] args) {
	Rectangle1 rect = new Rectangle1();
	rect.draw();
    }
}
	
