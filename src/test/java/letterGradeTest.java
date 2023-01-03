import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class letterGradeTest {

    @Test
    void letterGrade_equivalence() {
        assertEquals('X', letterGrade.letterGrade(-10));
        assertEquals('X', letterGrade.letterGrade(-1));
        assertEquals('F', letterGrade.letterGrade(0));
        assertEquals('F', letterGrade.letterGrade(50));
        assertEquals('D', letterGrade.letterGrade(60));
        assertEquals('D', letterGrade.letterGrade(69));
        assertEquals('C', letterGrade.letterGrade(70));
        assertEquals('C', letterGrade.letterGrade(79));
        assertEquals('B', letterGrade.letterGrade(80));
        assertEquals('B', letterGrade.letterGrade(89));
        assertEquals('A', letterGrade.letterGrade(90));
        assertEquals('A', letterGrade.letterGrade(95));
        assertEquals('A', letterGrade.letterGrade(100));
        assertEquals('X', letterGrade.letterGrade(101));
        assertEquals('X', letterGrade.letterGrade(1000));
    }

    @Test
    void letterGrade_boundary() {
        assertEquals('X', letterGrade.letterGrade(Integer.MIN_VALUE));
        assertEquals('X', letterGrade.letterGrade(Integer.MIN_VALUE + 1));
        assertEquals('X', letterGrade.letterGrade(-1));
        assertEquals('F', letterGrade.letterGrade(0));
        assertEquals('F', letterGrade.letterGrade(1));
        assertEquals('F', letterGrade.letterGrade(59));
        assertEquals('D', letterGrade.letterGrade(60));
        assertEquals('D', letterGrade.letterGrade(61));
        assertEquals('D', letterGrade.letterGrade(69));
        assertEquals('C', letterGrade.letterGrade(70));
        assertEquals('C', letterGrade.letterGrade(71));
        assertEquals('C', letterGrade.letterGrade(79));
        assertEquals('B', letterGrade.letterGrade(80));
        assertEquals('B', letterGrade.letterGrade(81));
        assertEquals('B', letterGrade.letterGrade(89));
        assertEquals('A', letterGrade.letterGrade(90));
        assertEquals('A', letterGrade.letterGrade(91));
        assertEquals('A', letterGrade.letterGrade(99));
        assertEquals('A', letterGrade.letterGrade(100));
        assertEquals('X', letterGrade.letterGrade(101));
        assertEquals('X', letterGrade.letterGrade(Integer.MAX_VALUE - 1));
        assertEquals('X', letterGrade.letterGrade(Integer.MAX_VALUE));
    }
}