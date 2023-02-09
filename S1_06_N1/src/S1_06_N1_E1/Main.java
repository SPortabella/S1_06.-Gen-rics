package S1_06_N1_E1;

public class Main {
    public static void main(String[] args) {
        //Crea una classe anomenada NoGenericMethods que emmagatzemi tres objectes del mateix tipus,
        // juntament amb els mètodes per a emmagatzemar i extreure aquests objectes i un constructor
        // per a inicialitzar els tres. Comprova que els arguments es poden posar en qualsevol posició
        // en la crida al constructor.

        doExercici1();

    }

    private static void doExercici1() {
        NoGenericMethods noGenericMethods = new NoGenericMethods("hola", "adios", "hasta siempre");
        NoGenericMethods noGenericMethods1 = new NoGenericMethods( "adios", "hasta siempre", "hola");
        NoGenericMethods noGenericMethods2 = new NoGenericMethods( "hasta siempre", "hola", "adios");
    }
}