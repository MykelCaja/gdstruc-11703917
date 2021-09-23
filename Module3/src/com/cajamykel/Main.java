package com.cajamykel;
import java.util.Scanner;
//Min + (int)(Math.random() * ((Max - Min) + 1)) - Random

public class Main {

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(15);
        int round = 0;
        int random = 0;
        int game = 0;

        while(game < 10){
            random = 1 + (int)(Math.random() * ((7 - 1) + 1));
            System.out.println("Players to be added: [" + random + "]");
            System.out.println();

            //Character creation:
            for(int i = 0; i <= random; i++){
                System.out.println("==========[NEW PLAYER ADDED]==========");
                int id = 1000000 + (int)(Math.random() * ((9999999 - 1000000) + 1000000));
                int level = 1 + (int)(Math.random() * ((100 - 1) + 1));
                queue.add(new Player(id,"BOT",level));
            }

            //Print the queue:
            System.out.println();
            System.out.println("TOTAL PLAYERS: [" + queue.size() + "]");
            queue.printQueue();

            //Initiate game:
            if(queue.size() < 5){
                System.out.println("NOT ENOUGH PLAYERS IN THE LOBBY.");
                System.out.println("PLEASE ADD MORE.");
            }

            else{
                System.out.println("==========[GAME INITIATED GET READY]==========");
                for(int i = 0; i < 5; i++){
                    if(queue.size() <= 0){
                        System.out.println("[NO PLAYER AVAILABLE]");
                    }
                    else{
                        System.out.println("[PLAYER REMOVED SUCCESSFUL]");
                        queue.remove();
                    }
                }
                game++;
            }

            round++;
            System.out.println("Rounds: [" + round + "]");
            System.out.println("Games: [" + game + "]");
            new Scanner(System.in).nextLine();//Pause
        }

        System.out.println();
        System.out.println("[GAME ENDED]");
    }



}
