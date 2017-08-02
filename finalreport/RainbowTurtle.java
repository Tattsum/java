public class RainbowTurtle extends Turtle {
    private int rotateNum; /* rotateした回数 */

    public RainbowTurtle() {
	/* スーパークラス(Turtle)のコンストラクタを呼ぶ */
	super();

	/* 回転回数を初期化 */
	rotateNum = 0;
    }

    /** 進行方向に対して，半時計回りに d度向きを変える */
    public void rotate(int d) {
	/* 色を変える */
	switch (rotateNum % 6) {
	case 0:	setColor(java.awt.Color.RED); break;
	case 1:	setColor(java.awt.Color.ORANGE); break;
	case 2:	setColor(java.awt.Color.YELLOW); break;
	case 3:	setColor(java.awt.Color.GREEN); break;
	case 4:	setColor(java.awt.Color.BLUE); break;
	case 5:	setColor(java.awt.Color.MAGENTA); break;
	}
	rotateNum++;
	/* 色を変えたら Turtleクラスの rotateメソッドを呼び出す */
	super.rotate(d);
    }


    /** テスト用mainメソッド */
    public static void  main(String args[]) {
	RainbowTurtle t = new RainbowTurtle();
	t.move(50, 300);

	/* ペンを下げて正方形を描く */
	t.penDown();
	for (int i = 1; i <= 4; i++) {
	    t.go(150);
	    t.rotate(90);
	}

	/* ペンを上げて移動(軌跡を描かせない) */
	t.penUp();
	t.move(100, 250);

	/* ペンを下げて正方形を描く */
	t.penDown();
	for (int i = 1; i <= 4; i++) {
	    t.go(50);
	    t.rotate(90);
	}
    }
}
