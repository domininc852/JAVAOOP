package model;

public class Student {
    public String name;
    public int age;
    public String gender;
    public int idNumber;
    public Student(String name, int age, String gender, int idNumber){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.idNumber=idNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
}
