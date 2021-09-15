import java.util.Random;
import java.util.Scanner;

public class randomDemo {
    public static void main(String[] args){
        var randomNumberPicker = new Random();
        var randomNumber = randomNumberPicker.nextInt(10)+1;
        var inputReader = new Scanner(System.in);
        System.out.println("Pick a random number from 1 to 10: ");
        var userNumber = inputReader.nextInt();
        if(randomNumber == userNumber){
            System.out.println();
        }
    }
}
