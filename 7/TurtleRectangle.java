public class TurtleRectangle {


// 一辺の長さがlengthの三角形を書く (TurtleCirclerの別バージョン)
//  (speed と length の値によってはピッタリlengthにならない場合もある)
    public int speed,height,width;
    public int movedLength;  // これまで動いた距離
    public int co;
    public Turtle t;

    public void init(int xpos, int ypos, int speed, int width,int height) {
	this.speed = speed;
	this.width = width;
	this.height = height;
        this.movedLength = 0;
	this.t = new Turtle();
	this.t.move(xpos, ypos);
	this.t.penDown();
        this.co = 0;
    }

  public void setColor(java.awt.Color c){
        this.t.setColor(c);
    }

    public void step() {
	// speed分だけ進める
	this.t.go(this.speed);

	// これまで動いた長さにspeedを足す
	this.movedLength += this.speed;

	// 一辺の長さ(length)以上動いてたら，向きを変える

        if(this.co == 0){
            if(this.movedLength>= this.width){
                this.t.rotate(90);
                this.movedLength = 0;
                this.co = 1;
            }
        }

        if(this.co == 1){
            if(this.movedLength>= this.height){
                this.t.rotate(90);
                this.movedLength = 0;
                this.co = 0;
            }
        }
    }




    public static void main(String[] args) {

	TurtleRectangle rect1  = new TurtleRectangle();
        TurtleRectangle rect2  = new TurtleRectangle();
        TurtleRectangle rect3  = new TurtleRectangle();

        rect1.init(25,350,100,200,300);
        rect2.init(30,160,150,300,150);
        rect3.init(150, 250, 50, 150, 100);


	rect1.setColor(java.awt.Color.PINK);
        rect2.setColor(java.awt.Color.BLACK);
        rect3.setColor(java.awt.Color.BLUE);

	while (true) {  // 実際に長方形を書く
	    rect1.step();
            rect2.step();
            rect3.step();
	}
    }
}
