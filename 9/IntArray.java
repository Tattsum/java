public class IntArray implements IntSet {
    private int array[];
    private int num;     // 配列で使用しているデータ数

    /** コンストラクタ */
    public IntArray() {
	array = new int[8]; // 最初は要素数8の配列を作成
	num = 0;  // 保存されているデータ数は0
    }

    /**
     *  配列の最後(array[num])にvalueを加える
     */
    public void add(int value) {
	if (num >= array.length) {
	    /* 配列arrayが一杯なので，現在より要素数が8大きい配列を新たに作る */
	    int newArray[] = new int[array.length+8];

	    /* arrayの全要素をnewArrayにコピーする */
	    for (int i = 0; i < array.length; i++) {
		newArray[i] = array[i];
	    }
	    array = newArray;
	}

	array[num] = value; // 配列の最後に追加する
	num++; // 保存されているデータ数を1増やす
    }

    /**  array[0]〜array[num-1]にvalueの値があるか調べる */
    public boolean find(int value) {
	for (int i = 0; i < num; i++) {
	    if (array[i] == value) {
		return true;
	    }
	}
	return false;
    }

    /** 格納されている要素数を返す */
    public int size() {
	return num;
    }

    /** index番目の要素を返す */
    public int get(int index) {
	return array[index];
    }
}
