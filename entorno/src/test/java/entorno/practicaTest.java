package entorno;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import entorno.practica;

class practicaTest {

	@Test
    void test_iva() {
    practica obj1 = new practica();
    double pr = obj1.CalcularIva(12);
    Assertions.assertEquals(14.52, pr);
    }
    
    @Test
    void test_ak() {
    practica obj2 = new practica();
    double al = obj2.Arrobak(1);
    Assertions.assertEquals(0.088, al);
    }
    
    @Test
    void test_al() {
    practica obj3 = new practica();
    double ak = obj3.Arrobal(20);
    Assertions.assertEquals(1.58, ak);
            
    }


}
