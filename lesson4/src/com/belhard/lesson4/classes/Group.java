package com.belhard.lesson4.classes;

public class Group {

	public int numberGroup nGroup=new numberGroup;

	public int getNumberGroup() {
		return numberGroup;
	}

	public void setNumberGroup(int Group) {
		this.Group = Group;
	}

	private Teacher;
	private Student[] students = new Student[8];
	private int numberOfStudents;

	public String toString() {
		String str = "Group number '" + numberGroup + "'\n Teacher: " + teacher.toString() + "\n";
		if (teacher != null) {
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
			if (students[i] != null && students[i].getId() == id) {
				students[i] = null;
				numberOfStudents--;
				return true;
			}
		}
		return false;

	}

	public boolean addTeacher(Teacher teach) {
		if (teacher) {
			{
				if (teacher == null) {
					teacher = teach;

					return true;
				}
			}

		}
		return false;
	}

	public boolean removeTeacher(long id) {

		if (teacher.getId() == id) {
			teacher = null;

			return true;

		}
		return false;
	}

	public int getNumber() {
		return nGroup;
	}

	public void setNumber(int number) {
		this.nGroup = number;
	}

	public Teacher[] getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

}
