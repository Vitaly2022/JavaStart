
package Bank;
import java.util.Scanner;
public class ProcBank {
    public static void main(String[] args) {

        Scanner vvod = new Scanner(System.in);
        //Scanner.useLocale(Locale.US); чего не работает? чтобы и точки понимал

        System.out.println("Input summa:");
        float summavklada = vvod.nextFloat();

        System.out.println("Input month:");
        int monthvklad = vvod.nextInt();

        System.out.println(summavklada);

        int i;
        for (i=1; i<monthvklad+1; i++) {
            summavklada = (float) (summavklada*1.07);//разобраться
       }
        System.out.println("Vklad=" + summavklada);

    }
}
