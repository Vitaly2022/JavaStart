package Pattern.Builder;

public class BuilderPattern {
    public static void main(String[] args) {
        Person person = new ImplemPersonBuilder().setName("Max").setAge(22).setSolary(10000).build();
        person.printPerson();

    }
}


class Person {
    String name;
    int age;
    int solary;

    public void printPerson () {
        System.out.println("Name=" + name + " Age=" + age + " Solary=" + solary);
    }
}

interface PersonBuilder {
    PersonBuilder setName(String name);

    PersonBuilder setAge(int age);

    PersonBuilder setSolary(int solary);

    Person build();
}

class ImplemPersonBuilder implements PersonBuilder {
    Person person = new Person();

    @Override
    public PersonBuilder setName(String name) {
        person.name = name;
        return this;
    }

    @Override
    public PersonBuilder setAge(int age) {
        person.age = age;
        return this;
    }

    @Override
    public PersonBuilder setSolary(int solary) {
        person.solary = solary;
        return this;
    }

    @Override
    public Person build() {
        return person;
    }
}

