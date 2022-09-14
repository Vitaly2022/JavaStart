package Object130922;

import java.util.Objects;

public class Person implements Cloneable {
    String ID;
    String name;
    Car car;

    public Person(String ID, String name, Car car) {
        this.ID = ID;
        this.name = name;
        this.car = car;
    }

    public Person(Person otherPerson) throws CloneNotSupportedException { //конструктор глубокого копирования
        this(otherPerson.getID(), otherPerson.getName(), (Car) otherPerson.getCar().clone());
    }



    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public Car getCar() {
        return car;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(ID, person.ID) &&
                Objects.equals(name, person.name) &&
                Objects.equals(car, person.car);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, name, car);
    }

    @Override
    public String toString() {
        return "Person{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", car=" + car +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

