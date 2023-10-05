package edu.neu.csye6200;

public class Student extends Person {
    
    private int ID;
    private int Age;
    private String LastName;
    private double GPA;
    
    Student(int id, String lastName, int age, double gpa) {
        super(age, lastName, age, gpa);
        this.ID = id;
        this.Age = age;
        this.LastName = lastName;
        this.GPA = gpa;
    }

    public static int compareByGPA(Student s1, Student s2) {
        return Double.compare(s1.GPA, s2.GPA);
    }

    public static int compareByLastName(Student s1, Student s2) {
        return s1.LastName.compareToIgnoreCase(s2.LastName);
    }

    public static int compareByAge(Student s1, Student s2) {
        return Integer.compare(s1.Age, s2.Age);
    }

    @Override
    public int compareTo(Person o) {
        Student s = (Student) o;
        return Integer.compare(this.ID, s.ID);
    }


  

    @Override
    public String toString(){
        return "ID: " + this.ID + " Last Name:" + this.LastName + " Age:" + this.Age + " GPA:" + this.GPA + "\n";
    }
}
