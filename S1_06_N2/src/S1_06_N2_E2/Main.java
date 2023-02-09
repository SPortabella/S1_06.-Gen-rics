package S1_06_N2_E2;

import S1_06_N2_E2.domain.GenericMethods;
import S1_06_N2_E2.domain.Persona;

import java.util.*;


public class Main {
    public static <object> void main(String[] args) {

        //Modifica l'apartat anterior de manera que els arguments del mètode genèric
        // siguin una llista d'arguments de variable indefinida.

        GenericMethods genericMethods = new GenericMethods();

        //creas la llista de persones (classe filla)  la passas en el constructor del generic
        List<Persona> personaList = new ArrayList<>();
        personaList.add(new Persona("Albert", "Sanchez"));
        personaList.add(new Persona("Alex", "Roberto"));

        genericMethods.GenericMethod(personaList, 2+2, " el que vulguis");

    }
}