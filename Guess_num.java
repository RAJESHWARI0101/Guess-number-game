package project.com;
import java.util.Random;
import java.util.Scanner;
class Game{
    public int number;
    public int userNumber;
    public int noOfGuesses=0;
    public int getNoOfGuess(){
        return noOfGuesses;
    }
    public void setNoOfGuess(int noOfGuesses){
        this.noOfGuesses = noOfGuesses;
    }
    Game(){
        Random random = new Random();
        this.number = random.nextInt(500);
    }
    int takeUserNum(){
        System.out.println("***guess the number***");
        Scanner sc = new Scanner(System.in);
        userNumber = sc.nextInt();
        return userNumber;
    }
    boolean isCorrectNum(){
            noOfGuesses++;
        if(userNumber==number){
            System.out.format("Hurry!! you were right,it was %d\n you guessed in %d attempts\n",number,noOfGuesses);
            return true;
        }
        else if(userNumber<number){
            System.out.println("Too low...try again!");
        }
        else if(userNumber>number){
            System.out.println("Too high...try again plz!");
        }
        return false;
    }
}
public class Guess_num {
    public static void main(String[] args) {
        Game game = new Game();
        boolean b =false;
        while(!b){
            game.takeUserNum();
            b = game.isCorrectNum();
            System.out.println(b);
        }

    }
}
