package ru.jef.pattern.builder;

/**
 * Created by plotnikov on 23.11.2016.
 */
public class MealBuilder {
  public Meal prepareVegMeal (){
    Meal meal = new Meal();
    meal.addItem(new VegBurger());
    meal.addItem(new Coke());
    return meal;
  }

  public Meal prepareNonVegMeal (){
    Meal meal = new Meal();
    meal.addItem(new ChickenBurger());
    meal.addItem(new Pepsi());
    return meal;
  }
}
