import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class letterGradeTest {

    @Test
    void letterGrade_equivalence() {
        assertEquals('X', letterGrade.letterGrade(-5));
        assertEquals('F', letterGrade.letterGrade(45));
        assertEquals('D', letterGrade.letterGrade(68));
        assertEquals('C', letterGrade.letterGrade(72));
        assertEquals('B', letterGrade.letterGrade(86));
        assertEquals('A', letterGrade.letterGrade(94));
        assertEquals('X', letterGrade.letterGrade(130));
    }

    @Test
    void letterGrade_boundary() {
        assertEquals('X', letterGrade.letterGrade(-1));
        assertEquals('F', letterGrade.letterGrade(0));
        assertEquals('F', letterGrade.letterGrade(59));
        assertEquals('D', letterGrade.letterGrade(60));
        assertEquals('D', letterGrade.letterGrade(69));
        assertEquals('C', letterGrade.letterGrade(70));
        assertEquals('C', letterGrade.letterGrade(79));
        assertEquals('B', letterGrade.letterGrade(80));
        assertEquals('B', letterGrade.letterGrade(89));
        assertEquals('A', letterGrade.letterGrade(90));
        assertEquals('A', letterGrade.letterGrade(100));
        assertEquals('X', letterGrade.letterGrade(101));
    }
}