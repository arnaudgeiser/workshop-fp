package ch.hearc.ig;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.vavr.collection.List;
import org.junit.jupiter.api.Test;

public class ArmstrongTest {
  @Test
  public void test1() {
    assertTrue(Armstrong.isArmstrong(0));
  }

  @Test
  public void test2() {
    assertTrue(Armstrong.isArmstrong(5));
  }

  @Test
  public void test3() {
    assertFalse(Armstrong.isArmstrong(10));
  }

  @Test
  public void test4() {
    assertTrue(Armstrong.isArmstrong(9926315));
  }

  @Test
  public void test5() {
    assertFalse(Armstrong.isArmstrong(9926316));
  }
}
