package Exception;

import static Exception.Abc.m_abc;
import static Exception.M1ab2.m_1ab2;
import static Exception.M555.m_555;

public class Main {
    public static void main(String[] args) {

        String test = "555-abc-1a2b";

        try {
            if ((m_abc(test) == -1)|(m_555(test) != 0)|(m_1ab2(test) == false)) throw new Reinput();
           // if  throw new Reinput();
        } catch (Reinput x) {
            System.out.println("Reinput string!");
        }

    }
}
