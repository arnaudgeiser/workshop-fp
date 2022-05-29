package ch.hearc.ig;

import static ch.hearc.ig.Movies.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

import io.vavr.collection.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class MoviesTest {

  static List<Person> people = List
      .of(new Person(1, "Arnaud", 29),
          new Person(2, "Xavier", 22),
          new Person(3, "Robert", 50),
          new Person(4, "Damien", 37),
          new Person(5, "Jerome", 90),
          new Person(6, "Dominique", 40));

  static List<Movie> movies = List
      .of(new Movie("Lord of the Rings", "Peter Jackson",
              List.of(new Comment(1, 5),
                  new Comment(2, 7),
                  new Comment(3, 4),
                  new Comment(4, 9))),
          new Movie("The Empire strikes back", "Steve Spielberg",
              List.of(new Comment(1, 2),
                  new Comment(2, 8),
                  new Comment(3, 10),
                  new Comment(4, 7))));

  @Test
  @Order(1)
  @DisplayName("I can get a person by his id")
  void testFindPersonById() {
    var result = findByPersonId(people, 1);
    assertThat(result.name()).isEqualTo("Arnaud");
  }

  @Test
  @Order(1)
  @DisplayName("I can get all the movies titles")
  void testMoviesTitles() {
    var result = moviesTitles(movies);
    assertThat(result.length()).isEqualTo(2);
  }

  @Test
  @Order(2)
  @DisplayName("I can get people younger than 30")
  void testPeopleYoungerThan30() {
    var result = peopleYoungerThan30(people);
    assertThat(result.size()).isEqualTo(2);
  }

  @Test
  @Order(2)
  @DisplayName("I can get people younger than 30 with name that starts with A")
  void testPeopleYoungerThan30StartA() {
    var result = peopleYoungerThan30StartWithA(people);
    assertThat(result.size()).isEqualTo(1);
  }

  @Test
  @Order(3)
  @DisplayName("I can get two letters acronyms")
  void testPeopleAcronyms() {
    var result = peopleAcronyms(people);
    assertThat(result.size()).isEqualTo(6);
    result.forEach(r -> assertThat(r.length()).isEqualTo(2));
  }

  @Test
  @Order(4)
  @DisplayName("I can get two letters acronyms in uppercase that starts with D")
  void testPeopleAcronymsUppercaseStartWithD() {
    var result = peopleAcronymsUppercaseStartWithD(people);
    assertThat(result.size()).isEqualTo(2);
    result.forEach(r -> {
      assertAll(() -> assertThat(r.length()).isEqualTo(2),
          () -> assertThat(r.charAt(0)).isEqualTo('D'),
          () -> assertThat(r.charAt(1)).isUpperCase());
    });
  }

  @Test
  @Order(5)
  @DisplayName("I can get all comments for each movie and people")
  void testCommentByMovies() {
    var result = commentByMovies(movies);
    assertThat(result.size()).isEqualTo(8);
  }

  @Test
  @Order(6)
  @DisplayName("I can sum all the grades")
  void testGrades() {
    var result = sumGrades(movies);
    assertThat(result).isEqualTo(52L);
  }
}
