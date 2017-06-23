import java.util.Scanner; // これは決まり文句
import java.util.Arrays; //ソートのメソッドを追加

/*
実行例:

データ数? 10
10個のデータを入力してください
168.8  174.5  188.9  156.4  166.6  178.2  193.2  148.9  169.5  172.1
元の配列
168.8  174.5  188.9  156.4  166.6  178.2  193.2  148.9  169.5  172.1
昇順の配列
148.9  156.4  166.6  168.8  169.5  172.1  174.5  178.2  188.9  193.2
平均: 171.71000000000004
*/

public class ArrayExercise {
   public static void main(String[] args) {
       Scanner stdIn = new Scanner(System.in); // これも決まり文句

       System.out.print("データ数? ");
       int size = stdIn.nextInt() /* キーボードから整数を入力 */;

       /* 要素数sizeの実数配列の作成 */
       double [] a = new double [size];


       System.out.println(size + "個のデータを入力してください");
       for (int i = 0; i < size; i++) {
	   /* キーボードから実数を配列に入力 */;
           System.out.print("a[" + i + "]? ");
           a[i] = stdIn.nextDouble(); // 整数の入力
       }

       /* 入力された配列の出力 */
       System.out.println("元の配列");
       for (int i = 0; i < a.length; i++) {
           System.out.println("a[" + i + "] = " + a[i]);
       }


       /* 配列を昇順にソート */
       Arrays.sort(a);


       /* ソートされた配列の出力 */
       System.out.println("昇順の配列");
       for (int i = 0; i < a.length; i++) {
           System.out.println("a[" + i + "] = " + a[i]);
       }

       /* 配列の平均値を計算して出力 */
       double sum = 0, ave = 0;
       for (int i = 0;i<a.length; i++){
         sum += a[i];
       }
       ave = sum/a.length;
       System.out.println("平均: " +ave /* 平均 */);

   }
}
