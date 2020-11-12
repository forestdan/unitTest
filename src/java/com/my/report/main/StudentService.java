package com.my.report.main;

import com.my.report.entity.Student;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentService {

    public List<Student> orderByAge(List<Student> studentList) {
        studentList.sort(Comparator.comparingInt(Student::getAge));
        return studentList;
    }

    public long countBetweenGrade(List<Student> studentList, int start, int end) {
        return studentList.stream()
                .filter(o1 -> o1.getGrade() >= start && o1.getGrade() <= end)
                .count();
    }
}
