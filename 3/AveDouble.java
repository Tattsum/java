import java.util.Scanner; // これは決まり文句

// 最初にデータ数を入力し，そのデータ数だけ実数を入力して， 平均値を表示するプログラム

public class AveDouble {
  public static void main (String args[]) {

    Scanner stdIn = new Scanner (System.in); //決まり文句

    System.out.print("データ数：");
    int num = stdIn.nextInt(); //整数の入力

    double sum = 0;
    for (int i = 0 ; i < num ; i++){
       double data = stdIn.nextDouble(); //実数の入力
       sum += data;
    }
    double ave = sum/num;
    System.out.println("平均は" + ave);
  }
}
