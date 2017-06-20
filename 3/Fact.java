import java.util.Scanner; // これは決まり文句

/* 階乗を求める */
public class Fact {
    public static void main(String args[]) {
        Scanner stdIn = new Scanner(System.in); // これも決まり文句

        System.out.print("整数: ");
        int n = stdIn.nextInt();  // 整数の入力

        if (n >= 0) {
            /* 階乗の計算 */
            long ans = 1;
            for (int i = 1; i <= n; i++) {
                ans = ans * i;
            }
            System.out.println(n + "!=" + ans);
        } else {
            System.out.println("負の数です.");
        }
    }
}
