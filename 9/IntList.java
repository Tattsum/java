/** 整数リストのノードを表すクラス */
class IntNode {
    private int value;     // このノードで保持する整数値
    private IntNode next;  // 次のノード. 次がなければ null にする

    /** コンストラクタ．ノードの値をvにし、次のノードをnullにする */
    IntNode(int v) {
        value = v;
        next = null;
    }

    /** 次のノードをnextにする */
    void setNext(IntNode next) {
	this.next = next;
    }

    /** 次のノードを返す */
    IntNode getNext() {
	return next;
    }


    /** 値を返す */
    int getValue() {
	return value;
    }
}

/** 整数リストを表すクラス */
public class IntList {
    private IntNode  head;  // リストの先頭

    /** コンストラクタ． 空のリストを作成する */
    public IntList() {
	head = null;
    }

    /**
     * リストの先頭にvalueの値を持つノードを加える
     *  (headの指す先は新たに追加したノードになる)
     */
    public void add(int value) {
	IntNode node = new IntNode(value);
	node.setNext(head);
	head = node;
    }

    /** リストにvalueの値を持つノードがあるか調べる */
    public boolean find(int value) {
	IntNode node = head;
	while (node != null) {
	    if (node.getValue() == value) {
		return true;
	    }
	    node = node.getNext();
	}
	return false;
    }

    /** リストのノード数を返す */
    public int size() {
	IntNode node = head;
	int count = 0;
	while (node != null) {
	    count++;
	    node = node.getNext();
	}
	return count;
    }

    /** リストのindex番目のノードの値を返す */
    public int get(int index) {
	IntNode node = head;
	while (index > 0) {
	    node = node.getNext();
	    index--;
	}
	return node.getValue();

    }

    /**
     *  リストの中からvalueを持つノードを削除する
     *   成功すればtrueを、該当ノードがなく失敗したばあいはfalseを返す
     */
    public boolean remove(int value) {
	if (head == null) {
	    return false;
	}
	else if (head.getValue() == value) {
	    head = head.getNext();
	    return true;
	}
	else {
	    IntNode node = head;
	    while (node != null) {
		if (node.getNext() == null) {
		    return false;
		}
		else if (node.getNext().getValue() == value) {
		    node.setNext(node.getNext().getNext());
		    return true;
		}
		else {
		    node = node.getNext();
		}
	    }
	    return false;
	}
    }
}
