import java.util.Scanner; // これは決まり文句

/* 入力された整数の合計を求める */
public class SumInt {
    public static void main(String args[]) {
        Scanner stdIn = new Scanner(System.in); // これも決まり文句

        System.out.print("データ数: ");
        int num = stdIn.nextInt();  // 整数の入力

        int sum = 0;
        for (int i = 1; i <= num; i++) {
            int data = stdIn.nextInt(); // 整数の入力
            sum += data;
        }
        System.out.println("合計は " + sum + "です．");
    }
}
