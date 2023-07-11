package tasks;

public class Stuff extends Employee {
    /*
    bir okuldaki tüm herkesi kaydedebilecek bir sistem geliştirilecek
    +öğrenci, öğretmen, görevliler bunların hepsinin ortak özelliği isim soy isim yaş ve kimlik numarası olacaktır
    +öğrencinin dönem sonu not ortalaması bilgisi
    +öğretmeninin verdiği ders isimleri ve bölümü
    +++görevlilerinde ""görev alanı"": bahçıvan, bina için temizlik, bakım onarım
    bunların dışında bir class ta her tipten 1 er entity oluşturulacak
    tüm bu tiplerin ortak methodu ""print()"" olacaktır
    print() çağrıldığında isim soy isim yaş kimlik no, ve kendisine ait tüm bilgileri yazacaktır
    bu class içinde tüm herkesi tek tek print ettireceğiz
     */
    private String dutyArea;
    private String duty;

    public Stuff() {
        super();
    }

    public String getDutyArea() {
        return dutyArea;
    }

    public String getDuty() {
        return duty;
    }

    public void setDutyArea(String dutyArea) {
        this.dutyArea = dutyArea;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public void print() {
        System.out.println("Id: " + getID() + "\nName: " + getName() + "\nSurname: " + getSurname() + "\nAge: " + getAge() +
                "\nDuty Area: " + dutyArea + "\nDuty: " + duty);
    }
}
