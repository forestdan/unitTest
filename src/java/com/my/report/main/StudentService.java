package com.my.report.main;

import com.my.report.entity.Student;

import java.util.Comparator;
import java.util.List;

public class StudentService {

    public void orderByAge(List<Student> studentList) {
        studentList.sort(Comparator.comparingInt(Student::getAge));
    }

    public long countBetweenGrade(List<Student> studentList, int start, int end) {
        return studentList.stream()
                .filter(o1 -> o1.getGrade() >= start && o1.getGrade() <= end)
                .count();
    }
}
