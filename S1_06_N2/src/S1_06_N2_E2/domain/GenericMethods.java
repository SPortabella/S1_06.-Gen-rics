package S1_06_N2_E2.domain;

import java.util.List;

public class GenericMethods<E1, E2, E3> {

    public void GenericMethod(List<?> e1List, E2 e2, E3 e3) {
        System.out.println(e1List + " " + e2 + " " + e3);
    }
}
