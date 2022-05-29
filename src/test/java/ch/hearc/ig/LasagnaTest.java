package ch.hearc.ig;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LasagnaTest {
  @Test
  public void test1() {
    assertEquals(40, Lasagna.expectedTime);
  }

  @Test
  public void test2() {
    assertEquals(10, Lasagna.remainingTime(30));
  }

  @Test
  public void test3() {
    assertEquals(4, Lasagna.prepTime(2));
  }

  @Test
  public void test4() {
    assertEquals(26, Lasagna.totalTime(3, 20));
  }

  @Test
  public void test5() {
    assertEquals(32, Lasagna.totalTime(1, 30));
  }

  @Test
  public void test6() {
    assertEquals(16, Lasagna.totalTime(4, 8));
  }
}
