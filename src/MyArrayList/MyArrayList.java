package MyArrayList;

import java.util.Arrays;

public class MyArrayList { //начальный размер 3
    private int[] array;
    private int sizeArray = 3;

    public MyArrayList() {
        this.array = new int[sizeArray];
    }

    public MyArrayList(int sizeArray) {
        this.array = new int[sizeArray];
        this.sizeArray = sizeArray;
    }

    private void resize(int newLength) { //переопределяем массив
        int[] newArray = new int[newLength];
        System.arraycopy(array, 0, newArray, 0, sizeArray - 1);
        array = newArray;
    }

    public void add(int num) { //добавление в конец массива
        sizeArray++;
        resize(sizeArray);
        array[sizeArray - 1] = num;
    }

    public void addOfindex(int index, int num) { //добавление по индексу
        if
        (index > array.length - 1) {
            resize(index + 1);
            sizeArray = index + 1;
            array[index] = num;
        } else {
            sizeArray++;
            resize(sizeArray);
            for (int x = array.length - 1; x > index; x--) {
                array[x] = array[x - 1];
            }
            array[index] = num;
        }
    }


    public int get(int position) { //получаем по индексу
        return array[position];
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "array=" + Arrays.toString(array) +
                ", sizeArray=" + sizeArray +
                '}';
    }
}
