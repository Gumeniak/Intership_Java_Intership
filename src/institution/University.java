package institution;
import person.Student;

import java.util.ArrayList;
import java.util.List;

public class University {

    private String name;

    private List<Student> students = new ArrayList<>();
    private int averageKnowledge = 0;

    public University(String name) {
        this.name = name;
    }

    /**
     *
     * @param student
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     * середнє значення знань по університеу
     *
     * @return середнє значення
     */
    public int computeAverageKnowledge() {
        if (students.size() == 0) {
            return 0;
        } else {
            for (Student studentInList : students) {
                averageKnowledge += studentInList.getKnowledge().getLevel();
            }
            averageKnowledge = averageKnowledge / students.size();
            return averageKnowledge;
        }
    }

    /**
     * звичайний геттер
     *
     * @return
     */
    public int getAverageKnowledge() {
        return averageKnowledge;
    }

    /**
     * отримати список студентів
     *
     * @return список студентів
     */
    public List<Student> getStudents() {
        return students;
    }

    public String getName() {
        return name;
    }
}
