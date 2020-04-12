package com.company.training.object;

public class StudentTestDrive {

	public static void main(String[] args) {

		int size = 10;

		Student[] students = new Student[size];

		int[] marks1 = { 4, 5, 8, 3, 7 };
		int[] marks2 = { 9, 9, 9, 8, 9 };
		int[] marks3 = { 4, 5, 8, 3, 7 };
		int[] marks4 = { 8, 8, 8, 8, 8 };
		int[] marks5 = { 4, 5, 8, 3, 7 };
		int[] marks6 = { 8, 9, 8, 8, 7 };
		int[] marks7 = { 4, 5, 8, 3, 7 };
		int[] marks8 = { 4, 5, 8, 3, 7 };
		int[] marks9 = { 4, 5, 8, 3, 7 };
		int[] marks10 = { 4, 5, 8, 3, 7 };

		Student st1 = new Student("Петров", "Иван", 9, marks1);
		Student st2 = new Student("Иванов", "Иван", 3, marks2);
		Student st3 = new Student("Сидоров", "Иван", 5, marks3);
		Student st4 = new Student("Елкин", "Иван", 5, marks4);
		Student st5 = new Student("Палкин", "Иван", 3, marks5);
		Student st6 = new Student("Васильев", "Иван", 1, marks6);
		Student st7 = new Student("Уткин", "Иван", 5, marks7);
		Student st8 = new Student("Пяткин", "Иван", 2, marks8);
		Student st9 = new Student("Голодный", "Иван", 8, marks9);
		Student st10 = new Student("Холодный", "Иван", 7, marks10);

		students[0] = st1;
		students[1] = st2;
		students[2] = st3;
		students[3] = st4;
		students[4] = st5;
		students[5] = st6;
		students[6] = st7;
		students[7] = st8;
		students[8] = st9;
		students[9] = st10;

		Student[] bestGroup = findBestStudents(students);

		printStudent(bestGroup);

	}

	public static boolean isExcellentMark(int[] marks) {

		for (int mark : marks) {
			if (mark < 8) {
				return false;
			}

		}
		return true;
	}

	public static Student[] findBestStudents(Student[] students) {

		Student[] bestStudents = new Student[students.length];

		int i = 0;

		for (Student student : students) {
			if (isExcellentMark(student.getMarks())) {

				bestStudents[i] = student;
				i++;
			}
		}

		Student[] result = new Student[i];

		for (int j = 0; j < result.length; j++) {
			result[j] = bestStudents[j];
		}
		return result;
	}

	public static void printStudent(Student[] students) {
		for (Student st : students) {
			System.out.println("Фамилия отличника - " + st.getLastName() + " номер группы " + st.getGroupNumber());
		}
	}

}
