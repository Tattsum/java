import java.util.Scanner; // これは決まり文句

public class HelloNexts {
    public static void main(String args[]) {
        Scanner stdIn = new Scanner(System.in); // これも決まり文句

        System.out.print("名前は? ");
        String name = stdIn.next();

        System.out.print("年齢は? ");
        int age = stdIn.nextInt();

        System.out.print("職業は? ");
        String job = stdIn.next();

        System.out.println("こんにちは，" + job + "の"
                           + name + "さん(" + age +")");
    }
}
