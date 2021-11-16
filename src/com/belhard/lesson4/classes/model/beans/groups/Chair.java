package com.belhard.lesson4.classes.model.beans.groups;

import com.belhard.lesson4.classes.model.beans.entities.Cleaner;
import com.belhard.lesson4.classes.model.beans.entities.Teacher;
import com.belhard.lesson4.util.DynamicArray;
import com.belhard.lesson4.util.MyCollection;
import lombok.Data;

@Data
public class Chair {

    private String name;
    private Cleaner cleaner;
    private final MyCollection teachers;
    private static final int MAX_NUMBER_OF_TEACHERS = 10;
    private static final String NEW_LINE = System.lineSeparator();

    public Chair(String name) {
        this.name = name;
        teachers = new DynamicArray(MAX_NUMBER_OF_TEACHERS);
    }

    public Object[] getTeachers() {
        return teachers.toArray();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("* * * * * * * C H A I R * * * * * * * *").append(NEW_LINE)
                .append("\t\t").append(name).append(NEW_LINE).append(NEW_LINE);
        if (cleaner != null) {
            sb.append(cleaner).append(NEW_LINE).append(NEW_LINE);
        }
        Object[] teachers = this.teachers.toArray();
        for (int i = 0; i < teachers.length; i++) {
                sb.append("\t")
                        .append(i + 1)
                        .append(":  ")
                        .append(teachers[i].toString())
                        .append(NEW_LINE)
                        .append(NEW_LINE);
        }
        return sb.toString();
    }

    public boolean addTeacher(Teacher teacher) {
        if (teachers.size() >= MAX_NUMBER_OF_TEACHERS) {
            return false;
        } else {
            teachers.add(teacher);
            return true;
        }
    }

    public boolean removeTeacher(Teacher teacher) {
        return teachers.remove(teacher);
    }

    public void removeCleaner() {
        cleaner = null;
    }
}
