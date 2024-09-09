package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestFactorizer {

  Factorizer factorizer;

  @BeforeEach
  void setUp() {
    factorizer = new Factorizer();
  }

    ArrayList<Integer> t1 = new ArrayList<Integer>();
    ArrayList<Integer> t2 = new ArrayList<Integer>();
    ArrayList<Integer> t3 = new ArrayList<Integer>();
    ArrayList<Integer> t4 = new ArrayList<Integer>();

    ArrayList<Integer> nums = new ArrayList<Integer>();
  @Test
  public void testOne() {
    t1.add(2);
    t1.add(2);
    t1.add(5);
    t1.add(5); //answer for 100
    assertEquals(t1, factorizer.exampleMethod(100));
  }

  @Test
  public void testTwo() {
    t2.add(5);
    t2.add(7); //answer for 35
    assertEquals(t2, factorizer.exampleMethod(35));
  }

  @Test
  public void testThree() {
    t3.add(2);
    t3.add(2);
    t3.add(2);
    t3.add(3); //answer for 24
    assertEquals(t3, factorizer.exampleMethod(24));
  }
  @Test
  public void testFour() {
    t3.add(17); //answer for 17
    assertEquals(t3, factorizer.exampleMethod(17));
  }
}
