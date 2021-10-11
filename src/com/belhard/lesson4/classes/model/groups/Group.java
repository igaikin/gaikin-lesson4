package com.belhard.lesson4.classes.model.groups;

import com.belhard.lesson4.classes.model.entities.Student;
import com.belhard.lesson4.classes.model.entities.Teacher;
import com.belhard.lesson4.util.DynamicArray;
import com.belhard.lesson4.util.MyCollection;

public class Group {

    private String name;
    private static Teacher teacher;
    private MyCollection students;

    public Group(String name) {
        this.name = name;
        students = new DynamicArray();
    }

    @Override
    public String toString() {
        String str = "\t******* G R O U P *******\n\t-----------" + getName() + "------------\n\n";
        if (teacher != null) {
            str = str + teacher + "\n";
        }
        int util = 1;
        for (int i = 0; i < students.toArray().length; i++) {

            if (students.toArray()[i] != null) {
                str = str + "\t" + util + ":  " + students.toArray()[i].toString() + "\n";
                util++;
            } else if (students.toArray()[i] == null) {
                str = str + "\t" + util + ":  " + "STUDENT IS NOT ASSIGNED" + "\n";
                util++;
            }

        }
        return str;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
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
        Group.teacher = teacher;
    }

    public boolean removeTeacher(long id) {
        if (teacher != null && teacher.getId() == id) {
            teacher = null;
        }
        return false;
    }

}