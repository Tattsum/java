public class RainbowTurtleRectangle {


    // 一辺の長さがlengthの三角形を書く (TurtleCirclerの別バージョン)
    //  (speed と length の値によってはピッタリlengthにならない場合もある)
    private int speed,height,width;
    private int movedLength;  // これまで動いた距離
    private int co;
    private RainbowTurtle t;

    public RainbowTurtleRectangle(int xpos, int ypos, int speed, int width,int height) {
      	this.speed = speed;
      	this.width = width;
      	this.height = height;
              this.movedLength = 0;
      	this.t = new RainbowTurtle();
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

	   RainbowTurtleRectangle rect1  = new RainbowTurtleRectangle(50,250,50,200,100);

	       while (true) {  // 実際に長方形を書く
	          rect1.step();
	       }
  }
}
