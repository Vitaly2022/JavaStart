package Task1_280622;

public class Phone {
    int number;
    String model;
    int weight;

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }


    public Phone(int number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone() {
    }

    void sout() {
        System.out.println(number + " " + model + " " + weight);
    }

    void receiveCall(String NameCalling) {
        System.out.println("Calling " + NameCalling);
    }

    void receiveCall(String NameCalling, int number) {
        System.out.println("Calling " + NameCalling + "number:" + number);
    }

    void getNumber(int number) {
        System.out.println("Nomber of calling= " + number);
    }

    void sendMessage(int... number) {//переменной длинны
        System.out.println(number.length);
        for (int i = 0; i < number.length; i++) {
            System.out.println(i);
        }
        System.out.println();
    }

}
