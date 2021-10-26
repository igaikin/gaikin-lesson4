package com.belhard.lesson4.classes.model.groups;

import com.belhard.lesson4.classes.model.entities.Student;
import com.belhard.lesson4.classes.model.entities.Teacher;
import com.belhard.lesson4.util.DynamicArray;
import com.belhard.lesson4.util.MyCollection;

public class Group {
    private String name;
    private Teacher teacher;
    private final MyCollection students;
    private static final int MAX_NUMBER_OF_STUDENTS = 8;
    public static final String NEW_LINE = System.lineSeparator();

    public Group(String name) {
        this.name = name;
        students = new DynamicArray(MAX_NUMBER_OF_STUDENTS);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("* * * * * * * G R O U P * * * * * * *" + NEW_LINE)
                .append("\t\t---------").append(getName()).append("----------").append(NEW_LINE).append(NEW_LINE);
        if (teacher != null) {
            sb.append(teacher).append(NEW_LINE);
        }
        int util = 1;
        for (int i = 0; i < students.toArray().length; i++) {
            if (students.toArray()[i] != null) {
                sb.append("\t").append(util).append(":  ").append(students.toArray()[i].toString()).append(NEW_LINE);
                util++;
            }
        }
        return sb.toString();
    }

    public boolean addStudent(Student student) {
        if (students.size() >= MAX_NUMBER_OF_STUDENTS) {
            return false;
        } else {
            students.add(student);
            return true;
        }
    }

    public boolean removeStudent(Student student) {
        return students.remove(student);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void removeTeacher() {
        teacher = null;
    }
}
