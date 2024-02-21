package lt.techin;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({MainPageTest.class, LoginPageTest.class, LogoutPageTest.class})
public class TestSuite {
}
