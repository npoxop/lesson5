package vtb.baranovdv;

public class Main {

    public static void main(String[] args) {

        //Д3 4_2 Реверс массива

        int[] array1 = {6, 4, 6, 48, 59, 55, 56, 87}; //создаем первый массив и выводим его на экран
        for (int i = 0; i < array1.length; i++) {
            System.out.print(" " + array1[i] + " ");
        }

        System.out.println();

        int[] array2 = new int[array1.length]; //создаем второй массив равный по длине первому
        int z = array1.length - 1; //создаем переменную равную номеру последней ячейки в первом массиве
        for (int k = 0; k < array2.length; k++) { //заполняем второй массив
            int m = array1[z];
            array2[k] = m;
            z--;
            //System.out.print(" " + array2[k] + " ");
        }

        int j = 0; //Копируем значения второго массива в первый
        for (int v = 0; v < array1.length; v++) {
            int l = array2[j];
            array1[v] = l;
            j++;
            System.out.print(" " + array1[v] + " ");
        }
    }
}