import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int N = 10;
        int[] array = new int[N]; // Создание массива

        for (int i = 0; i < array.length; i++) { // Инициализация массива
            array[i] = i;
        }
        for(int arr : array) System.out.print(arr+"\t"); // Вывод массива
        System.out.println();
        System.out.print("Введите число сдвига в Лево: ");
        int l = input.nextInt(); // Переменная ввода
        for(int i = 0; i < l; i++){ //крутить пока i меньше введенного числа(l)
              int left = array[0]; // сохраняем значение(число) в индексе [0]
          for(int j = 0; j < array.length-1; j++) {  // проход по массиву перезаписывая последовательно значения индексов
              array[j] = array[j + 1];   // [0]<-[1]==[1][1]<-[2]==[2][2]//[1][2][3][4][4][5][6][7][8][9]
          }
              array[array.length - 1] = left; // Запись в последний индекс значение из [0]:[1][2][3][4][5][6][7][8][9][0]
          }

        for(int ar: array) System.out.print(ar+"\t");
        System.out.println();
        for(int i = 0; i < array.length; i++){ // очистка массива перезаписью всех значений
            array[i]=i;
        }
        //for(int arra : array) System.out.print(arra+"\t");
        System.out.println();
        System.out.print("Введите число сдвига в Право: ");
        int r = input.nextInt();
        for(int i = 0; i < r; i++){
            int right = array[array.length - 1];
            for(int j = array.length - 1; j > 0; j--){
                array[j] = array[j - 1];
            }
            array[0] = right;
        }
        for(int arr:array) System.out.print(arr+"\t");
    }
}


