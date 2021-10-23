package com.belhard.lesson4.classes.model.groups;

import com.belhard.lesson4.classes.model.entities.Student;
import com.belhard.lesson4.classes.model.entities.Teacher;
import com.belhard.lesson4.util.DynamicArray;
import com.belhard.lesson4.util.MyCollection;

public class Group {
    private String name;
    private Teacher teacher;
    private final MyCollection students;

    public Group(String name) {
        this.name = name;
        students = new DynamicArray();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("\t******* G R O U P *******\n\t-----------" + getName() + "------------\n\n");
        if (teacher != null) {
            sb.append(teacher).append("\n");
        }
        int util = 1;
        for (int i = 0; i < students.toArray().length; i++) {
            if (students.toArray()[i] != null) {
                sb.append("\t").append(util).append(":  ").append(students.toArray()[i].toString()).append("\n");
                util++;
            }
        }
        return sb.toString();
    }

    public void addStudent(Student student) {//FIXME boolean , capacity
        students.add(student);
    }

    public void removeStudent(Student student) { //FIXME boolean
        students.remove(student);
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

    public boolean removeTeacher(long id) {
        if (teacher != null && teacher.getId() == id) {
            teacher = null;
        }
        return false;
    }

}
