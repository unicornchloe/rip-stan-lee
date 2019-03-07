package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//most of this assignment is trying to read the existing code to understand how it works,
        //ask a classmate or instructor if you are unsure how the code works.


        //generate a new player
        Player newplayer = new Player();

        //create main game loop that continues until the player has no health
         while (newplayer.getHealth() > 0){
             Enemy newenemy = new Enemy(newplayer.getPlayerLevel());
             while (newenemy.getHealth() > 0 &&  newplayer.getHealth() > 0){
                 newplayer.menu(newenemy);
                 newenemy.takeDamage(newplayer);
                 newplayer.takeDamage(newenemy);
             }




         }
        System.out.println("your at level : " + newplayer.getPlayerLevel());
        System.out.println("you have this much xp : " + newplayer.getXp());



            //generate a new enemy( the level of the enemy should be the player's level)
            //create battle loop that should continue while both the player and enemy are alive
                //gets player's input on what to do (use one of the methods to do this)
                //has the enemy take damage
                //has the player take damage
        //once the player is dead print out the player's level and how much xp they had.
    }
}
