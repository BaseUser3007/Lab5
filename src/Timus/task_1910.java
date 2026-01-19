package Timus;

import java.util.Scanner;

public class task_1910 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++){
            array[i] = in.nextInt();
        }

        int max = 0;
        int number = 0;

        for(int i = 2; i < n; i++){
            int temp = array[i-2] + array[i-1] + array[i];
            if(max < temp){
                number = i;
                max = temp;
            }
        }
        System.out.printf("%d %d", max, number);
    }
}
