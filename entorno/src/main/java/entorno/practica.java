package entorno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class practica {
	static Logger log = LogManager.getLogger(practica.class);

public double CalcularIva(double cantidad) {
        double precio = cantidad*1.21;
        return precio;
    }
    
    public double Arrobak(double kilo) {
        double arroba = kilo*0.088;
        return arroba;
    }
    
    public double Arrobal(double litro) {
        double arroba = litro*0.079;
        return arroba;
    }


	public static void main(String[] args) {
		log.info("mensaje de info");
		log.debug("esto es un debug");

	}

}
