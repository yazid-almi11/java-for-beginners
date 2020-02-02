import com.synotis.interview.Animal;
import com.synotis.interview.Bird;
import com.synotis.interview.Fish;
import com.synotis.interview.Interview;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class InterviewTest {


    @Test
    public void testUpperCase() {
        Interview interview = new Interview();
        String upperString = interview.upper("talend");

        assertEquals("TALEND", upperString);
    }


    @Test
    public void testLowerCase() {
        Interview interview = new Interview();
        String upperString = interview.lower("TALEND");

        assertEquals("talend", upperString);
    }


    @Test
    public void testReplace() {
        Interview interview = new Interview();
        String replaceString = interview.replace("synotis migre vers la version 7");

        assertEquals("talend migre vers la version 7", replaceString);
    }


    @Test
    public void testReplace2() {
        Interview interview = new Interview();
        String replaceString = interview.replace2("toto");

        assertEquals("tata", replaceString);
    }


    /**
     * à l'aide un StringBuilder
     */
    @Test
    public void testReverse1() {
        Interview interview = new Interview();
        String reverseString = interview.reverse1("talend");
        assertEquals("dnelat", reverseString);
    }


    /**
     * à l'aide d'un tableau
     */
    @Test
    public void testReverse2() {
        Interview interview = new Interview();
        String reverseString = interview.reverse2("talend");
        assertEquals("dnelat", reverseString);
    }


    @Test
    public void testList() {
        Interview interview = new Interview();
        List<String> list = interview.createList("Synotis", "Xavier", "Talend");
        assertEquals("[Synotis,Xavier,Talend]", list.toString());
    }


    @Test
    public void testConvertStrinToInteger() {
        Interview interview = new Interview();
        Integer integer = interview.convertStringToInteger("666");
        assertEquals(new Integer(666), integer);
    }

    @Test
    public void testDateFormat() {
        Interview interview = new Interview();
        String formattedDate = interview.getFormattedDate("1999-02-02");
        assertEquals(formattedDate, "02-02-1999");
    }


    @Test
    public void testContainInList() {
        Interview interview = new Interview();
        List<String> list = null;
        boolean b = interview.containTalendInList(list);
        assertTrue(b);

    }


    @Test
    public void testAnimalMoves() {
        Animal animal = new Bird();
        assertEquals("fly", animal.move());
        Animal animal1 = new Fish();
        assertEquals("swim", animal.move());

    }

    @Test
    public void testMap() {
        Interview interview = new Interview();
        Map<Integer, String> map = interview.createMap("Patoche", "Seb");

        assertEquals(map.get(1), "Patoche");
        assertEquals(map.get(2), "Seb");


    }

    @Test
    public void add() {
        int a = 4;
        int b = 5;
        Interview interview = new Interview();
        BigDecimal result = interview.add(a, b);
        assertEquals(BigDecimal.valueOf(9), result);

    }

}
