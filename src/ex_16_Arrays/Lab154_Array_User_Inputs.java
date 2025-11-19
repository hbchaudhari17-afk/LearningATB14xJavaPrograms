package ex_16_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Lab154_Array_User_Inputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array(int)");
        int size = scanner.nextInt();

        String [] harshal = new String [size];

        for (int i = 0; i < harshal.length; i++) {
            System.out.println("Enter the elements -> " + i);
            harshal [i] = scanner.next();
        }
            System.out.println(" --- Print the values");

            Arrays.sort(harshal);
            for(String marks : harshal){
                System.out.println(marks);
        }
    }
}

