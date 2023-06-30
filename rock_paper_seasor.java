/*
Rock, Paper & Seasor
Author: Emran Alam
Data: 30, june, 2023
This is a fun game for time pass and your enjoy.
0 Rock
1 Paper
2 Seasor
*/
package com.emranCoder;
import java.util.Random;
import java.util.Scanner;

class rps {
    Scanner sc = new Scanner(System.in);
    private int userInput;

    private void getInput() {
        int user = sc.nextInt();
        this.userInput = user;
    }

    private boolean checkValidaton(int x) {
        if (x <= 3 && x > 0) return true;
        else return false;
    }

    private boolean check(int user, int cpu) {
        return (user == 0 && cpu == 2) | (user == 2 && cpu == 1) | (user == 1 && cpu == 0);
    }

    private void choosed(int x) {
        System.out.print("Computer Choose: ");
        if (x == 0) {
            System.out.println("Rock");
        } else if (x == 1) {
            System.out.println("Paper");
        } else {
            System.out.println("Seasor");
        }
    }


    public void start() {
        getInput();
        if (checkValidaton(userInput)) {
            userInput -= 1;
            Random random = new Random();
            int cpu = random.nextInt(3);
            if (check(userInput, cpu)) {
                System.out.println("You Won! 🥳");
            } else {
                if (userInput == cpu) {
                    System.out.println("Ops! Draw 🥱");
                } else {
                    System.out.println("Computer Win! 😪");
                }
                choosed(cpu);
            }
        } else {
            System.out.println("The input is invalid!");
            start();

        }

    }

}

public class fun_time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        rps game = new rps();
        System.out.println("Make Your Choose: ");
        System.out.println("1.Rock\n2.Paper\n3.Seasor");
        System.out.print("Choose Your option: ");

        game.start();
    }
}

