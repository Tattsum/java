public class ZigZagTurtle extends Turtle {
    protected int zzlen;  // ジグザグの長さ
    protected java.awt.Color zigColor = java.awt.Color.RED;
    protected java.awt.Color zagColor = java.awt.Color.BLUE;

    public ZigZagTurtle() {
	super();
	zzlen = 10; // デフォルトの刻み幅
    }

    /**  ジグザグの長さを設定してオブジェクトを作る */
    public ZigZagTurtle(int zzlen) {
	super();
	this.zzlen = zzlen;
    }

    /** ジグザグの長さを設定する */
    public void setZZLength(int zzlen) {
	this.zzlen = zzlen;
    }

    /** ジグザグに長さlengthだけ進む */
    public void go(int length) {
	rotate(60);
	while (true) {
	    zig();
	    // この時点で本来の進行方向の直線上にいる
	    length -= zzlen;    // 真っ直ぐ進んだ距離を引く
	    if (length <= 0) {  // 本来の進行方向にlength進んだら
		rotate(60);     // 本来の向きに戻す
		break;
	    }

	    zag();
	    // この時点で本来の進行方向の直線上にいる
	    length -= zzlen;   // 真っ直ぐ進んだ距離を引く
	    if (length<=0) {  // 本来の進行方向にlength進んだら
		rotate(-60);  // 本来の向きに戻す
		break;
	    }
	}
    }

    /** ジグザグのジグを描く */
    protected void zig() {
	setColor(zigColor);
	super.go(zzlen);
	rotate(-120);
	super.go(zzlen);
    }

    /** ジグザグのザグを描く */
    protected void zag() {
	setColor(zagColor);
	super.go(zzlen);
	rotate(120);
	super.go(zzlen);
    }


    /** テスト用のmainメソッド */
    public static void main(String[] args) {
	ZigZagTurtle zzt = new ZigZagTurtle(5);

	// 三角形を描く
	zzt.move(50,250);
	zzt.penDown();
	zzt.go(180);

	zzt.rotate(120);
	zzt.go(180);

	zzt.setZZLength(15);  // ジグザグの長さを変える
	zzt.rotate(120);
	zzt.go(180);
    }
}
	
