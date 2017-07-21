/* Tester.java に保存 */
public class Tester {
    public static void main(String args[]) {
        X anon = new X();
        X john = new X("John");
        Y paul = new Y("Paul", 75);
        I george = new X("George");
        I ringo = new Y("Ringo", 77);

        anon.show();
        john.show();
        paul.show();
        george.show();
        ringo.show();
    }
}
