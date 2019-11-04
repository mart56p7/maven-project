package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * My greeter function.
   * @param: The name of the person you wish to greet
   * @return: A greeting
   * */
  public final String greet(String someone) {
    return String.format("Hello, %s!", someone);
  }
}
