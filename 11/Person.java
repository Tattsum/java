public class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public void hello() {
        System.out.println("こんにちは，" + name + "です．");
    }

    public void bye() {
        System.out.println("さよなら．");
    }
}
