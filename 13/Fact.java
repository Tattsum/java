/** 階乗を計算するクラス */
public class Fact {
    /** nの階乗を計算する。nが負ならば例外を投げる */
    public static int fact(int n) throws NegativeNumberException {
	if (n < 0) {  // 負の数の階乗
	    // エラーなので、例外を作成して投げる
	    throw new NegativeNumberException(n + " is negative number");
	}
	else if (n == 0) {
	    return 1;
	}
	else {
	    return n*fact(n-1);
	}
    }

    /** テスト用メインメソッド */
    public static void main(String args[]) {
	int result;

	try { // 例外が起こり得る部分
	    result = Fact.fact(3);
	    System.out.println("fact(3) = " + result);
	    result = Fact.fact(-1);
	    System.out.println("fact(-1) = " + result);
	    result = Fact.fact(0);
	    System.out.println("fact(0) = " + result);
	}
	catch (NegativeNumberException e) {
	    // 例外をキャッチした後の処理
	    // メッセージを表示
	    System.err.println("NegativeNumberException was thrown: "
			       +  e.getMessage());
	    // 例外が投げられるまでの経緯を表示
	    e.printStackTrace();
	}
    }
}
