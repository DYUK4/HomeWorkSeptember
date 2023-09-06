import java.util.Random;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Ввод размера массива
        System.out.print("Введите размер массива: ");
        int n = input.nextInt();
        int [] array = new int[n];
        Random rand = new Random();
        for(int i = 0; i < n; i++){
            array[i]= rand.nextInt(10,200); //origin:-это нижний предел.Нижний предел можно задать только с верхним
            // bound: - верхний.
        }
        //for( int arr : array) System.out.print(arr + " ");
        //System.out.println();
        // вывод в прямом порядке
        for(int i = 0; i < n; i++) System.out.print(array[i]+"\t");
        System.out.println();
        // вывод в обратном порядке
        for(int i = n-1; i >= 0; i--) System.out.print(array[i]+"\t");
        System.out.println();
        //Сумма значений массива
        int sum = 0;
        for(int i = 0; i < n; i++) sum+=array[i];
        System.out.println("Сумма элементов массива: "+sum);
        // Средне арифметическое значение массива
        System.out.println("Средне арифметическое значение массива: "+(double)sum/n);
        //Поиск минимального и максимального значения массива
        int min,max;
        min=max=array[0]; // значение нулевого индекса массива
        for(int i = 0; i < n; i++){
            if(array[i] < min) min=array[i];
            if(array[i] > max) max=array[i];
        }
        System.out.println("Минимальное значение массива: "+min);
        System.out.println("Максимальное значение массива: "+max);
///////////////////////////////////////////////////////////////////////////
        for(int i = 0; i <= array.length-1;i++){
            int minIndex = i;

            for(int j = i + 1; j < array.length; j++){
                if(array[minIndex] > array[j]) minIndex = j;
            }
            if(minIndex != i){
                int temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
            }
        }
        for(int arr:array) System.out.print(arr+"\t");
        System.out.println(" <- Массив отсортирован ");


    }
}
