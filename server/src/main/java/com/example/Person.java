package com.example;

/**
 * This is a class.
 */
public class Person {

  /**
   * This is a constructor.
   */
  public Person() {

  }
	
  /**
   *
   * @param someone someone
   * @return hello
   */
  final public String person(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
