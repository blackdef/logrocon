import junit.framework.Test;
import junit.framework.TestResult;
import junit.framework.TestSuite;

/**
 * Created by plotnikov on 18.11.2016.
 */
public class StringUtilsJUnit3TestSuite extends TestSuite {

  public static Test suite() {
    final TestSuite s = new TestSuite();
    s.addTestSuite(OtherTest1.class);
    s.addTestSuite(OtherTest2.class);
    return s;
  }


}


