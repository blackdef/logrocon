package ru.jef.pattern.template;

/**
 * Created by plotnikov on 23.11.2016.
 */
public class TemplatePatternDemo {
  public static void main(String[] args) {

    Game game = new Cricket();
    game.play();
    System.out.println();
    game = new Football();
    game.play();
  }
}
