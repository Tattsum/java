public class SalesPerson extends Person {
    public SalesPerson(String name) {
        super(name);
    }

    public void bye() {
        System.out.println(name + "が担当しました．失礼します．");
    }

    public void thanks() {
        System.out.println("ありがとうございました．");
    }
}
