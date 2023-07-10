public class Student {
    /*
    bir öğrenci classı olucak: adı, soyadı, okul no., sınıfı, not1 not2 not3 bilgileri de olucak
    bir öğrenci oluşturmak için en az ad ve soyad gerekmektedir
    diğer bütün özellikler için getter setterlar yazılıcaktır
    öğrencinin adı ve soyadı değişrilemez ama okunabilir
    classta set not isminde bir method olucaktır,
    bu method aynı anda bir veya iki veya üç tane not setlenebilicek şekilde yazılıcak/overload.
     */
    private String name;
    private String surname;
    private int id;
    private static int idCounter = 1;
    private int classN;
    private Double grade1, grade2, grade3;
    private double gpa;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
        id = idCounter;
        idCounter++;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getId() {
        return id;
    }

    public int getClassN() {
        return classN;
    }

    public double getGrade1() {
        return grade1;
    }

    public double getGrade2() {
        return grade2;
    }

    public double getGrade3() {
        return grade3;
    }

    public double calculateGPA() {
        return (grade1 + grade2 + grade3) / 3.0;
    }

    public void setID(int id) {
        this.id = id;
    }

    public void setClassN(int classN) {
        if (classN >= 1 && classN <= 4) {
            this.classN = classN;
        } else {
            this.classN = 1;
        }
    }

    public void setGrade(double grade1) {
        this.grade1 = grade1;
        this.gpa = calculateGPA();
    }

    public void setGrade(double grade1, double grade2) {
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.gpa = calculateGPA();
    }

    public void setGrade(double grade1, double grade2, double grade3) {
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
        this.gpa = calculateGPA();
    }

    public String toString() {
        return name +
                " " + surname +
                "\nId:" + id +
                "\nClass:" + classN +
                "\nGrade1:" + grade1 +
                "\nGrade2:" + grade2 +
                "\nGrade3:" + grade3 +
                "\nGPA: " + gpa;
    }
}
