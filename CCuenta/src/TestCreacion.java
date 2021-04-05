import static org.junit.Assert.*;

import org.junit.Test;

public class TestCreacion {

	Ccuenta miCuenta= new Ccuenta("Ana","ES08-3456-2343-2345-1234-1234",3200,1);
	
@Test
public void testNuevaCuentaCFE() {
	assertNotNull(miCuenta);
}

}
