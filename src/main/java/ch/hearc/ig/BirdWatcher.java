package ch.hearc.ig;

import io.vavr.collection.List;

public class BirdWatcher {

  public static boolean isOddWeek(List<Integer> birds) {
    return birds.sliding(2,2)
        .forAll(e -> e.equals(List.of(0,1)) || e.equals(List.of(0)) || e.equals(List.of(1)));
  }

  public static int today(List<Integer> birds) {
    return birds.last();
  }

  public static List<Integer> incBird(List<Integer> birds) {
    return birds.dropRight(1).append(birds.last()+1);
  }

  public static boolean isDayWithoutBirds(List<Integer> birds) {
    return birds.exists(e -> e == 0);
  }

  public static Number countBirdsInDays(List<Integer> birds, int days) {
    return birds.take(days).sum();
  }

  public static int busyDays(List<Integer> birds) {
    return birds.count(e -> e >= 5);
  }
}

