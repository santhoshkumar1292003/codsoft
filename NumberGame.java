import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    public int getNoOfGuesses() {
        return this.noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
        System.out.format("Random number:%d", this.noOfGuesses);
    }

    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
        System.out.format("Random number:%d", this.number);
    }
    void takeUserInput(){
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        this.inputNumber = sc.nextInt();
    }
    boolean isCorrectNumber(){
        this.noOfGuesses++;
        if (this.inputNumber==this.number){
            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", this.number, this.noOfGuesses);
            return true;
        }
        else if(this.inputNumber<this.number){
            System.out.println("Too low...");
        }
        else if(this.inputNumber>this.number){
            System.out.println("Too high...");
        }
        return false;
    }

}
public class NumberGame {
    public static void main(String[] args) {


        Game g = new Game();
        boolean b= false;
        while(!b){
            g.takeUserInput();
            b = g.isCorrectNumber();
        }

    }
}