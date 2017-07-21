public class PSTester {
    public static void main(String args[]) {
        Person persons[] = new Person[7];
        persons[0] = new Person();
        persons[1] = new Person("山田太郎", 20);
        persons[2] = new Person(30);
        persons[3] = new Student("田中一郎", 17, "平成高校", 2);
        persons[4] = new Student("中島光宙",  8, "平成小", 3);
        persons[5] = new Student("中島結愛",  6, 1);
        persons[6] = new Student();

        for (int i = 0; i < persons.length; i++) {
            persons[i].print();
            System.out.println();
        }
    }
}
