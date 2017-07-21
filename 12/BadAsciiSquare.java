public class BadAsciiSquare {
    private String mark = "*"; // デフォルトは "*"
    private int edge; // 1辺の長さ

    public BadAsciiSquare(int edge) {
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

    /** 正方形を描く */
    public void draw() {
	for (int n = 1; n <= edge; n++) {
	    putLine(edge);
	}
    }
}
