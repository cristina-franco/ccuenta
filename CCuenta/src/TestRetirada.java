import static org.junit.Assert.*;

import org.junit.Test;

public class TestRetirada {

	Ccuenta miCuenta= new Ccuenta("Ana","ES08-3456-2343-2345-1234-1234",3200,1);
	
	@Test
	public void testRetirada() {
		miCuenta.retirar(200);
		assertEquals(3000,miCuenta.getSaldo(),0.001);	
	}

}
