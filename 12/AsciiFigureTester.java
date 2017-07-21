public class AsciiFigureTester {
    public static void main(String args[]) {
	// スーパークラスAsciiFigureの配列
	AsciiFigure af[] = new AsciiFigure[6];
	af[0] = new AsciiTriangle(5);
	af[1] = new AsciiRectangle(10, 5);
	af[2] = new AsciiSquare(3);

	af[3] = new AsciiSquare(1);
	af[3].setMark("#");

	af[4] = new AsciiRectangle(8, 6);
	af[4].setMark("@");

	af[5] = new AsciiTriangle(10);
	af[5].setMark(".");

	for (int i = 0; i < af.length; i++) {
	    // AsciiFigureの配列の要素af[i]に対してdrawメソッドを呼び出す
	    // af[i]が参照するオブジェクトのdrawメソッドが呼ばれる
	    af[i].draw();
	}
    }
}
