public class SetMerger {

    /**
     *  IntListで表された集合aにIntListで表された集合bの要素を加える
     *  集合なので、bの要素が既にaに存在している場合はその要素は追加されない
     *  またaの内容(要素)は変化する(以下のメソッドでも同様)
     */
    public static void sum(IntList a, IntList b) {
	/* 記述せよ */
        int s=b.size();
        for(int i=0;i<s;i++){
            int v=b.get(i);
            if(!a.find(v))
                a.add(v);
        }
    }

    /** IntListで表された集合aにIntArrayで表された集合bの要素を加える */
    public static void sum(IntList a, IntArray b) {
	/* 記述せよ */
        int s=b.size();
        for(int i=0;i<s;i++){
            int v=b.get(i);
            if(!a.find(v))
                a.add(v);
        }
    }

    /** IntArrayで表された集合aにIntArrayで表された集合bの要素を加える */
    public static void sum(IntArray a, IntArray b) {
	/* 記述せよ */
        int s=b.size();
        for(int i=0;i<s;i++){
            int v=b.get(i);
            if(!a.find(v))
                a.add(v);
        }
    }

    /** IntArrayで表された集合aにIntListで表された集合bの要素を加える */
    public static void sum(IntArray a, IntList b) {
	/* 記述せよ */
        int s=b.size();
        for(int i=0;i<s;i++){
            int v=b.get(i);
            if(!a.find(v))
                a.add(v);
        }
    }

    /** IntList aの要素を表示する */
    public static void printIntList(IntList a) {
	/* 記述せよ */
        for(int i=0;i<a.size();i++){
            int v=a.get(i);
            System.out.print(v);
        }
        System.out.println();
    }

    /** IntArray aの要素を表示する */
    public static void printIntArray(IntArray a) {
	/* 記述せよ */
	/* 記述せよ */
        for(int i=0;i<a.size();i++){
            int v=a.get(i);
            System.out.print(v);
        }
        System.out.println();
    }

    public static void main(String args[]) {
        IntList  list1 = new IntList();
        IntList  list2 = new IntList();
        IntArray array1 = new IntArray();
        IntArray  array2 = new IntArray();

        // list1 は 1, 2, 3, 4
        list1.add(1); list1.add(2); list1.add(3); list1.add(4);

        // list2 は 4, 5, 6, 7
        list2.add(4); list2.add(5); list2.add(6); list2.add(7);

	// array1は空のまま
	// array2は 2, 3, 4, 6, 8, 9
	array2.add(2); array2.add(3); array2.add(4);
	array2.add(6); array2.add(8); array2.add(9);

	// 最初のlistとarrayを表示
	System.out.print("list1: ");
	printIntList(list1);
	System.out.print("list2: ");
	printIntList(list2);
	System.out.print("array1: ");
	printIntArray(array1);
	System.out.print("array2: ");
	printIntArray(array2);

	// list1にlist2を足す
	sum(list1, list2);
	// list1の内容を表示
	System.out.print("sum(list1, list2): ");
	printIntList(list1);

	// array1にlist2を足す
	sum(array1, list2);
	// array1の内容を表示
	System.out.print("sum(array1, list2): ");
	printIntArray(array1);

	// array1にarray2を足す
	sum(array1, array2);
	// array1の内容を表示
	System.out.print("sum(array1, array2) ");
	printIntArray(array1);

	// list2にarray2を足す
	sum(list2, array2);
	// list2の内容を表示
	System.out.print("sum(list2, array2): ");
	printIntList(list2);
    }

}
