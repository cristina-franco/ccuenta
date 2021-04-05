import static org.junit.Assert.*;

import org.junit.Test;

public class TestGranRetirada {

	Ccuenta miCuenta= new Ccuenta("Ana","ES08-3456-2343-2345-1234-1234",3200,1);
	
	@Test
	public void testRetiradaGrande() {
		miCuenta.retirar(3500);
		assertEquals(-300,miCuenta.getSaldo(),0.001);	
	}

}
