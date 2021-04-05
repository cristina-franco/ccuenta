import static org.junit.Assert.*;

import org.junit.Test;

public class TestCreacionCompleta {

	Ccuenta miCuenta= new Ccuenta("Ana","ES08-3456-2343-2345-1234-1234",3200,1);

	@Test 
	public void testNombreCFE() {
		assertEquals("Ana",miCuenta.getNombre());
	}

	@Test 
	public void testCuentaCFE() {
		assertEquals("ES08-3456-2343-2345-1234-1234",miCuenta.getCuenta());
	}

	@Test
	public void testSaldoCFE() {
		assertEquals(3200,miCuenta.getSaldo(),0.001);
	}

}
