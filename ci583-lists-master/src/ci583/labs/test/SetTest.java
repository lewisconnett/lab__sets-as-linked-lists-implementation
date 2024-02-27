package ci583.labs.test;

import ci583.labs.lists.Set;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SetTest {
    @Test
    public void testDupes() {
        Set s = new Set();
        s.insert(1);
        s.insert(1);
        assertEquals(s.length(), 1);
    }
}
