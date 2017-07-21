public class Person {
    /** 生成したオブジェクトの個数を管理．IDに利用する */
    protected static int personNum = 0;

    protected int id;       // ID
    protected String name;  // 名前
    protected int age;      // 年齢

    public Person(String name, int age) {
	id = ++personNum; // IDは自動で管理
	this.name = name;
	this.age = age;
    }

    public Person(int age) {
	this("匿名希望", age);
    }

    public Person() {
	this(-1);
    }

    public void print() {
	System.out.println("ID:   " + id);
	System.out.println("名前: " + name);
	if (age >= 0) {
	    System.out.println("年齢: " + age);
	} else {
	    System.out.println("年齢: 不詳");
	}
    }
}
    
