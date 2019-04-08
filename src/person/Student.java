package person;

import person.consciousness.Knowledge;

public class Student {

    private String name;

    private Knowledge knowledge;

    /**
     * Constructor
     *
     * @param name      student's name
     * @param knowledge student's knowledge
     */
    public Student(String name, Knowledge knowledge) {
        this.name = name;
        this.knowledge = knowledge;
    }


    /**
     * отримуємо імя студента
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * getter for knowledge
     *
     * @return knowledge
     */
    public Knowledge getKnowledge() {
        return knowledge;
    }
}
