package teste;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestCalculatorKmRulati.class, TestMasina.class,
		TestCumparator.class, TestKmMasiniShowroom.class })
public class AllTests {

}
