/**
 * This is a package
 * @author mkn
 * @version 1.0
 */
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
   * My greeter function
   * */
  public final String greet(String someone) {
    return String.format("Hello, %s!", someone);
  }
}
