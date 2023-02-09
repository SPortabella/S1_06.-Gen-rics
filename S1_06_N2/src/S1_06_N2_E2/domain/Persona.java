package S1_06_N2_E2.domain;

public class Persona {
    private String name;
    private String surname;

    public Persona(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\''+
                '}';
    }
}
