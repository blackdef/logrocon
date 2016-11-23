package ru.jef.testng;

/**
 * Created by plotnikov on 23.11.2016.
 */
public class TestData {
  private int x;
  private int y;
  private int exSumm;

  public TestData withX(int x){
    this.x = x;
    return this;
  }

  public TestData withY(int y){
    this.y = y;
    return this;
  }

  public TestData withExSumm(int exSumm){
    this.exSumm = exSumm;
    return this;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public int getExSumm() {
    return exSumm;
  }
}
