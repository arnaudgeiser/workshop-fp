package ch.hearc.ig;

import io.vavr.collection.List;

public class Movies {
  record Movie(String title, String author, List<Comment> comments) {}
  record Comment(long peopleId, long grade) {}
  record CommentByMovie(Movie movie, String title, long grade) {}
  record Person(long id, String name, int age) {}

  static Person findByPersonId(List<Person> people, long id) {
    return people.find(p -> p.id == id).get();
  }

  static List<String> moviesTitles(List<Movie> movies) {
    return movies.map(m -> m.title);
  }

  static List<Person> peopleYoungerThan30(List<Person> people) {
    return people.filter(p -> p.age < 30);
  }

  static List<Person> peopleYoungerThan30StartWithA(List<Person> people) {
    return people.filter(p -> p.age < 30).filter(p -> p.name.charAt(0) == 'A');
  }

  /**
   * Return the people acronyms Example :["Ar","Xa","Da"]
   */
  static List<String> peopleAcronyms(List<Person> people) {
    return people.map(p -> p.name.substring(0 ,2));
  }

  /**
   * Return the people acronyms Example :["DA","DA"]
   */
  static List<String> peopleAcronymsUppercaseStartWithD(List<Person> people) {
    return people.filter(p -> 'D' == p.name.charAt(0)).map(p -> p.name.substring(0 ,2).toUpperCase());
  }

  static Number sumGrades(List<Movie> movies) {
    return movies.flatMap(m -> m.comments.map(c -> c.grade)).sum();
  }

  static List<CommentByMovie> commentByMovies(List<Movie> movies) {
    return movies.flatMap(m -> m.comments.map(c -> new CommentByMovie(m, m.title, c.grade)));
  }


}
