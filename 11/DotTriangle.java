/**
   「やさしいJavaプログラミング」リスト9-4改
   意味的にはDotTriangle
   DotTurtleオブジェクトを使って，点線で三角形を描く
*/
public class DotTriangle {
    public static void main(String args[]) {
	DotTurtle t = new DotTurtle();
	t.setLength(5);
	t.move(10,200);
	t.penDown();
	t.go(200);
	t.rotate(120);
	t.go(200);
	t.rotate(120);
	t.go(200);
    }
}
