// java.ioパッケージのクラスをimportする

import java.io.*;

/**
  * ファイルをコピーするクラス
  */
public class FileCopy {
    protected String fromFileName;  // コピー元ファイル名
    protected String toFileName;    // コピー先ファイル名

    public FileCopy(String from, String to) {
	// ファイル名を設定
	fromFileName = from;
	toFileName = to;
    }

    /** ファイルをコピーする */
    public void copy() {
	try {
	    // ファイルを読むためのオブジェクト
	    BufferedReader reader
		= new BufferedReader(new FileReader(fromFileName));

	    // ファイルに書くためのオブジェクト
	    BufferedWriter writer
		= new BufferedWriter(new FileWriter(toFileName));


	    int c;  // 文字
	    // readメソッドは1文字ずつ読む。ファイルの終端なら-1を返す
	    while ((c = reader.read()) >= 0) {
		// writeメソッドは1文字ずつ書く
		writer.write(c);
	    }
	    // バッファに溜っている文字を書き出す
	    writer.flush();
	}
	catch (IOException e) { // 例外処理(エラー処理)
	    System.err.println("IO Error: " + e.getMessage());
	}
    }

    public static void main(String args[]) {
	if (args.length == 2) {
	    FileCopy fc = new FileCopy(args[0], args[1]);
	    fc.copy();
	}
	else {
	    System.err.println("usage: fromFile toFile");
	    System.exit(1);
	}
    }
}
