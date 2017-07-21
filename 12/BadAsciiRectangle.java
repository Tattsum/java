public class BadAsciiRectangle {
    private String mark = "*"; // デフォルトは "*"
    private int width, height; // 幅と高さ

    public BadAsciiRectangle(int width, int height) {
	this.width = width;
	this.height = height;
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

    /** 長方形を描く */
    public void draw() {
	for (int h = 1; h <= height; h++) {
	    putLine(width);
	}
    }
}
