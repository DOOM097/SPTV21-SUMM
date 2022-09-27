package sptv21yevhenii2;

import java.util.Scanner;


public class SPTV21Yevhenii2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    System.out.print("Введите число: ");
    int n = input.nextInt();
    System.out.println("Сумма цифр равна: "+sumN(n));
    }
    
    public static int sumN(int n){
        int sum = 0;
        while (n != 0){
            sum+= n%10;
            n/=10;
        }
        return sum;
    }
    
}
