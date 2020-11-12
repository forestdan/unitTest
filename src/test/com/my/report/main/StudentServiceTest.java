package com.my.report.main;

import com.my.report.entity.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


class StudentServiceTest {

    static List<Student> TEST_CASE = new ArrayList<>();

    static List<Student> MODIFY_CASE_1 = new ArrayList<>();

    static List<Student> MODIFY_CASE_2 = new ArrayList<>();

    StudentService studentService = new StudentService();

    static {
        TEST_CASE.add(new Student("Tom", 18, 64));
        TEST_CASE.add(new Student("Marry", 20, 90));
        TEST_CASE.add(new Student("John", 21, 50));
        TEST_CASE.add(new Student("David", 17, 77));
        TEST_CASE.add(new Student("Amy", 19, 60));
        TEST_CASE.add(new Student("Lisa", 22, 83));

        MODIFY_CASE_1.add(new Student("David", 17, 77));
        MODIFY_CASE_1.add(new Student("Tom", 18, 64));
        MODIFY_CASE_1.add(new Student("Amy", 19, 60));
        MODIFY_CASE_1.add(new Student("Marry", 20, 90));
        MODIFY_CASE_1.add(new Student("John", 21, 50));
        MODIFY_CASE_1.add(new Student("Lisa", 22, 83));

        MODIFY_CASE_2.add(new Student("Marry", 20, 90));
        MODIFY_CASE_2.add(new Student("Lisa", 22, 83));
        MODIFY_CASE_2.add(new Student("David", 17, 77));
        MODIFY_CASE_2.add(new Student("Tom", 18, 64));
        MODIFY_CASE_2.add(new Student("Amy", 19, 60));
        MODIFY_CASE_2.add(new Student("John", 21, 50));

    }

    @Test
    void orderByAgeTest() {
        studentService.orderByAge(TEST_CASE);
        for (int i = 0; i < MODIFY_CASE_1.size(); i++) {
            if (!TEST_CASE.get(i).equalsTo(MODIFY_CASE_1.get(i))) {
                Assertions.assertNotSame(TEST_CASE, MODIFY_CASE_1);
                break;
            };
        }
    }

    @Test
    void countBetweenGradeTest() {
        long count = studentService.countBetweenGrade(TEST_CASE, 70, 100);
        Assertions.assertEquals(3, count);
    }

    @Test
    void orderByGradeTest() {
        studentService.orderByGrade(TEST_CASE);
        for (int i = 0; i < MODIFY_CASE_2.size(); i++) {
            if (!TEST_CASE.get(i).equalsTo(MODIFY_CASE_2.get(i))) {
                Assertions.assertNotSame(TEST_CASE, MODIFY_CASE_2);
                break;
            };
        }
    }
}