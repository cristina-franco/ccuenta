import static org.junit.Assert.*;

import org.junit.Test;

public class TestIngresoNegativo {

	Ccuenta miCuenta= new Ccuenta("Ana","ES08-3456-2343-2345-1234-1234",3200,1);
	
	@Test
	public void testIngresarNegativo() {
		miCuenta.ingresar(-2000);
		assertEquals(1200,miCuenta.getSaldo(),0.001);	
	}
}
