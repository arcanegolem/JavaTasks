package ru.mirea.task14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class Drunkard {
    static Stack<Integer> player1 = new Stack<>();
    static Stack<Integer> player2 = new Stack<>();
    static Stack<Integer> buff    = new Stack<>();

    public static void main(String[] args){
        String input;
        Scanner scan = new Scanner(System.in);

        ArrayList<Stack<Integer>> players = new ArrayList<>();

        int turns = 0;

        players.add(player1);
        players.add(player2);

        for (int i = 0; i < 2; i++){
            input = scan.nextLine();

            for(int j = 0; j < 5; j++){
                players.get(i).push(Integer.parseInt(input.split(" ")[j]));
            }
        }

        while (!(player1.empty() | player2.empty())){
            turns++;

            buff.push(player2.peek());
            buff.push(player1.peek());

            if ((player1.peek() == 9) && (player2.peek() == 0)){
                player1.pop();
                player2.pop();

                buff.addAll(player2);
                player2.clear();
                player2.addAll(buff);
            }
            else if ((player1.peek() == 0) && (player2.peek() == 9)){
                player1.pop();
                player2.pop();

                buff.addAll(player1);
                player1.clear();
                player1.addAll(buff);
            }
            else {
                if (player1.pop() > player2.pop()) {
                    buff.addAll(player1);
                    player1.clear();
                    player1.addAll(buff);
                } else {
                    buff.addAll(player2);
                    player2.clear();
                    player2.addAll(buff);
                }
                buff.clear();
            }

            if (turns == 106) {
                System.out.println("botva");
                return;
            }
        }

        if(!player1.empty()) {
            System.out.printf("first %s", turns);
        }
        else {
            System.out.printf("second %s", turns);
        }
    }
}
