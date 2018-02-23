package practicalfour;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import practicalfour.repeat.AppendRepeater;
import practicalfour.repeat.IterativeRepeater;

/**
 * A JUnit test suite for the two Repeaters.
 *
 * @author Gregory M. Kapfhammer
 */

public class TestRepeaters {

  @Test
  public void testIterativeRepeaterSmallAlphabet() {
    IterativeRepeater repeater = new IterativeRepeater();
    String result = repeater.repeat('C', 10);
    assertEquals(result.length(), 10);
    assertTrue(result.contains("C"));
  }

  @Test
  public void testIterativeRepeaterMediumSymbol() {
    IterativeRepeater repeater = new IterativeRepeater();
    String result = repeater.repeat('%', 100);
    assertEquals(result.length(), 100);
    assertTrue(result.contains("%"));
  }

  @Test
  public void testAppendRepeaterSmallAlphabet() {
    AppendRepeater repeater = new AppendRepeater();
    String result = repeater.repeat('C', 10);
    assertEquals(result.length(), 10);
    assertTrue(result.contains("C"));
  }

  @Test
  public void testAppendRepeaterMediumSymbol() {
    AppendRepeater repeater = new AppendRepeater();
    String result = repeater.repeat('%', 100);
    assertEquals(result.length(), 100);
    assertTrue(result.contains("%"));
  }

}
