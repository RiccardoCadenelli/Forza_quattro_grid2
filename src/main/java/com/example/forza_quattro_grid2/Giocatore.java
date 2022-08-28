package com.example.forza_quattro_grid2;

public class Giocatore {
    private int PlayerMove = 0;

    public Giocatore(){
        this.PlayerMove = 0;
    }

    /**
     * itizialize the Player paramether with random method
     */
    public void intializePlayer(){
        PlayerMove = (int)(Math.random()*(2)+1);
        System.out.println(PlayerMove);
    }

    public int getPlayerMove() {
        return PlayerMove;
    }

    /**
     * This method change the status of the player to player1 and player2
     * @return the number of the player
     */
    public int ChangePlayer(){
        if(PlayerMove == 2)
            PlayerMove= 1;
        else
            PlayerMove= 2;

        return PlayerMove;
    }

}
