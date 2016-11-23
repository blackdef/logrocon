package ru.jef.pattern.mvc;

/**
 * Created by plotnikov on 23.11.2016.
 */
public class StudentView {
  public void printStudentDetails(String studentName, String studentRollNo){
    System.out.println("Student: ");
    System.out.println("Name: " + studentName);
    System.out.println("Roll No: " + studentRollNo);
  }
}
