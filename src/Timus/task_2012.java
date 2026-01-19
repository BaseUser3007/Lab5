package Timus;

import java.util.Scanner;

public class task_2012 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        short f = in.nextShort();
        if(f+5 >= 12)
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}
