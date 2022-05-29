package ch.hearc.ig;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.vavr.collection.List;
import org.junit.jupiter.api.Test;

public class StrainTest {
  @Test
  public void test1() {
    assertEquals(List.of(2,4), Strain.retain(x -> x % 2 == 0, List.of(1,2,3,4)));
  }

  @Test
  public void test2() {
    assertEquals(List.of(1, 3), Strain.discard(x -> x % 2 == 0, List.of(1,2,3,4)));
  }
}
