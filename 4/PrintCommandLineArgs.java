public class PrintCommandLineArgs {
    // コマンドライン引数を順番に先頭に番号をつけて表示
    public static void main(String args[]) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(i + ": " + args[i]);
        }
    }
}
