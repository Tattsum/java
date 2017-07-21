/* Y.javaに保存 */
public class Y extends X {
    private int age;
    public Y(String name, int age) {
        super(name);
        this.age = age;
    }
    protected String getStr() {
        return super.getStr() + "(" + age + ")";
    }
}
