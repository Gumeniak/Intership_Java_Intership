package institution.interlink;


import institution.University;
import person.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс інтернатури
 */
public class Internship {

    private String name;

    private List<Student> interns = new ArrayList<>();
    private List<University> universities = new ArrayList<>();
    /**
     * один університет добавляєм в конструкторі
     *
     * @param university
     */
    public Internship(String name,University university) {
        this.name = name;
        universities.add(university);
    }

    /**
     * список університетів
     *
     * @param list
     */
    public Internship(String name,List<University> list) {
        this.name = name;
        universities = list;
    }

    /**
     * добавити 1 університет до існуючого списку
     *
     * @param university
     */
    public void addUniversity(University university) {
        universities.add(university);
    }

    /**
     * видалити 1 університет із існуючого списку
     *
     * @param university
     */
    public void removeUniversity(University university) {
        universities.remove(university);
    }

    public void setUniversities(List<University> universities) {
        this.universities = universities;
    }

    /**
     * вираховуємо середнє значення , потім формуємо список інтернів
     * для інтернатури конкретної, після цього формуємо рядок
     * в відповідь.
     *
     * @return ряд студентів
     */
    public String getStudents() {
        for (University university : universities) {
            List<Student> students = university.getStudents();
            //обраховуємо середнє значення в універі
            university.computeAverageKnowledge();
            for (Student student : students) {
                if (student.getKnowledge().getLevel() >= university.getAverageKnowledge()) {
                    interns.add(student);
                }
            }
        }
        StringBuilder internString = new StringBuilder();
        for (Student intern : interns) {
            internString.append(intern.getName()).append("\n");
        }
        return internString.toString();
    }


    public List<University> getUniversities() {
        return universities;
    }

    public String getName() {
        return name;
    }
}
