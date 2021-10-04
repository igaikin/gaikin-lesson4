package com.belhard.lesson4.classes;

public class EntryData {

	public static void main(String[] args) {
		{
			Teacher teacher0 = new Teacher("Irod", "Great", 58, "Stuff Teacher", Teacher.AcademicDegree.DOCTOR,
					Employee.Post.HEAD_OF_DEPARTMENT, 75, "Establishing a regime", 13);
			Student students1 = new Student("Muamar", "Kadaffi", 22, 1, "Tyranny", 13);
			Student students2 = new Student("Usama", "benLaden", 20, 1, "Tyranny", 13);
			Student students3 = new Student("Adolf", "Hitler", 23, 1, "Tyranny", 13);
			Student students4 = new Student("Sadam", "Husein", 18, 1, "Tyranny", 13);
			Student students5 = new Student("Bashar", "Assad", 24, 1, "Tyranny", 13);
			Student students6 = new Student("Iddi", "Amin", 22, 1, "Tyranny", 13);
			Student students7 = new Student("Josef", "Stalin", 22, 1, "Tyranny", 13);
			Student students8 = new Student("Alesandro", "Shoushenk", 23, 1, "Tyranny", 13);

			Group group = new Group("EAR", 13);

			group.addStudent(students1);
			group.addStudent(students2);
			group.addStudent(students3);
			group.addStudent(students4);
			group.addStudent(students5);
			group.addStudent(students6);
			group.addStudent(students7);
			group.addStudent(students8);
			group.setTeacher(teacher0);
			group.setName("13");

			System.out.println(group.toString());
			System.out.println();

			Teacher teacher1 = new Teacher("Vladimir", "Lenin", 58, "Stuff Teacher", Teacher.AcademicDegree.DOCTOR,
					Employee.Post.DEPUTY, 150, "EAR", 0);
			Teacher teacher2 = new Teacher("Nikita", "Chruschev", 57, "Stuff Teacher", Teacher.AcademicDegree.DOCTOR,
					Employee.Post.DEPUTY, 160, "EAR", 0);
			Teacher teacher3 = new Teacher("Konstantin", "Chernenko", 56, "Stuff Teacher",
					Teacher.AcademicDegree.CANDIDATE, Employee.Post.TEACHER, 32, "EAR", 0);
			Teacher teacher4 = new Teacher("Georgiy", "Malenkov", 55, "Stuff Teacher", Teacher.AcademicDegree.PROFESSOR,
					Employee.Post.TEACHER, 140, "EAR", 0);
			Teacher teacher5 = new Teacher("Uriy", "Andropov", 54, "Stuff Teacher", Teacher.AcademicDegree.MASTER,
					Employee.Post.TEACHER, 160, "EAR", 0);
			Teacher teacher6 = new Teacher("Leonid", "Brezhnev", 53, "Stuff Teacher", Teacher.AcademicDegree.MASTER,
					Employee.Post.TEACHER, 150, "EAR", 0);
			Teacher teacher7 = new Teacher("Michail", "Gorbachev", 52, "Stuff Teacher",
					Teacher.AcademicDegree.ASSISTANT_PROFESSOR, Employee.Post.SENIOR_LECTURER, 140, "EAR", 0);
			Teacher teacher8 = new Teacher("Vladimir", "Putin", 51, "Stuff Teacher",
					Teacher.AcademicDegree.ASSISTANT_PROFESSOR, Employee.Post.SENIOR_LECTURER, 160, "EAR", 0);
			Teacher teacher9 = new Teacher("Dmitriy", "Medvedev", 50, "Stuff Teacher",
					Teacher.AcademicDegree.BACHELOR_OF_BUSINES_ADMINISTRATION, Employee.Post.ASSISTANT, 140, "EAR", 0);
			Cleaner cleaner = new Cleaner("Petr", "Poroshenko", 68, "Working stuff", Employee.Post.CLEANER, 160,
					"All rooms of Department Establishing a regime");

			Chair chair = new Chair("ESTABLISHING A REGIME");
			chair.setCleaner(cleaner);
			chair.addTeachers(teacher0);
			chair.addTeachers(teacher1);
			chair.addTeachers(teacher2);
			chair.addTeachers(teacher3);
			chair.addTeachers(teacher4);
			chair.addTeachers(teacher5);
			chair.addTeachers(teacher6);
			chair.addTeachers(teacher7);
			chair.addTeachers(teacher8);
			chair.addTeachers(teacher9);

//			AccountantUtil.increaseAcademicSalary(teacher0);
//			AccountantUtil.increaseAcademicSalary(teacher1);
//			AccountantUtil.increaseAcademicSalary(teacher2);
//			AccountantUtil.increaseAcademicSalary(teacher3);
//			AccountantUtil.increaseAcademicSalary(teacher4);
//			AccountantUtil.increaseAcademicSalary(teacher5);
//			AccountantUtil.increaseAcademicSalary(teacher6);
//			AccountantUtil.increaseAcademicSalary(teacher7);
//			AccountantUtil.increaseAcademicSalary(teacher8);
//			AccountantUtil.increaseAcademicSalary(teacher9);
			chair.setName("ESTABLISHING A REGIME");

			System.out.println(chair.toString());

		}
	}
}
