package ch.hearc.ig;

import io.vavr.Function1;
import io.vavr.collection.List;

public class Strain {
  public static List<Integer> retain(Function1<Integer, Boolean> predicate, List<Integer> list) {
    return list.foldLeft(List.empty(), (acc, v) -> predicate.apply(v) ? acc.append(v) : acc);
  }

  public static List<Integer> discard(Function1<Integer, Boolean> predicate, List<Integer> list) {
    return list.foldLeft(List.empty(), (acc, v) -> predicate.apply(v) ? acc : acc.append(v));
  }
}
