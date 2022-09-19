package file1209v2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {

        System.out.println("Input path of file:");
        Scanner input = new Scanner(System.in);
        String p_file = input.nextLine();

        List<String> lines = new ArrayList<>();
        try (Scanner sc = new Scanner(new File(p_file))) {
            while (sc.hasNextLine()) {
                lines.add(sc.nextLine());//закидываем в лист инфу из файла
            }

            List<Person> p1 = new ArrayList<>();

            for (int i = 0; i < lines.size(); i++) {
                String lineofList = lines.get(i).trim(); // получили строку из коллекции без пробелов слева и права
                String[] words = lineofList.split(","); //разделили по запятой
                Person pers1 = new Person(words[0], words[1], words[2], words[3]);
                p1.add(pers1);//заполняем лист
            }

            int male = 0;
            int female = 0;
            int peapol30Sum = 0;

            for (int i = 0; i < p1.size(); i++) {
                String s1 = p1.get(i).getSex();
                s1 = s1.trim();//обрезали пробелы
                p1.get(i).setSex(s1);//засетали имена без пробелов
                if (p1.get(i).getSex().equals("male")) male++;
                else if (p1.get(i).getSex().equals("female")) female++;
                if (parseInt((p1.get(i).getAge())) > 30) peapol30Sum++;
            }

            System.out.println("Male=" + male);
            System.out.println("Female=" + female);
            System.out.println("Peapol>30 =" + peapol30Sum);

            Comparator nameComparator = new FirstnameComparator().thenComparing(new LastNameComporator());//определили сортировку компараторами
            Collections.sort(p1, nameComparator);

            for (int i = 0; i < p1.size(); i++) { //выводим сортировку
                System.out.println(p1.get(i));
            }
            try {
                FileWriter myWriter = new FileWriter(p_file, false); //перезаписываем файл
                myWriter.write(String.valueOf(p1));
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

