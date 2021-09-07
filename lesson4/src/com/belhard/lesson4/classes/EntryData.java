package com.belhard.lesson4.classes;

public class EntryData {

	public static void main(String[] args) {
		Teacher teacher = new Teacher("Kevin", "Bright");

		teacher.setPost("Producing");
		teacher.setAge(66);
		teacher.setAcademicDegree("Docent");
		teacher.setFaculty("Cinema");

		Student student1 = new Student("Jennifer", "Aniston", 1);
		Student student2 = new Student("Courteney", "Cox", 1);
		Student student3 = new Student("Lisa", "Kudrow", 1);
		Student student4 = new Student("Matt", "LeBlanc", 2);
		Student student5 = new Student("Matthew", "Perry", 2);
		Student student6 = new Student("David", "Schwimmer", 2);
		Student student7 = new Student("James Michael", "Tyler", 3);
		Student student8 = new Student("Elliott", "Gould", 3);

		Cleaner cleaner = new Cleaner("j", "k", 205);

		Group group = new Group();
		group.setTeacher(teacher);
		group.addStudent(student1);
		group.addStudent(student2);
		group.addStudent(student3);
		group.addStudent(student4);
		group.addStudent(student5);
		group.addStudent(student6);
		group.addStudent(student7);
		group.addStudent(student8);
		group.setName("Friends");
		System.out.println(group);
	}
}
