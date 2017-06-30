/** Javaによる配列を用いた整数のスタック */
public class Stack {
    int box[];  /* データを格納する整数の配列 */
    int top;    /* データの先頭の添え字 */

    Stack() {
	box = new int[128]; /* 配列の作成 */
	top = -1;   /* 空のときの先頭は -1 */
    }

    /** 整数値valをスタックにpush */
    void push(int val) {
	top++;
	box[top] = val;
    }

    /* スタックから整数値をpop */
    int pop() {
	int val = box[top];
	top--;
	return val;
    }

    /* スタックが空か調べる */
    boolean empty() {
	return (top == -1);
    }
}
