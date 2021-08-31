package com.belhard.lesson4.classes;

public class EntryData {

	public static void main(String[] args) {
		Teacher teacher = new Teacher("John", "Whane");
		teacher.setDepartment("Economics");
		teacher.setPost("Dean");

		Student student1 = new Student("Ivan", "Durak");
		Student student2 = new Student("John", "Fool");
		Student student3 = new Student("Alex", "Durak");

		Group group = new Group();
		group.setTeacher(teacher);
		group.addStudent(student1);
		group.addStudent(student2);
		group.addStudent(student3);
		group.setNumber(12);
		System.out.println(group);
	}
}
