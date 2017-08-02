public abstract class TurtleRemoCon {
    protected Turtle t;

    public TurtleRemoCon(Turtle t) {
	this.t = t;
    }

    /** 1ステップ描く */
    public abstract void step();
}
