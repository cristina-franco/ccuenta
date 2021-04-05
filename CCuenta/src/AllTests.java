import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestCreacion.class, TestCreacionCompleta.class, TestGranRetirada.class, TestIngreso.class,
		TestIngresoNegativo.class, TestRetirada.class })
public class AllTests {

}
