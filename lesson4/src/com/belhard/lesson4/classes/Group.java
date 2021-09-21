package com.belhard.lesson4.classes;

public class Group {

	private String name;
	private Teacher teacher;
	private Student[] students = new Student[8];
	private int quantity;
	int sum = 0;
	int count = 0;

	@Override
	public String toString() {
		String str = "\t**********GROUP**********\n\t-----------" + name + "------------" + "\n\n";
		if (teacher != null) {
			str = str + teacher.toString() + "\n";
		}
		int util = 1;
		for (int i = 0; i < students.length; i++) {

			if (students[i] != null) {
				str = str + "\t" + util + ":  " + students[i].toString() + "\n";
				util++;
			} else if (students[i] == null) {
				str = str + "\t" + util + ":  " + "STUDENT IS NOT ASSIGNED" + "\n";
				util++;
			}

		}
		return str;
	}

	public boolean AddPerson(Student pers) {
		if (quantity < students.length) {
			for (int i = 0; i < students.length; i++) {
				if (students[i] == null) {
					students[i] = pers;
					quantity++;
					return true;
				}
			}
		}
		return false;
	}

	public boolean delPerson(long numberCard) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getNumberCard() == numberCard) {
				students[i] = null;
				quantity--;

			}
		}
		return false;

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

	public boolean removeTeacher(long numberCard) {
		if (teacher != null && teacher.getNumberCard() == numberCard) {
			teacher = null;
		}
		return false;
	}

}
