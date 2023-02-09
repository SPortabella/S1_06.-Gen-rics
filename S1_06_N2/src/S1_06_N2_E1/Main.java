package S1_06_N2_E1;

import S1_06_N2_E1.domain.GenericMethods;
import S1_06_N2_E1.domain.Persona;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //Modifica l'exercici anterior de manera que un dels arguments del mètode genèric no sigui genèric.

        GenericMethods genericMethods = new GenericMethods();
        genericMethods.GenericMethod("hola", "es", "jueves");
        genericMethods.GenericMethod(new Persona("Sara", "Fernández", 8), new Date(), "Es mi hermana");

    }
}