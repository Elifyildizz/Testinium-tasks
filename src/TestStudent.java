public class TestStudent {
    public static void main(String[] args) {
        Student stu1 = new Student("Elif", "Yildiz");
        stu1.setClassN(3);
        stu1.setGrade(70);
        System.out.println("Students info: " + stu1.toString());
        Student stu2 = new Student("Caglar", "Bilgin");
        stu1.setClassN(4);
        stu2.setGrade(60,70,80);
        System.out.println("Students info: " + stu2.toString());
    }
}
