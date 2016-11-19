package ru.jef.test;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by Fedor on 19.11.2016.
 */

@RunWith(Categories.class)
@Categories.IncludeCategory(Unit.class)
@Categories.ExcludeCategory(UnitB.class)
@Suite.SuiteClasses({StringUtilsJUnit4CategoriesTest.class, OtherCategoryTestClass.class})
public class JUnit4TestSuiteCategories {
}
