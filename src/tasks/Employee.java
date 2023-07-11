package tasks;

public class Employee {
    /*
    bir okuldaki tüm herkesi kaydedebilecek bir sistem geliştirilecek
    +öğrenci, öğretmen, görevliler bunların hepsinin ortak özelliği isim soy isim yaş ve kimlik numarası olacaktır
    öğrencinin dönem sonu not ortalaması bilgisi
    öğretmeninin verdiği ders isimleri ve bölümü
    görevlilerinde ""görev alanı"": bahçıvan, bina için temizlik, bakım onarım
    bunların dışında bir class ta her tipten 1 er entity oluşturulacak
    tüm bu tiplerin ortak methodu ""print()"" olacaktır
    print() çağrıldığında isim soy isim yaş kimlik no, ve kendisine ait tüm bilgileri yazacaktır
    bu class içinde tüm herkesi tek tek print ettireceğiz
     */
    private String name;
    private String surname;
    private int ID;
    private int age;

    public Employee() {
        this.name = name;
        this.surname = surname;
        this.ID = ID;
        this.age = age;
    }

    public Employee(String name, String surname, int ID, int age) {
        this.name = name;
        this.surname = surname;
        this.ID = ID;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getID() {
        return ID;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void print() {
        System.out.println("Id: " + ID + "\nName: " + name + "\nSurname: " + surname + "\nAge: " + age);
    }
}
