/** 長方形クラス */
public class AsciiRectangle extends AsciiFigure {
    private int width, height;

    public AsciiRectangle(int width, int height) {
	this.width = width;
	this.height = height;
    }

    public void draw() {
	for (int h = 1; h <= height; h++) {
	    putLine(width);
	}
    }
}
