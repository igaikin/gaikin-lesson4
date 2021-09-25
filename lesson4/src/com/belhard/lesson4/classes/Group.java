package com.belhard.lesson4.classes;

public class Group implements Identifiable {

	private String name;
	private static Teacher teacher;
	private MyCollection students;
	private long id;
	int sum = 0;
	int count = 0;
	float result;

	public Group(String name, int i) {
		this.name = name;
		id = (long) (Math.random() * Long.MAX_VALUE);
		students = new DynamicArray();
	}

	@Override
	public String toString() {
		String str = "\t******* G R O U P *******\n\t-----------" + name + "------------" + "\n\n";
		if (teacher != null) {
			str = str + teacher.toString() + "\n";
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

	public boolean delTeacher(long numberCard) {
		if (teacher != null && teacher.getId() == numberCard) {
			teacher = null;
		}
		return false;
	}

	public long getID() {
		return id;
	}

	@Override
	public long getId() {
		return 0;
	}

}
