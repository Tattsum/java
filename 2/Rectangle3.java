public class Rectangle3 {
    public void draw() {
	Turtle t1 = new Turtle();
	t1.move(50, 200);
	t1.penDown();
	t1.go(150);

	Turtle t2 = t1;
	t2.rotate(90);
	t2.go(100);

	Turtle t3 = t2;
	t3.rotate(90);
	t3.go(150);

	Turtle t4 = t3;
	t4.rotate(90);
	t4.go(100);
    }

    public static void main(String[] args) {
	Rectangle3 rect = new Rectangle3();
	rect.draw();
    }
}
	
