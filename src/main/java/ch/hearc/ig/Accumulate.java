package ch.hearc.ig;

import io.vavr.Function1;
import io.vavr.collection.List;

public class Accumulate {
  public static List<Integer> accumulate(Function1<Integer, Integer> op, List<Integer> list) {
    return list.foldLeft(List.empty(), (acc, v) -> acc.append(op.apply(v)));
  }

}
