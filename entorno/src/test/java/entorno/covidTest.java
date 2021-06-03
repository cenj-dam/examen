package entorno;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import examen.covid;

class covidTest {

	@Test
	void test_covid() {
		covid obj1 = new covid();
		int pr = obj1.calcularPrioridadVacunacion(61, 1);
		Assertions.assertEquals(2, pr);
		
		int ag = obj1.calcularPrioridadVacunacion(45, 1);
		Assertions.assertEquals(3, ag);
		
		int au = obj1.calcularPrioridadVacunacion(20, 1);
		Assertions.assertEquals(1, au);
		
		int fe = obj1.calcularPrioridadVacunacion(66, 2);
		Assertions.assertEquals(1, fe);
		
		int pb = obj1.calcularPrioridadVacunacion(55, 2);
		Assertions.assertEquals(1, pb);
		
	}
	

}
