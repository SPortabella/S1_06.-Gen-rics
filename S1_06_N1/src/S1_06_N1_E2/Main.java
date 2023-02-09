package S1_06_N1_E2;

import S1_06_N1_E2.domain.GenericMethods;
import S1_06_N1_E2.domain.Persona;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //Crea una classe anomenada Persona amb els atributs nom, cognom i edat.
        // Després crea una classe anomenada GenericMethods amb un mètode genèric que accepti tres arguments
        // de tipus genèric. Aquest mètode només ha d’imprimir per pantalla els arguments que ha rebut.
        // Al main() de la classe principal, crida el mètode genèric amb diferents tipus de paràmetres.
        // Exemple: un objecte de la classe Persona, un String i un tipus primitiu.
        // D’aquesta manera has comprovat que se li pot passar qualsevol tipus de paràmetre
        // i en qualsevol ordre.

        GenericMethods genericMethods = new GenericMethods();
        genericMethods.GenericMethod("hola", "es", "jueves");
        genericMethods.GenericMethod("1 + 1", "=", 2);
        genericMethods.GenericMethod(6, 3, 2);
        genericMethods.GenericMethod("Mi hermana es: ", new Persona("Sara", "Fernández", 8), new Date());

    }
}