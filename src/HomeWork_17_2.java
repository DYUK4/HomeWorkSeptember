package HomeWork.HomeWorkSeptember.src;
import java.util.Scanner;

public class HomeWork_17_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /////////////////////////////////////////////////////////////////
        Scanner input = new Scanner(System.in);

        char[]hex = new char[8];

        System.out.print("Введите десятичное число: ");

        int decimal = input.nextInt();
        int num = decimal;

        int i = 0;
        while(decimal > 0){
            //----------------------------
            hex[i]= (char)(decimal%16);
            if(hex[i] < 10) hex[i] += 48;//48/0;49/1;50/2;51/3;52/4;53/5;54/6;55/7;56/8;57/9;
            else             hex[i] += 55;//65/A;66/B;67/C;68/D;69/E;70/F;
           //------------------------------
            decimal /= 16;
            i++;
        }
        System.out.print(num+" = ");
        for(--i; i >= 0; i--) System.out.print(hex[i]);

        //////////////////////////////////////////////////////////////////////////////
        /*for(int j = 0; j < 256; j++){
            System.out.println(j +"\t"+ (char)j);
        }*/
       /* char[]hex = new char[8];
        System.out.print("Введите десятичное число: ");
       int decimal = scan.nextInt();
       int num = decimal;
      int i = 0;
       for(; decimal > 0; decimal /= 16) {

           hex[i] = (char) (decimal % 16);
           if(hex[i] < 10) hex[i] += 48;
           else          hex[i] += 55;

           i++;
           }
        System.out.print(num+ " = ");
       for(--i; i >= 0; i--) System.out.print(hex[i]);
*/
    }
}
