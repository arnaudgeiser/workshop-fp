package ch.hearc.ig;

import io.vavr.collection.List;

public class TracksOnTracks {
  public static List<String> newList() {
    return List.empty();
  }

  public static List<String> addLanguage(List<String> languages, String language) {
    return languages.prepend(language);
  }

  public static String firstLanguage(List<String> languages) {
    return languages.get(0);
  }

  public static List<String> removeLanguage(List<String> languages) {
    return languages.subSequence(1);
  }

  public static int countLanguages(List<String> languages) {
    return languages.length();
  }

  public static int learningList() {
    return countLanguages(addLanguage(addLanguage(removeLanguage(addLanguage(addLanguage(newList(), "Lisp"), "Clojure")), "Java"), "Javascript"));
  }
}
