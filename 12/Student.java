public class Student extends Person {
    protected String school;  // 学校
    protected int    grade;   // 学年

    public Student(String name, int age, String school, int grade) {
        super(name, age);
        this.school = school;
        this.grade = grade;
    }

    public Student(String name, int age, int grade) {
        this(name, age, "秘密", grade);
    }

    public Student() {
        this("匿名希望", -1, "秘密", -1);
    }

    public void print() {
        super.print();
        System.out.println("学校: " + school);
        if (1 <= grade && grade <= 6) {
            System.out.println("学年: " + grade);
        } else {
            System.out.println("学年: 秘密");
        }
    }
}
