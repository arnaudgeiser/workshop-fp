package ch.hearc.ig;

import static ch.hearc.ig.BirdWatcher.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.vavr.collection.List;
import org.junit.jupiter.api.Test;

public class BirdWatcherTest {

  @Test
  public void test1() {
    assertEquals(0, BirdWatcher.today(List.of(0,2,5,3,7,8,0)));
  }

  @Test
  public void test2() {
    assertEquals(10, BirdWatcher.today(List.of(0,2,5,3,7,8,10)));
  }

  @Test
  public void test3() {
    assertEquals(List.of(0,2,5,3,7,8,1), BirdWatcher.incBird(List.of(0,2,5,3,7,8,0)));
  }

  @Test
  public void test4() {
    assertEquals(List.of(0,2,5,3,7,8,8), BirdWatcher.incBird(List.of(0,2,5,3,7,8,7)));
  }

  @Test
  public void test5() {
    assertTrue(isDayWithoutBirds(List.of(5, 2, 5, 0, 7, 8, 7)));
  }

  @Test
  public void test6() {
    assertFalse(isDayWithoutBirds(List.of(5, 2, 5, 5, 7, 8, 7)));
  }

  @Test
  public void test7() {
    assertEquals(1L, countBirdsInDays(List.of(0, 0, 1, 5, 7, 8, 7), 3));
  }

  @Test
  public void test8() {
    assertEquals(48L, countBirdsInDays(List.of(5,9,12,6,8,8,17), 6));
  }

  @Test
  public void test9() {
    assertEquals(0, busyDays(List.of(1,1,1,0,0,0)));
  }

  @Test
  public void test10() {
    assertEquals(5, busyDays(List.of(4,9,5,7,8,8,2)));
  }

  @Test
  public void test11() {
    assertTrue(isOddWeek(List.of(0, 1, 0, 1, 0, 1, 0)));
  }

  @Test
  public void test12() {
    assertFalse(isOddWeek(List.of(2, 1, 0, 1, 0, 1, 0)));
  }
}
