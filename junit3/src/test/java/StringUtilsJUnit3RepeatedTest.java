import junit.extensions.RepeatedTest;
import junit.framework.Test;

/**
 * Created by plotnikov on 18.11.2016.
 */
public class StringUtilsJUnit3RepeatedTest extends RepeatedTest{
  public StringUtilsJUnit3RepeatedTest(Test test, int repeat) {
    super(test, repeat);
  }
  public StringUtilsJUnit3RepeatedTest() {
    super(new StringUtilsJUnit3Test(), 10);
  }
  public void testIsEmputy(){
    
  }
}
