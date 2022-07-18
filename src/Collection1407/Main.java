package Collection1407;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String St = "0";
        ArrayList<String> List_of_file = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        String St2;
        do {
            St2 = input.nextLine();
            //   if (St2!="0") List_of_file.add(St2);
            if (St.equals(St2) == false) List_of_file.add(St2);
        } while (St.equals(St2) == false);
        System.out.println("List");
        System.out.println(List_of_file);
    }

}


/*
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input path:");
        Scanner input = new Scanner(System.in);
        String p_file=input.nextLine();

        List<String> lines = new ArrayList<>();
        try (Scanner sc = new Scanner(new File(p_file))) {
            while (sc.hasNextLine()) {
                lines.add(sc.nextLine());

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String[] arr = lines.toArray(new String[0]);

        System.out.println(Arrays.toString(arr));

        for (int i=0;i<arr.length; i++){
            if ((MetodSting.find1(arr[i])==1) && (arr[i].length()==15))
                System.out.println("Valid number");
            else System.out.println("Not a valid number");
        }
    }


}


*/
