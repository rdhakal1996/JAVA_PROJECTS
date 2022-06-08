package com.grading;

public class MainMethod {
    public static void main(String[] arg){
        /*Just checking with some randome value
        Actual test case is written on test case for multiple parameter
        */
        ExamGrade exercise= new ExamGrade();
        boolean res1 = exercise.gradeTestPassFail(80);
        System.out.println(res1);

        int res2 = exercise.gradeTestNumeric(93);
        System.out.println(res2);

        int res3 = exercise.gradeTestLetter(93);
        System.out.println(res3);
    }
}
