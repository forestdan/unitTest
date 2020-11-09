package com.my.report.main;

import com.my.report.entity.Worker;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class UnitTest1 {

    public static BigDecimal addSalaryForWorker(List<Worker> workerlist) {
        BigDecimal sum = new BigDecimal("0");
        for (Worker t : workerlist) {
            sum = sum.add(t.getSalary());
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Worker> workers = new ArrayList<>();
        workers.add(new Worker("John", new BigDecimal(5)));
        workers.add(new Worker("Marry", new BigDecimal(10)));
        workers.add(new Worker("David", new BigDecimal(15)));
        workers.add(new Worker("Tom", new BigDecimal(20)));

        BigDecimal sum = UnitTest1.addSalaryForWorker(workers);
        System.out.println("Want: " + new BigDecimal(50) + " Actually: " + sum.toString());
    }
}
