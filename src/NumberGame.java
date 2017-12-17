
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args){
        int randomNumber = (int) (Math.random() * 100) + 1;

        System.out.println("i have randomly choosen a number between 1 and 100.");
        System.out.println("can you guess what it is?");

        Scanner scanner = new Scanner(System.in);
        int input;

        input = scanner.nextInt();
        int i;

        for(i = 9; i > 0 ; --i){

            if(input == randomNumber){
                System.out.println("match found");

            } else {
                System.out.println("no match found, you have " + i + " guesses left");
                input = scanner.nextInt();
                if( i == 1){
                    System.out.println("the random number is " + randomNumber);
                }
            }
        }


    }
}