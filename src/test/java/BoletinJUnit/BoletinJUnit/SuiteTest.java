package BoletinJUnit.BoletinJUnit;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ BoaTest.class, FridgeTest.class, PilaTest.class, SubscripcionOperadorAritmeticoTest.class })
public class SuiteTest {


}
