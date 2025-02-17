package studentgrade;
//
//
//import junit.framework.TestCase;
//
///* JUnit 3.8.1 */
//public class StudentGradeTest extends TestCase {
//    
//    public StudentGradeTest(String testName) {
//        super(testName);
//    }
//
//    public void testGetGrade95() {
//        System.out.println("getGrade 95");
//        int mark = 95;
//        String expResult = "A";
//        String result = StudentGrade.getGrade(mark);
//        assertEquals(expResult, result);
//    }
//
//    public void testGetGrade85() {
//        System.out.println("getGrade 85");
//        int mark = 85;
//        String expResult = "B";
//        String result = StudentGrade.getGrade(mark);
//        assertEquals(expResult, result);
//    }
//    
//    public void testGetGrade75() {
//        System.out.println("getGrade 85");
//        int mark = 75;
//        String expResult = "F";
//        String result = StudentGrade.getGrade(mark);
//        assertEquals(expResult, result);
//    }
//}
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StudentGradeTest {

    @Test
    public void testGetGrade95() {
        System.out.println("getGrade 95");
        int mark = 95;
        String expResult = "A";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetGrade85() {
        System.out.println("getGrade 85");
        int mark = 85;
        String expResult = "B";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetGrade75() {
        System.out.println("getGrade 75");
        int mark = 75;
        String expResult = "C";  // Assuming 75 corresponds to "C"
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);
    }
}
