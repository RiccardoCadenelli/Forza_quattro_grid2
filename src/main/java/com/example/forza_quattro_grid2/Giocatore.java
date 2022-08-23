package com.example.forza_quattro_grid2;

public class Giocatore {
    private int PlayerMove = 0;

    public Giocatore(){
        this.PlayerMove = 0;
    }

    public int getPlayerMove() {
        return PlayerMove;
    }

    public void resetPlayerMove(){
        PlayerMove = 0;
    }

    public int ChangePlayer(){
        if(PlayerMove == 0 || PlayerMove == 2)
            PlayerMove= 1;
        else
            PlayerMove= 2;

        return PlayerMove;
    }

}
