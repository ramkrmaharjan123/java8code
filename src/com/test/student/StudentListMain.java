package com.test.student;

import java.util.Arrays;
import java.util.List;

import com.test.apple.ApplePredicate;

public class StudentListMain {

	public static void main(String[] args) {

		StudentListMain m = new StudentListMain();

		List<Student> studentList = Arrays.asList(
				new Student("X", "Z", 10, "Five"),
				new Student("C", "D", 12, "Seven"),
				new Student("D", "C", 8, "Three"));

		studentList.sort((Student a1, Student a2) -> a1.getLastName().compareTo(a2.getLastName()));

		m.printStudent(studentList, (Student s) -> s.getAge() > 9);
	}

	public interface Predicate<T> {
		boolean test(T t);
	}

	public void printStudent(List<Student> studentList, StudentPredicate<Student> p) {
		for (Student s : studentList) {
			if (p.test(s)) {
				System.out.println(s);
			}
		}
	}

}
