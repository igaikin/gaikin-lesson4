package com.belhard.lesson4.classes.model.groups;

import com.belhard.lesson4.classes.model.entities.Cleaner;
import com.belhard.lesson4.classes.model.entities.Teacher;
import com.belhard.lesson4.util.DynamicArray;
import com.belhard.lesson4.util.MyCollection;

public class Chair {

    private String name;
    private Cleaner cleaner;
    private final MyCollection teachers;
    private static final int MAX_NUMBER_OF_TEACHERS = 10;
    public static final String NEW_LINE = System.lineSeparator();

    public Chair(String name) {
        this.name = name;
        teachers = new DynamicArray(MAX_NUMBER_OF_TEACHERS);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("* * * * * * * C H A I R * * * * * * * *").append(NEW_LINE)
                .append("\t\t").append(name).append(NEW_LINE).append(NEW_LINE);
        if (cleaner != null) {
            sb.append(cleaner).append(NEW_LINE).append(NEW_LINE);
        }
        int util = 1;
        for (int i = 0; i < teachers.toArray().length; i++) {
            if (teachers.toArray()[i] != null) {
                sb.append("\t").append(util).append(":  ").append(teachers.toArray()[i].toString()).append(NEW_LINE)
                        .append(NEW_LINE);
                util++;
            }
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cleaner getCleaner() {
        return cleaner;
    }

    public void setCleaner(Cleaner cleaner) {
        this.cleaner = cleaner;
    }

    public void removeCleaner() {
        cleaner = null;
    }
}
