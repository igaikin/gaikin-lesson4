package com.belhard.lesson4.classes.model.beans.groups;

import com.belhard.lesson4.classes.model.beans.entities.Student;
import com.belhard.lesson4.classes.model.beans.entities.Teacher;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Group {
    private long id;
    private String name;
    private Teacher teacher;
    private final List<Student> students = new ArrayList<>();
    private int maxNumberOfStudents = 8;
    private static final String NEW_LINE = System.lineSeparator();

    public String getFormattedOutput() {
        StringBuilder sb = new StringBuilder("* * * * * * * G R O U P * * * * * * *" + NEW_LINE)
                .append("\t\t---------")
                .append(getName())
                .append("----------")
                .append(NEW_LINE);
        if (teacher != null) {
            sb.append(teacher.getFirstName())
                    .append(" ")
                    .append(teacher.getLastName())
                    .append(NEW_LINE);
        }
        for (int i = 0; i < students.size(); i++) {
            sb.append("\t")
                    .append(i + 1)
                    .append(":  ")
                    .append(students.get(i).getFirstName())
                    .append(" ")
                    .append(students.get(i).getLastName())
                    .append(NEW_LINE);
        }
        return sb.toString();
    }

    public boolean addStudent(Student student) {
        if (students.size() >= maxNumberOfStudents) {
            return false;
        } else {
            students.add(student);
            return true;
        }
    }

    public boolean removeStudent(Student student) {
        return students.remove(student);
    }

    public void removeTeacher() {
        teacher = null;
    }
}
