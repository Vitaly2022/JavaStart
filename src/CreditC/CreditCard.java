package CreditC;

public class CreditCard {
    int number;
    int summa;

    public CreditCard(int number, int summa) {
        this.number = number;
        this.summa = summa;
    }

    int nachisl(int nach) {
        summa = summa+nach;
        return summa;
          }

    int takeoff(int take) {
        summa=summa-take;
        return summa;
      }

    void viewinvoice () {
        System.out.println(number +" sum="+summa);
    }

}
