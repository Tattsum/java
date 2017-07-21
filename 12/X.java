/* X.java に保存 */
public class X implements I {
    protected String name;
    public X() {
        name = "anonymous";
    }
    public X(String name) {
        this.name = name;
    }
    protected String getStr() {
        return name;
    }
    public void show() {
        System.out.println("I'm " + getStr() + ".");
    }
}
