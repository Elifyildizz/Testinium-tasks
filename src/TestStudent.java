public class TestStudent {
    public static void main(String[] args) {
        Student stu1 = new Student("Elif", "Yildiz");
        /*
        Student stu2= new Student();
        Can not work without giving a value because the name and surname are in the constructor.
         */
        stu1.setID(1);
        stu1.setClassN(3);
        stu1.setGrade(70.0,80.0);
        System.out.println("Students info: " + stu1.toString());
    }
}
