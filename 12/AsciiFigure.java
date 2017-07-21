public class AsciiFigure {
    private String mark = "*"; // デフォルトは "*"

    /** mark を設定する */
    public void setMark(String mark) {
	this.mark = mark;
    }

    /** 1行に n個の mark を出力する
     *  サブクラス以外からは使われないと考えて，protectedにしている
     */
    protected void putLine(int n) {
	for (int i = 1; i <= n; i++) {
	    System.out.print(mark);
	}
	System.out.println();
    }

    /** 図形を描く．
      * ただし，このクラスのdraw()は何も描かない．
      * サブクラスで適切にオーバライドすること．
      */
    public void draw() {
	/* do nothing */
    }
}
