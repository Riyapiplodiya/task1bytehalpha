import java.util.Scanner;
public class duplicateremove {
    public static void main(String[] args) {
        int j=0;
        int[] number = {1, 2, 2, 3, 3, 4, 5};
        for(int element:number){
            System.out.print(element);
        }
            for (int i = 0; i <number.length-1; i++) {
                if (number[i] != number[i + 1]) {
                    number[j++] = number[i];
                }
            }
            number[j++]=number[number.length-1];
        System.out.println("\nafter deleting duplicate element:");
            for(int k=0;k<j;k++) {

                System.out.print(number[k]);
            }
        }


    }





