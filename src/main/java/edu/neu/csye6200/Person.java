package edu.neu.csye6200;

public class Person implements Comparable<Person>{
    
    private int ID;
    private int Age;
    private String LastName;
    private double GPA;

    Person(int id, String lastName, int age, double gpa) {
        this.ID = id;
        this.Age = age;
        this.LastName = lastName;
        this.GPA = gpa;
    }

    public static int compareByGPA(Person p1, Person p2) {
        return Double.compare(p1.GPA, p2.GPA);
    }

    public static int compareByLastName(Person p1, Person p2) {
        return p1.LastName.compareToIgnoreCase(p2.LastName);
    }

    public static int compareByAge(Person p1, Person p2) {
        return Integer.compare(p1.Age, p2.Age);
    }

    @Override
    public String toString(){
        return "ID: " + this.ID + " Last Name:" + this.LastName + " Age:" + this.Age + " GPA:" + this.GPA + "\n";
    }

    @Override
    public int compareTo(Person o) {
        Person p = (Person) o;
        return Integer.compare(this.ID, p.ID);
    }
}
