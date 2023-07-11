package tasks;

public class Student extends Employee {
    /*
    bir okuldaki tüm herkesi kaydedebilecek bir sistem geliştirilecek
    +öğrenci, öğretmen, görevliler bunların hepsinin ortak özelliği isim soy isim yaş ve kimlik numarası olacaktır
    +++öğrencinin dönem sonu not ortalaması bilgisi
    öğretmeninin verdiği ders isimleri ve bölümü
    görevlilerinde ""görev alanı"": bahçıvan, bina için temizlik, bakım onarım
    bunların dışında bir class ta her tipten 1 er entity oluşturulacak
    tüm bu tiplerin ortak methodu ""print()"" olacaktır
    print() çağrıldığında isim soy isim yaş kimlik no, ve kendisine ait tüm bilgileri yazacaktır
    bu class içinde tüm herkesi tek tek print ettireceğiz
     */
    private double gpa;

    public Student() {
        super();
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void print() {
        System.out.println("Id: " + getID() + "\nName: " + getName() + "\nSurname: " + getSurname() + "\nAge: " + getAge() +
                "\nGpa: " + gpa);
    }
}
