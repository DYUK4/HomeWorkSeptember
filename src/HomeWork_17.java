package HomeWork.HomeWorkSeptember.src;
import java.util.Scanner;
import java.util.Random;
public class HomeWork_17 {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
Random rand = new Random();
        System.out.print("Введите размер массива: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.print("Введите диапазон чисел: ");
        int di = input.nextInt();
        for(int i = 0; i < n; i++){
            arr[i] = rand.nextInt(di);
            }
        for(int ar : arr) System.out.print(ar+"\t");
        System.out.println();
        for(int i = 0; i < n; i++){
            boolean met_beform = false;
            for(int j = 0; j < i; j++){
                if(arr[j] == arr[i]){
                    met_beform = true;
                    break;
                }
            }
            if(met_beform) continue;
            int count = 0;
            for(int j = i + 1; j < n; j++){
                if(arr[j] == arr[i]) count++;
            }

            if(count > 0) {
                count +=1; // рельное количество значений в массиве
                System.out.print("в массиве значение %d повторяется - %d ".formatted(arr[i], count));
                if(count >= 10 && count <= 20){ // Урок № 9 1:08мин
                    System.out.println("раз");
                    }
                else if (count % 10 == 1){
                    System.out.println("раз");
                }
                else if(count % 10 > 1 && count % 10 < 5){
                    System.out.println("раза");
                }else {
                    System.out.println("раз");
                }

            }//if(count > 0)
        }//for(int i = 0; i < n; i++)



    }

}
