package com.grading;

public class ExamGrade {
    public static void main(String[] arg){
        /*Just checking with some randome value
        Actual test case is written on test case for multiple parameter
        */
        boolean res1 = gradeTestPassFail(80);
        System.out.println(res1);

        int res2 = gradeTestNumeric(93);
        System.out.println(res2);

        int res3 = gradeTestLetter(93);
        System.out.println(res3);
    }

    /*
    A score of 70 or higher is a passing score. Anything lower is a failing score.
    Returning true for a passing score and false for a failing score.

    Examples:
    gradeTestPassFail(90) ➔ true
    gradeTestPassFail(70) ➔ true
    gradeTestPassFail(45) ➔ false
     */
    public static boolean gradeTestPassFail(int score) {
        if(score >= 70){
            return true;
        }
        return false;
    }

    /*
    Implementing the logic to grade tests using this new scale:
        For a score of 90 or higher, return 3
        For a score of 50-89, return 2
        For a score of 25-49, return 1
        For a score of less than 25, return 0

    Examples:
    gradeTestNumeric(90) ➔ 3
    gradeTestNumeric(70) ➔ 2
    gradeTestNumeric(45) ➔ 1
    gradeTestNumeric(10) ➔ 0
     */
    public static int gradeTestNumeric(int score) {
        if(score>=90){
            return 3;
        }else if(score>=50 && score<=89){
            return 2;
        }else if(score>=25 && score<=49){
            return 1;
        }
        return 0;
    }

    /*
    Implementing the logic to grade tests using this new scale:
        For a score of 90 or higher, return 'A'
        For a score of 80-89, return 'B'
        For a score of 70-79, return 'C'
        For a score of 60-69, return 'D'
        For a score less than 60, return 'F'

    Examples:
    gradeTestLetter(90) ➔ 'A'
    gradeTestLetter(70) ➔ 'C'
    gradeTestLetter(45) ➔ 'F'
     */
    public static char gradeTestLetter(int score) {
        if(score>=90){
            return 'A';
        }else if(score>=80 && score<=89){
            return 'B';
        }else if(score>=70 && score<=79){
            return 'C';
        }else if(score>=60 && score<=69){
            return 'D';
        }else if(score<60){
            return 'F';
        }
        return ' ';
    }
}
