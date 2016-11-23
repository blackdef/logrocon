package ru.jef.pattern.adapter;

/**
 * Created by plotnikov on 23.11.2016.
 */
public class VlcPlayer implements AdvancedMediaPlayer {
  @Override
  public void playVlc(String fileName) {
    System.out.println("Playing vlc file. Name: "+ fileName);
  }

  @Override
  public void playMp4(String fileName) {
    //do nothing
  }
}
