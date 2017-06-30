/* スタックのインタフェース */
public interface Stack {
    /** 整数値valをスタックにpush */
    public void push(int val);

    /* スタックから整数値をpop */
    public int pop();

    /* スタックが空か調べる */
    public boolean empty();
}
