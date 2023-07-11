package tasks;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("Employee","Employeee",23891092,25);
        emp.print();

        Instructor ins= new Instructor();
        ins.setFaculty("Engineering");
        ins.setLessonName("Oop");
        ins.setName("Caglar");
        ins.setID(938012);
        ins.print();
        //it can print without surname

        Student stu= new Student();
        stu.setName("Elif");
        stu.setGpa(3.7);
        System.out.println("Name: " +stu.getName()+" Gpa: "+stu.getGpa());
        stu.print();

        Stuff stuff= new Stuff();
        stuff.setDuty("Cleaning");
        stuff.setDutyArea("Classes");
        stuff.print();
    }
}
