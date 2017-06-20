import java.util.Scanner; // これは決まり文句

public class SampleIf {
    public static void main(String args[]) {
        Scanner stdIn = new Scanner(System.in); // これも決まり文句

        System.out.print("整数: ");
        int n = stdIn.nextInt();  // 整数の入力

        if (n >= 0) {
            boolean bai2; /* boolean型: 2の倍数ならtrue */
            if (n % 2 == 0) {
                System.out.println("偶数です.");
                bai2 = true;
            } else {
                System.out.println("奇数です.");
                bai2 = false;
            }

            boolean bai3; /* boolean型: 3の倍数ならtrue */
            if (n % 3 == 0) {
                System.out.println("3の倍数です.");
                bai3 = true;
            } else if (n % 3 == 1) {
                System.out.println("3で割ると1余ります.");
                bai3 = false;
            } else {
                System.out.println("3で割ると2余ります.");
                bai3 = false;
            }

            if (bai2 && bai3) {
                System.out.println("6の倍数です.");
            }
        } else {
            System.out.println("負の整数です.");
        }

    }
}
