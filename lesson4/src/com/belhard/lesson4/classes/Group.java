package com.belhard.lesson4.classes;

public class Group {

	private int numberGroup;
	private Teacher[] teacher = new Teacher[1];
	private Student[] students = new Student[8];
	private int numberOfStudents;
	private int numberOfTeachers;

	public String toString() {
		String str = "Group number '" + numberGroup + "'\n Teacher: " + teacher.toString() + "\n";
		if (teacher[i] != null) {
			str = str + "Teacher " + teacher.toString + "\n";
		}

		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				str = str + (i + 1) + students[i].toString() + "\n";
			}
		}
		return str;
	}

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
			if (students[i].getId() == id) {
				students[i] = null;
				numberOfStudents--;
				return true;
			}
		}

	}

	public boolean addTeacher(Teacher teach1) {
		if (numberOfTeachers < teacher.length) {
			for (int i = 0; i < teacher.length; i++) {
				if (teacher[i] == null) {
					teacher[i] = teach1;
					numberOfTeachers++;
					return true;
				}
			}

		}
		return false;
	}

	public boolean removeTeacher(long id) {
		for (int i = 0; i < teacher.length; i++) {
			if (teacher[i].getId() == id) {
				teacher[i] = null;
				numberOfTeachers--;
				return true;
			}
		}
		return false;
	}

	public int getNumber() {
		return numberGroup;
	}

	public void setNumber(int number) {
		this.numberGroup = number;
	}

	public Teacher[] getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

}
