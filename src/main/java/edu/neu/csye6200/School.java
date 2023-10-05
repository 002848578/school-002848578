package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class School {

public static void demo() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(44, "abc", 57, 3.5));
        students.add(new Student(65, "uidsv", 81, 3.25));
        students.add(new Student(17, "njklh", 55, 4.0));
        students.add(new Student(9, "oscmjoj", 70, 2.0));
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(43, "obama", 56, 3.2));
        persons.add(new Person(45, "trump", 71, 2.25));
        persons.add(new Person(12, "taylor", 65, 4.0));
        persons.add(new Person(2, "adams", 90, 3.0));



        System.out.println("UNSORTED");
        Collections.sort(students);
        System.out.println("SORTED BY ID");
        System.out.println(students);

        students.sort(Student::compareByLastName);
        System.out.println("SORTED BY LASTNAME");
        System.out.println(students);

        students.sort(Student::compareByAge);
        System.out.println("SORTED BY AGE");
        System.out.println(students);

        students.sort(Student::compareByGPA);
        System.out.println("SORTED BY GPA");
        System.out.println(students);

        System.out.println("UNSORTED");
        Collections.sort(persons);
        System.out.println("SORTED BY ID");
        System.out.println(persons);

        persons.sort(Person::compareByLastName);
        System.out.println("SORTED BY LASTNAME");
        System.out.println(persons);

        persons.sort(Person::compareByAge);
        System.out.println("SORTED BY AGE");
        System.out.println(persons);

        persons.sort(Person::compareByGPA);
        System.out.println("SORTED BY GPA");
        System.out.println(persons);



    }









}
