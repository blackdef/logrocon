package ru.jef.pattern.template;

/**
 * Created by plotnikov on 23.11.2016.
 */
public class Football extends Game{
  @Override
  void endPlay() {
    System.out.println("Football Game Finished!");
  }

  @Override
  void initialize() {
    System.out.println("Football Game Initialized! Start playing.");
  }

  @Override
  void startPlay() {
    System.out.println("Football Game Started. Enjoy the game!");
  }
}
