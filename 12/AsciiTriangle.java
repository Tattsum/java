/** 左下が直角な二等辺三角形のクラス */
public class AsciiTriangle extends AsciiFigure {
    private int edge; // 底辺と高さ

    public AsciiTriangle(int edge) {
	this.edge = edge;
    }

    public void draw() {
	for (int n = 1; n <= edge; n++) {
	    putLine(n);
	}
    }
}
