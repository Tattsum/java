public class TestPersons {
    public static void main(String args[]) {
        Person taro = new Person("太郎");
        taro.hello();
        taro.bye();

        SalesPerson ichiro = new SalesPerson("一郎");
        ichiro.hello();
        ichiro.thanks();
        ichiro.bye();

        Person p = ichiro;
        p.hello();
        p.bye();

        SalesPerson sp = ichiro;
    }
}
