/***** CkParen.java *****/
import java.util.Scanner;

/** スタックを用いて括弧の対応を調べる */
public class CkParen {
    public static void main(String args[]) {
	Stack s = new Stack(); // スタックの作成

	/* 標準入力から1行読み込む */
	Scanner stdIn = new Scanner(System.in);
	String line = stdIn.nextLine();

	/** 文字列lineを1文字ずつ処理 */
	for (int i = 0; i < line.length(); i++ ) {
	    char ch = line.charAt(i); // i文字目
	    if (ch == '(') {
		s.push(ch);
	    } else if (ch == ')') {
		if (s.empty()) {
		    System.out.println("missing '('");
		    System.exit(1);
		} else {
		    s.pop();
		}
	    }
	}

	if (s.empty()) {
	    System.out.println("OK");
	} else {
	    System.out.println("missing ')'");
	}
    }
}
