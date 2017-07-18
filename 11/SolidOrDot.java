// 「やさしいJavaプログラミング」リスト9-8
    public static void main(String args[]) {
	Turtle t;

	if (args.length > 0 && args[0].equals("dot")) {
	    DotTurtle st = new DotTurtle();
	    st.setLength(5);
	    t = st;
	}
	else {
	    t = new Turtle();
	}

	t.move(10,200);
	t.penDown();
	t.go(200);
	t.rotate(120);
	t.go(200);
	t.rotate(120);
	t.go(200);
    }
}
