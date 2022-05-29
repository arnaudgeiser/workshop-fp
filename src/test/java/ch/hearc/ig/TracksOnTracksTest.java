package ch.hearc.ig;

import static ch.hearc.ig.TracksOnTracks.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import io.vavr.collection.List;
import io.vavr.collection.Stream;
import org.junit.jupiter.api.Test;

public class TracksOnTracksTest {
  @Test
  public void test1() {
    assertEquals(List.empty(), newList());
  }

  @Test
  public void test2() {
    assertEquals(List.of("JavaScript", "Java", "Lisp", "Clojure"),
        Stream.of("Clojure", "Lisp", "Java", "JavaScript").foldLeft(newList(), TracksOnTracks::addLanguage));
  }

  @Test
  public void test3() {
    assertEquals("Lisp", firstLanguage(List.of("Lisp", "Clojure")));
  }

  @Test
  public void test4() {
    assertEquals(List.of("Clojure"), removeLanguage(List.of("Lisp", "Clojure")));
  }

  @Test
  public void test5() {
    assertEquals(3, countLanguages(List.of("Pascal", "Java", "JavaScript")));
  }

  @Test
  public void test6() {
    assertEquals(3, learningList());
  }
}
