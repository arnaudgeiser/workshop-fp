package ch.hearc.ig;

import io.vavr.collection.CharSeq;
import io.vavr.collection.List;
import io.vavr.collection.Stream;
import java.util.Objects;

public class Armstrong {
  public static boolean isArmstrong(long nb) {
    String str = String.valueOf(nb);
    return nb == List.of(String.valueOf(nb).toCharArray())
        .toCharSeq()
        .foldLeft(0L, (acc, v) -> acc + Stream.continually(v).take(str.length()).foldLeft(1L, (acc2, v2) -> acc2 * Character.digit(v2, 10)));
  }

  public static void main(String[] args) {
    System.out.println(isArmstrong(0));
    System.out.println(isArmstrong(21897142587612075L));
  }
}
