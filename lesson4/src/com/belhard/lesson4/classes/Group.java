package com.belhard.lesson4.classes;

public class Group {

	private String nameGroup;

	public String getName() {
		return nameGroup;
	}

	public void setName(String name) {
		this.nameGroup = name;
	}

	public String toString() {
		String str = "Group name '" + nameGroup + "'\n" + teacher.toString() + "\n";
		if (teacher != null) {
			str = str + "Teacher " + teacher.toString() + "\n";
		}

		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				str = str + (i + 1) + students[i].toString() + "\n";
			}
		}
		return str;
	}

	private Teacher teacher;

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public boolean removeTeacher(long id) {
		if (teacher.getId() == id) {
			teacher = null;
			return true;
		}
		return false;
	}

	private Student[] students = new Student[8];
	private int numberOfStudents;

	public boolean addStudent(Student stud1) {
		if (numberOfStudents < students.length) {
			for (int i = 0; i < students.length; i++) {
				if (students[i] == null) {
					students[i] = stud1;
					numberOfStudents++;
					return true;
				}
			}
		}
		return false;
	}

	public boolean removeStudent(long id) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getId() == id) {
				students[i] = null;
				numberOfStudents--;
				return true;
			}
		}
		return false;
	}
}
