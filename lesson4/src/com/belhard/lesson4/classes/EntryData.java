package com.belhard.lesson4.classes;

public class EntryData {

	public static void main(String[] args) {
		Teacher teacher = new Teacher("Kevin", "Bright");
		teacher.setDepartment("Friends");
		teacher.setPost("Executive producer");
		teacher.setAge(66);
		teacher.setAcademicDegree("Docent");
		teacher.setFaculty("Cinema");

		Student student1 = new Student("Jennifer", "Aniston");
		Student student2 = new Student("Courteney", "Cox");
		Student student3 = new Student("Lisa", "Kudrow");
		Student student4 = new Student("Matt", "LeBlanc");
		Student student5 = new Student("Matthew", "Perry");
		Student student6 = new Student("David", "Schwimmer");
		Student student7 = new Student("James Michael", "Tyler");
		Student student8 = new Student("Elliott", "Gould");

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
