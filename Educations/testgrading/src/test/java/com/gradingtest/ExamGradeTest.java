package com.gradingtest;

import com.grading.ExamGrade;
import org.junit.*;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ExamGradeTest {
    @Test
    public void ExamGrade_gradeTest_1() {
        ExamGrade exercise = new ExamGrade();
        assertTrue("gradeTestPassFail(100) should return true", exercise.gradeTestPassFail(100));
        assertTrue("gradeTestPassFail(90) should return true", exercise.gradeTestPassFail(90));
        assertTrue("gradeTestPassFail(70) should return true", exercise.gradeTestPassFail(70));
        assertFalse("gradeTestPassFail(69) should return false", exercise.gradeTestPassFail(69));
        assertFalse("gradeTestPassFail(60) should return false", exercise.gradeTestPassFail(60));
        assertFalse("gradeTestPassFail(0) should return false", exercise.gradeTestPassFail(0));
    }

    @Test
    public void ExamGrade_gradeTest_2() {
        ExamGrade exercise = new ExamGrade();
        assertEquals("gradeTestNumeric(100) should return 3", 3, exercise.gradeTestNumeric(100));
        assertEquals("gradeTestNumeric(95) should return 3", 3, exercise.gradeTestNumeric(95));
        assertEquals("gradeTestNumeric(90) should return 3", 3, exercise.gradeTestNumeric(90));
        assertEquals("gradeTestNumeric(89) should return 2", 2, exercise.gradeTestNumeric(89));
        assertEquals("gradeTestNumeric(70) should return 2", 2, exercise.gradeTestNumeric(70));
        assertEquals("gradeTestNumeric(50) should return 2", 2, exercise.gradeTestNumeric(50));
        assertEquals("gradeTestNumeric(49) should return 1", 1, exercise.gradeTestNumeric(49));
        assertEquals("gradeTestNumeric(37) should return 1", 1, exercise.gradeTestNumeric(37));
        assertEquals("gradeTestNumeric(25) should return 1", 1, exercise.gradeTestNumeric(25));
        assertEquals("gradeTestNumeric(24) should return 0", 0, exercise.gradeTestNumeric(24));
        assertEquals("gradeTestNumeric(12) should return 0", 0, exercise.gradeTestNumeric(12));
        assertEquals("gradeTestNumeric(1) should return 0", 0, exercise.gradeTestNumeric(1));
        assertEquals("gradeTestNumeric(0) should return 0", 0, exercise.gradeTestNumeric(0));
    }

    @Test
    public void ExamGrade_gradeTest_3() {
        ExamGrade exercise = new ExamGrade();
        assertEquals("gradeTestLetter(100) should return A", 'A', exercise.gradeTestLetter(100));
        assertEquals("gradeTestLetter(95) should return A", 'A', exercise.gradeTestLetter(95));
        assertEquals("gradeTestLetter(90) should return A", 'A', exercise.gradeTestLetter(90));
        assertEquals("gradeTestLetter(89) should return B", 'B', exercise.gradeTestLetter(89));
        assertEquals("gradeTestLetter(85) should return B", 'B', exercise.gradeTestLetter(85));
        assertEquals("gradeTestLetter(80) should return B", 'B', exercise.gradeTestLetter(80));
        assertEquals("gradeTestLetter(79) should return C", 'C', exercise.gradeTestLetter(79));
        assertEquals("gradeTestLetter(74) should return C", 'C', exercise.gradeTestLetter(74));
        assertEquals("gradeTestLetter(70) should return C", 'C', exercise.gradeTestLetter(70));
        assertEquals("gradeTestLetter(69) should return D", 'D', exercise.gradeTestLetter(69));
        assertEquals("gradeTestLetter(65) should return D", 'D', exercise.gradeTestLetter(65));
        assertEquals("gradeTestLetter(60) should return D", 'D', exercise.gradeTestLetter(60));
        assertEquals("gradeTestLetter(59) should return F", 'F', exercise.gradeTestLetter(59));
        assertEquals("gradeTestLetter(39) should return F", 'F', exercise.gradeTestLetter(39));
        assertEquals("gradeTestLetter(25) should return F", 'F', exercise.gradeTestLetter(25));
        assertEquals("gradeTestLetter(1) should return F", 'F', exercise.gradeTestLetter(1));
        assertEquals("gradeTestLetter(0) should return F", 'F', exercise.gradeTestLetter(0));
    }
}
