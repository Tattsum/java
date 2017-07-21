public class BadAsciiFigureTester {
    public static void main(String args[]) {


	BadAsciiTriangle tri1 = new BadAsciiTriangle(5);
	BadAsciiRectangle rect1= new BadAsciiRectangle(10, 5);
	BadAsciiSquare sq1 = new BadAsciiSquare(3);

	BadAsciiSquare sq2 = new BadAsciiSquare(1);
	sq2.setMark("#");

	BadAsciiRectangle rect2 = new BadAsciiRectangle(8, 6);
	rect2.setMark("@");

	BadAsciiTriangle tri2 = new BadAsciiTriangle(10);
	tri2.setMark(".");

	System.out.println(tri1);
	tri1.draw();
	System.out.println();

	System.out.println(rect1);
	rect1.draw();
	System.out.println();

	System.out.println(sq1);
	sq1.draw();
	System.out.println();

	System.out.println(sq2);
	sq2.draw();
	System.out.println();

	System.out.println(rect2);
	rect2.draw();
	System.out.println();

	System.out.println(tri2);
	tri2.draw();
	System.out.println();
    }
}
