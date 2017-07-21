public class BadAsciiTriangle {
    private String mark = "*"; // デフォルトは "*"
    private int edge; // 底辺と高さ

    public BadAsciiTriangle(int edge) {
	this.edge = edge;
    }

    /** mark を設定する */
    public void setMark(String mark) {
	this.mark = mark;
    }

    /** 1行に n個の mark を出力 */
    private void putLine(int n) {
	for (int i = 1; i <= n; i++) {
	    System.out.print(mark);
	}
	System.out.println();
    }

    /** 三角形を描く */
    public void draw() {
	for (int n = 1; n <= edge; n++) {
	    putLine(n);
	}
    }
}
