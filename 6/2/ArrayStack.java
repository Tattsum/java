/** Javaによる配列を用いた整数のスタック */
public class ArrayStack implements Stack {
    private final int SMAX = 128; /* 配列の大きさ: 定数 */
    private int box[];  /* データを格納する整数の配列 */
    private int top;    /* データの先頭の添え字 */

    public ArrayStack() {
	box = new int[SMAX]; /* 配列の作成 */
	top = -1;   /* 空のときの先頭は -1 */
    }

    /** 整数値valをスタックにpush */
    public void push(int val) {
	top++;
	box[top] = val;
    }

    /* スタックから整数値をpop */
    public int pop() {
	int val = box[top];
	top--;
	return val;
    }

    /* スタックが空か調べる */
    public boolean empty() {
	return (top == -1);
    }
}
