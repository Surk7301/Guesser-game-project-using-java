import java.util.Scanner;
import java.util.*;

class Guesser{
    int guessNum;
    int guessingNumber()
    {

        Scanner scan = new Scanner(System.in);
        System.out.println("Guesser! Kindly guess the number.");
        guessNum=scan.nextInt();
        return guessNum;
    }
}

class Player1{
    int guessNum;
    int guessingNumber()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player1 Kindly guess the number.");
        guessNum=scan.nextInt();
        return guessNum;

    }
}class Player2{
    int guessNum;
    int guessingNumber()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player2 Kindly guess the number.");
        guessNum=scan.nextInt();
        return guessNum;

    }
}class Player3{
    int guessNum;
    int guessingNumber()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player3 Kindly guess the number.");
        guessNum=scan.nextInt();
        return guessNum;

    }
}

class Umpire{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectNumFromGuesser()
    {
        Guesser g=new Guesser();
        numFromGuesser=g.guessingNumber();

    }
    void collectNumFromPlayer()
    {
        Player1 p1 = new Player1();
        numFromPlayer1=p1.guessingNumber();

        Player2 p2 = new Player2();
        numFromPlayer2=p2.guessingNumber();

        Player3 p3 = new Player3();
        numFromPlayer3=p3.guessingNumber();


    }
     void compare()
    {
        if (numFromGuesser==numFromPlayer1)
        {
            if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3){
                System.out.println("All three player guessed correct number, So Everyone Won!");
            }
            else if(numFromGuesser==numFromPlayer2){
                System.out.println("player1 & Player2 won the game.");
            }
            else if(numFromGuesser==numFromPlayer3){
                System.out.println("player1 & player3 won the game.");
            } else  {
                System.out.println("Player1 won the game ");
            }


        } else if (numFromGuesser==numFromPlayer2) {
            if(numFromGuesser==numFromPlayer3){
                System.out.println("Player2 and Player3 Won the game");
            }
            else{
                System.out.println("Player2 won the game.");
            }

        } else if (numFromGuesser==numFromPlayer3) {
            System.out.println("Player3 won the game.");
        }
        else {
            System.out.println("No one guessed correctly, So Everyone lost the game.");
        }
    }
}
class LaunchGame {
     public static void main(String[] args) {
         Umpire u = new Umpire();
         u.collectNumFromGuesser();
         u.collectNumFromPlayer();
         u.compare();

     }
}
