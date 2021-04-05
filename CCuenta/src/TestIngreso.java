import static org.junit.Assert.*;

import org.junit.Test;

public class TestIngreso {

	Ccuenta miCuenta= new Ccuenta("Ana","ES08-3456-2343-2345-1234-1234",3200,1);
	
	@Test
	public void testIngresarPositivo() {
		miCuenta.ingresar(2000);
		assertEquals(5200,miCuenta.getSaldo(),0.001);	
	}

}
