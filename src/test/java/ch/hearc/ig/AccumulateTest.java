package ch.hearc.ig;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.vavr.collection.List;
import org.junit.jupiter.api.Test;

public class AccumulateTest {
  @Test
  public void test1() {
    assertEquals(List.of(2,4,6,8), Accumulate.accumulate(x -> x * 2, List.of(1,2,3,4)));
  }

  @Test
  public void test2() {
    assertEquals(List.of(3,6,9,12), Accumulate.accumulate(x -> x * 3, List.of(1,2,3,4)));
  }
}
