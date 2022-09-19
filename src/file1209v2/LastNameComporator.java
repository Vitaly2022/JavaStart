package file1209v2;

import java.util.Comparator;

public class LastNameComporator implements Comparator<Person> { //порядок сортировки второго имени

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getLastName().compareTo(o2.getLastName());
    }

}
