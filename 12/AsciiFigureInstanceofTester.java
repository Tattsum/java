class AsciiFigureInstanceofTester {
    public static void main(String args[]) {
	AsciiFigure tri = new AsciiTriangle(5);
	AsciiFigure rect = new AsciiRectangle(10, 5);
	AsciiFigure sq = new AsciiSquare(3);

	if (tri instanceof AsciiFigure) {
	    System.out.println("tri instanceof AsciiFigure は true");
	} else {
	    System.out.println("tri instanceof AsciiFigure は false");
	}

	if (tri instanceof AsciiTriangle) {
	    System.out.println("tri instanceof AsciiTriangle は true");
	} else {
	    System.out.println("tri instanceof AsciiTriangle は false");
	}
	if (tri instanceof AsciiRectangle) {
	    System.out.println("tri instanceof AsciiRectangle は true");
	} else {
	    System.out.println("tri instanceof AsciiRectangle は false");
	}

	if (tri instanceof AsciiSquare) {
	    System.out.println("tri instanceof AsciiSquare は true");
	} else {
	    System.out.println("tri instanceof AsciiSquare は false");
	}


	if (rect instanceof AsciiFigure) {
	    System.out.println("rect instanceof AsciiFigure は true");
	} else {
	    System.out.println("rect instanceof AsciiFigure は false");
	}

	if (rect instanceof AsciiTriangle) {
	    System.out.println("rect instanceof AsciiTriangle は true");
	} else {
	    System.out.println("rect instanceof AsciiTriangle は false");
	}

	if (rect instanceof AsciiRectangle) {
	    System.out.println("rect instanceof AsciiRectangle は true");
	} else {
	    System.out.println("rect instanceof AsciiRectangle は false");
	}

	if (rect instanceof AsciiSquare) {
	    System.out.println("rect instanceof AsciiSquare は true");
	} else {
	    System.out.println("rect instanceof AsciiSquare は false");
	}


	if (sq instanceof AsciiFigure) {
	    System.out.println("sq instanceof AsciiFigure は true");
	} else {
	    System.out.println("sq instanceof AsciiFigure は false");
	}

	if (sq instanceof AsciiTriangle) {
	    System.out.println("sq instanceof AsciiTriangle は true");
	} else {
	    System.out.println("sq instanceof AsciiTriangle は false");
	}

	if (sq instanceof AsciiRectangle) {
	    System.out.println("sq instanceof AsciiRectangle は true");
	} else {
	    System.out.println("sq instanceof AsciiRectangle は false");
	}

	if (sq instanceof AsciiSquare) {
	    System.out.println("sq instanceof AsciiSquare は true");
	} else {
	    System.out.println("sq instanceof AsciiSquare は false");
	}

    }
}


	
