import java.util.Scanner; // これは決まり文句

class ArithInt {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in); // これも決まり文句

        System.out.println("xとyを加減乗除します");

        System.out.print("xの値: ");
        int x = stdIn.nextInt();  // 整数の入力

        System.out.print("yの値: ");
        int y = stdIn.nextInt();  // 整数の入力

        System.out.println("x + y = " + ( x + y));
        System.out.println("x - y = " + ( x - y));
        System.out.println("x * y = " + ( x * y));
        System.out.println("x / y = " + ( x / y));
        System.out.println("x % y = " + ( x % y));
    }
}
