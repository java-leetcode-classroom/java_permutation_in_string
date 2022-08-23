import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  final private Solution sol = new Solution();
  @Test
  void checkInclusionExample1() {
    assertTrue(sol.checkInclusion("ab", "eidbaooo"));
  }
  @Test
  void checkInclusionExample2() {
    assertFalse(sol.checkInclusion("ab", "eidboaoo"));
  }
}