package ch.hearc.ig;

import io.vavr.collection.CharSeq;
import io.vavr.collection.List;
import io.vavr.collection.Stream;
import java.util.Objects;

public class Armstrong {
  public static boolean isArmstrong(long nb) {
    String str = String.valueOf(nb);
    return nb == CharSeq.of(str)
        .foldLeft(0L, (acc, v) -> acc + (long)Math.pow(Character.digit(v, 10), str.length()));
  }

  public static void main(String[] args) {
    System.out.println(isArmstrong(0));
    System.out.println(isArmstrong(21897142587612075L));
  }
}
