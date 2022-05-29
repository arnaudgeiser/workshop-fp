package ch.hearc.ig;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ch.hearc.ig.ComplexNumbers.*;

import ch.hearc.ig.ComplexNumbers.ComplexNumber;
import org.junit.jupiter.api.Test;

public class ComplexNumbersTest {
  @Test
  public void test1() {
    double abs = abs(new ComplexNumber(5, 0));
    assertEquals(5.0, abs);
  }

  @Test
  public void test2() {
    double abs = abs(new ComplexNumber(-5, 0));
    assertEquals(5.0, abs);
  }

  @Test
  public void test3() {
    double abs = abs(new ComplexNumber(0, 5));
    assertEquals(5.0, abs);
  }

  @Test
  public void test4() {
    double abs = abs(new ComplexNumber(0, -5));
    assertEquals(5.0, abs);
  }

  @Test
  public void test5() {
    double abs = abs(new ComplexNumber(3, 4));
    assertEquals(5.0, abs);
  }

  @Test
  public void test6() {
    ComplexNumber conjucate = conjucate(new ComplexNumber(5, 0));
    assertEquals(5, conjucate.real(), 0.001);
    assertEquals(0, conjucate.imaginary(), 0.001);
  }

  @Test
  public void test7() {
    ComplexNumber conjucate = conjucate(new ComplexNumber(0, 5));
    assertEquals(new ComplexNumber(0, -5), conjucate);
  }

  @Test
  public void test8() {
    ComplexNumber conjucate = conjucate(new ComplexNumber(1, 1));
    assertEquals(new ComplexNumber(1, -1), conjucate);
  }

  @Test
  public void test9() {
    ComplexNumber add = add(complexNumber(1, 0), complexNumber(2, 0));
    assertEquals(complexNumber(3,0), add);
  }

  @Test
  public void test10() {
    ComplexNumber add = add(complexNumber(0, 1), complexNumber(0, 2));
    assertEquals(complexNumber(0,3), add);
  }

  @Test
  public void test11() {
    ComplexNumber add = add(complexNumber(1, 2), complexNumber(3, 4));
    assertEquals(complexNumber(4,6), add);
  }

  @Test
  public void test12() {
    ComplexNumber sub = sub(complexNumber(1, 0), complexNumber(2, 0));
    assertEquals(complexNumber(-1,0), sub);
  }

  @Test
  public void test13() {
    ComplexNumber sub = sub(complexNumber(0, 1), complexNumber(0, 2));
    assertEquals(complexNumber(0,-1), sub);
  }

  @Test
  public void test14() {
    ComplexNumber sub = sub(complexNumber(1, 2), complexNumber(3, 4));
    assertEquals(complexNumber(-2,-2), sub);
  }

  @Test
  public void test15() {
    ComplexNumber sub = sub(complexNumber(1, 2), complexNumber(3, 4));
    assertEquals(complexNumber(-2,-2), sub);
  }

  @Test
  public void test16() {
    ComplexNumber mul = mul(complexNumber(1, 0), complexNumber(2, 0));
    assertEquals(complexNumber(2,0), mul);
  }

  @Test
  public void test17() {
    ComplexNumber mul = mul(complexNumber(0, 1), complexNumber(0, 2));
    assertEquals(complexNumber(-2,0), mul);
  }

  @Test
  public void test18() {
    ComplexNumber mul = mul(complexNumber(1, 2), complexNumber(3, 4));
    assertEquals(complexNumber(-5,10), mul);
  }

  @Test
  public void test19() {
    ComplexNumber div = div(complexNumber(1, 0), complexNumber(2, 0));
    assertEquals(complexNumber(0.5,0), div);
  }

  @Test
  public void test20() {
    ComplexNumber div = div(complexNumber(0, 1), complexNumber(0, 2));
    assertEquals(complexNumber(0.5,0.0), div);
  }

  @Test
  public void test21() {
    ComplexNumber div = div(complexNumber(1, 2), complexNumber(3, 4));
    assertEquals(complexNumber(0.44,0.08), div);
  }

  private ComplexNumber complexNumber(double real, double imaginary) {
    return new ComplexNumber(real, imaginary);
  }
}
