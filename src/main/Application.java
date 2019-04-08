package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;
import person.consciousness.Knowledge;

public class Application {
    public static void main(String[] args) {
        University university = new University("CH.U.I.");
        university.addStudent(new Student("Andrew Kostenko", new Knowledge(5)));
        university.addStudent(new Student("Julia Veselkina", new Knowledge(3)));
        university.addStudent(new Student("Maria Perechrest", new Knowledge(5)));

        Internship internship = new Internship("CH.U.I. INTERNS", university);
        System.out.println("Intership: " + internship.getName());
        System.out.println("List of internship's students:");
        System.out.println(internship.getStudents());
    }
}
