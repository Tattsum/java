public class Pentagon {
    public void draw() {
	Turtle t = new Turtle();
	t.move(100, 200);
	t.penDown();
	t.go(100);
	t.rotate(72);
	t.go(100);
	t.rotate(72);
	t.go(100);
	t.rotate(72);
	t.go(100);
	t.rotate(72);
	t.go(100);

    }

    public static void main(String[] args) {
	Pentagon rect = new Pentagon();
	rect.draw();
    }
}
