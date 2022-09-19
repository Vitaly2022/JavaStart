package file1209v2;

import java.util.Comparator;

public class FirstnameComparator implements Comparator<Person> { //порядок сортировки первого имени

    @Override
    public int compare(Person o1, Person o2) {

        return o1.getFirstName().compareTo(o2.getFirstName());
    }
}
