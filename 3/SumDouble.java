import java.util.Scanner; // これは決まり文句

/* 負の数が入力されるまで，実数を入力し合計を求める */
public class SumDouble {
    public static void main(String args[]) {
        Scanner stdIn = new Scanner(System.in); // これも決まり文句

        double sum = 0;
        while (true) {
            System.out.print("実数(負で終了): ");
            double data = stdIn.nextDouble();  // 実数の入力
            if (data < 0) {
                break;   // 無限ループを抜ける
            }
            sum += data;
        }
        System.out.println("合計は " + sum + "です．");
    }
}
