package Collections2609;

import java.util.*;

public class ColMap {
    public static void main(String[] args) {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(12345874, "Vasia");
        myMap.put(67867, "Lena");
        myMap.put(123484, "Fedor");
        myMap.put(12345874, "XXX"); //если 1 и тоже ключ то перезаписывает его
        System.out.println(myMap);
        String VasiaName = myMap.get(12345874);
        System.out.println(VasiaName);
        myMap.remove(12345874);
        System.out.println(myMap);
        System.out.println("Есть ли ключ 123484=" + myMap.containsKey(123484));
        System.out.println("Есть ли значение Lena=" + myMap.containsValue("Lena"));
        Set<Integer> keys = myMap.keySet();
        System.out.println("Keys="+keys);
        List <String> VoluesMap = new ArrayList<>(myMap.values());//создали лист из значений МАПЫ
        System.out.println("Коллекция из значений="+VoluesMap);
        System.out.println("Число элементов в мапе="+myMap.size());
        myMap.clear();//удалили все элементы
        System.out.println(myMap);

        System.out.println("Соеденим две мапы");
        Map<Integer, String> myMap1 = new HashMap<>();
        myMap1.put(12345874, "Vasia1");
        myMap1.put(67867, "Lena1");
        myMap1.put(123484, "Fedor1");

        Map<Integer, String> myMap2 = new HashMap<>();
        myMap2.put(123, "Vasia2");
        myMap2.put(6787, "Lena2");
        myMap2.put(12348, "Fedor2");
        myMap1.putAll(myMap2);
        //System.out.println(myMap1);

        for (Map.Entry myEntry: myMap1.entrySet()){ // перебор мапы
            System.out.println(myEntry);
        }

        System.out.println("Если есть хотя бы 1 элемент то выводим на печать:");
        if (!myMap1.isEmpty()) {
            System.out.println(myMap1);

        }


    }
}
