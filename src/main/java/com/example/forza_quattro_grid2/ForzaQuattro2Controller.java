package com.example.forza_quattro_grid2;

import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ForzaQuattro2Controller {

    @FXML
    ArrayList<ArrayList<Circle>> scacchiera;
    ArrayList<Rectangle> RectList;

    @FXML
    private GridPane gridTabella = new GridPane();
    private final static  int RIGHE = 6;
    private final static int COLONNE = 7;
    private Giocatore giocatore = new Giocatore();
    private int counterC0, counterC1, counterC2, counterC3, counterC4,
                counterC5, counterC6;

    @FXML
    private Circle Circle00,Circle01,Circle02,Circle03,Circle04,Circle05,
            Circle10,Circle11,Circle12,Circle13,Circle14,Circle15,
            Circle20, Circle21, Circle22, Circle23, Circle24, Circle25,
            Circle30, Circle31, Circle32, Circle33, Circle34, Circle35,
            Circle40, Circle41, Circle42, Circle43, Circle44, Circle45,
            Circle50, Circle51, Circle52, Circle53, Circle54, Circle55,
            Circle60, Circle61, Circle62, Circle63, Circle64, Circle65;

    @FXML
    private Rectangle RectC0, RectC1, RectC2, RectC3, RectC4, RectC5, RectC6;
    ArrayList<Circle> C0 = new ArrayList<>(); ArrayList<Circle> C1 = new ArrayList<>(); ArrayList<Circle> C2 = new ArrayList<>();
    ArrayList<Circle> C3 = new ArrayList<>(); ArrayList<Circle> C4 = new ArrayList<>(); ArrayList<Circle> C5 = new ArrayList<>();
    ArrayList<Circle> C6 = new ArrayList<>();

    public void inizializzaScacchiera(){
        ArrayList<ArrayList<Circle>> scacchiera = new ArrayList();
        //ArrayList<Circle> C0 = new ArrayList<>();
        C0.add(Circle00); C0.add(Circle01); C0.add(Circle02); C0.add(Circle03); C0.add(Circle04); C0.add(Circle05);
        //ArrayList<Circle> C1 = new ArrayList<>();
        C1.add(Circle10); C1.add(Circle11); C1.add(Circle12); C1.add(Circle13); C1.add(Circle14); C1.add(Circle15);
        //ArrayList<Circle> C2 = new ArrayList<>();
        C2.add(Circle20); C2.add(Circle21); C2.add(Circle22); C2.add(Circle23); C2.add(Circle24); C2.add(Circle25);
        //ArrayList<Circle> C3 = new ArrayList<>();
        C3.add(Circle30); C3.add(Circle31); C3.add(Circle32); C3.add(Circle33); C3.add(Circle34); C3.add(Circle35);
        //ArrayList<Circle> C4 = new ArrayList<>();
        C4.add(Circle40); C4.add(Circle41); C4.add(Circle42); C4.add(Circle43); C4.add(Circle44); C4.add(Circle45);
        //ArrayList<Circle> C5 = new ArrayList<>();
        C5.add(Circle50); C5.add(Circle51); C5.add(Circle52); C5.add(Circle53); C5.add(Circle54); C5.add(Circle55);
        //ArrayList<Circle> C6 = new ArrayList<>();
        C6.add(Circle60); C6.add(Circle61); C6.add(Circle62); C6.add(Circle63); C6.add(Circle64); C6.add(Circle65);
        scacchiera.add(C0); scacchiera.add(C1); scacchiera.add(C2); scacchiera.add(C3); scacchiera.add(C4); scacchiera.add(C5); scacchiera.add(C6);
        ArrayList<Rectangle> RectList = new ArrayList<>();
        RectList.add(RectC0); RectList.add(RectC1); RectList.add(RectC2); RectList.add(RectC3); RectList.add(RectC4); RectList.add(RectC5); RectList.add(RectC6);
        RectC0.setFill(Paint.valueOf("TRANSPARENT")); RectC1.setFill(Paint.valueOf("TRANSPARENT")); RectC2.setFill(Paint.valueOf("TRANSPARENT"));
        RectC3.setFill(Paint.valueOf("TRANSPARENT")); RectC4.setFill(Paint.valueOf("TRANSPARENT")); RectC5.setFill(Paint.valueOf("TRANSPARENT"));
        RectC6.setFill(Paint.valueOf("TRANSPARENT"));
        counterC0 = RIGHE; counterC1 = RIGHE; counterC2 = RIGHE; counterC3 = RIGHE; counterC4 = RIGHE;
        counterC5 = RIGHE; counterC6 = RIGHE;
        //System.out.println(scacchiera);
        /*Circle mycircle = new Circle();
        mycircle= scacchiera.get(0).get(0);
        mycircle.setFill(Color.rgb(255,0,0));*/
        System.out.println(scacchiera.get(0).get(0));
        System.out.println(gridTabella.getWidth());
        System.out.println(gridTabella.getHeight());
    }

    public void updateCounterC0(){
        counterC0-= 1;
    }
    public void updateCounterC1(){
        counterC1-= 1;
    }
    public void updateCounterC2(){
        counterC2-= 1;
    }
    public void updateCounterC3(){
        counterC3-= 1;
    }
    public void updateCounterC4(){
        counterC4-= 1;
    }
    public void updateCounterC5(){
        counterC5-= 1;
    }
    public void updateCounterC6(){
        counterC6-= 1;
    }

    @FXML
    public void initialize(){
        inizializzaScacchiera();
    }

    @FXML
    protected void onRectC0Entered(){
        RectC0.setFill(Color.rgb(31,147,255,0.3));
    }
    @FXML
    protected void onRectC0Exited(){
        RectC0.setFill(Paint.valueOf("TRANSPARENT"));
    }

    @FXML
    protected void onRectC1Entered(){
        RectC1.setFill(Color.rgb(31,147,255,0.3));
    }
    @FXML
    protected void onRectC1Exited(){
        RectC1.setFill(Paint.valueOf("TRANSPARENT"));
    }

    @FXML
    protected void onRectC2Entered(){
        RectC2.setFill(Color.rgb(31,147,255,0.3));
    }
    @FXML
    protected void onRectC2Exited(){
        RectC2.setFill(Paint.valueOf("TRANSPARENT"));
    }

    @FXML
    protected void onRectC3Entered(){
        RectC3.setFill(Color.rgb(31,147,255,0.3));
    }
    @FXML
    protected void onRectC3Exited(){
        RectC3.setFill(Paint.valueOf("TRANSPARENT"));
    }

    @FXML
    protected void onRectC4Entered(){
        RectC4.setFill(Color.rgb(31,147,255,0.3));
    }
    @FXML
    protected void onRectC4Exited(){
        RectC4.setFill(Paint.valueOf("TRANSPARENT"));
    }

    @FXML
    protected void onRectC5Entered(){
        RectC5.setFill(Color.rgb(31,147,255,0.3));
    }
    @FXML
    protected void onRectC5Exited(){
        RectC5.setFill(Paint.valueOf("TRANSPARENT"));
    }

    @FXML
    protected void onRectC6Entered(){
        RectC6.setFill(Color.rgb(31,147,255,0.3));
    }
    @FXML
    protected void onRectC6Exited(){
        RectC6.setFill(Paint.valueOf("TRANSPARENT"));
    }

    @FXML
    protected void onMouseRectC0Clicked(){
        while (counterC0 >= 0) {
            if(giocatore.getPlayerMove() == 1) {
                C0.get(counterC0).setFill(Paint.valueOf("RED"));
                giocatore.ChangePlayer();
                break;
            }
            else if(giocatore.getPlayerMove() == 2) {
                C0.get(counterC0).setFill(Paint.valueOf("YELLOW"));
                giocatore.ChangePlayer();
                break;
            }
            else
                giocatore.ChangePlayer();
            updateCounterC0();
        }
        updateCounterC0();
    }

    @FXML
    protected void onMouseRectC1Clicked(){
        while(counterC1 >= 0){
            if(giocatore.getPlayerMove() == 1) {
                C1.get(counterC1).setFill(Paint.valueOf("RED"));
                giocatore.ChangePlayer();
                break;
            }
            else if(giocatore.getPlayerMove() == 2) {
                C1.get(counterC1).setFill(Paint.valueOf("YELLOW"));
                giocatore.ChangePlayer();
                break;
            }
            else
                giocatore.ChangePlayer();
            updateCounterC1();
        }
        updateCounterC1();
    }

    @FXML
    protected void onMouseRectC2Clicked(){
        while(counterC2 >= 0){
            if(giocatore.getPlayerMove() == 1) {
                C2.get(counterC2).setFill(Paint.valueOf("RED"));
                giocatore.ChangePlayer();
                break;
            }
            else if(giocatore.getPlayerMove() == 2) {
                C2.get(counterC2).setFill(Paint.valueOf("YELLOW"));
                giocatore.ChangePlayer();
                break;
            }
            else
                giocatore.ChangePlayer();
            updateCounterC2();
        }
        updateCounterC2();
    }

    @FXML
    protected void onMouseRectC3Clicked(){
        while(counterC3 >= 0){
            if(giocatore.getPlayerMove() == 1) {
                C3.get(counterC3).setFill(Paint.valueOf("RED"));
                giocatore.ChangePlayer();
                break;
            }
            else if(giocatore.getPlayerMove() == 2) {
                C3.get(counterC3).setFill(Paint.valueOf("YELLOW"));
                giocatore.ChangePlayer();
                break;
            }
            else
                giocatore.ChangePlayer();
            updateCounterC3();
        }
        updateCounterC3();
    }

    @FXML
    protected void onMouseRectC4Clicked(){
        while(counterC4 >= 0){
            if(giocatore.getPlayerMove() == 1) {
                C4.get(counterC4).setFill(Paint.valueOf("RED"));
                giocatore.ChangePlayer();
                break;
            }
            else if(giocatore.getPlayerMove() == 2) {
                C4.get(counterC4).setFill(Paint.valueOf("YELLOW"));
                giocatore.ChangePlayer();
                break;
            }
            else
                giocatore.ChangePlayer();
            updateCounterC4();
        }
        updateCounterC4();
    }

    @FXML
    protected void onMouseRectC5Clicked(){
        while(counterC5 >= 0){
            if(giocatore.getPlayerMove() == 1) {
                C5.get(counterC5).setFill(Paint.valueOf("RED"));
                giocatore.ChangePlayer();
                break;
            }
            else if(giocatore.getPlayerMove() == 2) {
                C5.get(counterC5).setFill(Paint.valueOf("YELLOW"));
                giocatore.ChangePlayer();
                break;
            }
            else
                giocatore.ChangePlayer();
            updateCounterC5();
        }
        updateCounterC5();
    }

    @FXML
    protected void onMouseRectC6Clicked(){
        while(counterC6 >= 0){
            if(giocatore.getPlayerMove() == 1) {
                C6.get(counterC6).setFill(Paint.valueOf("RED"));
                giocatore.ChangePlayer();
                break;
            }
            else if(giocatore.getPlayerMove() == 2) {
                C6.get(counterC6).setFill(Paint.valueOf("YELLOW"));
                giocatore.ChangePlayer();
                break;
            }
            else
                giocatore.ChangePlayer();
            updateCounterC6();
        }
        updateCounterC6();
    }

    @FXML
    protected void onPlayButtonClick(){

    }

    @FXML
    protected void onResetButtonClick(){
        initialize();
        giocatore.resetPlayerMove();
        Circle00.setFill(Paint.valueOf("DODGERBLUE")); Circle01.setFill(Paint.valueOf("DODGERBLUE"));
        Circle02.setFill(Paint.valueOf("DODGERBLUE")); Circle03.setFill(Paint.valueOf("DODGERBLUE"));
        Circle04.setFill(Paint.valueOf("DODGERBLUE")); Circle05.setFill(Paint.valueOf("DODGERBLUE"));
        Circle10.setFill(Paint.valueOf("DODGERBLUE")); Circle11.setFill(Paint.valueOf("DODGERBLUE"));
        Circle12.setFill(Paint.valueOf("DODGERBLUE")); Circle13.setFill(Paint.valueOf("DODGERBLUE"));
        Circle14.setFill(Paint.valueOf("DODGERBLUE")); Circle15.setFill(Paint.valueOf("DODGERBLUE"));
        Circle20.setFill(Paint.valueOf("DODGERBLUE")); Circle21.setFill(Paint.valueOf("DODGERBLUE"));
        Circle22.setFill(Paint.valueOf("DODGERBLUE")); Circle23.setFill(Paint.valueOf("DODGERBLUE"));
        Circle24.setFill(Paint.valueOf("DODGERBLUE")); Circle25.setFill(Paint.valueOf("DODGERBLUE"));
        Circle30.setFill(Paint.valueOf("DODGERBLUE")); Circle31.setFill(Paint.valueOf("DODGERBLUE"));
        Circle32.setFill(Paint.valueOf("DODGERBLUE")); Circle33.setFill(Paint.valueOf("DODGERBLUE"));
        Circle34.setFill(Paint.valueOf("DODGERBLUE")); Circle35.setFill(Paint.valueOf("DODGERBLUE"));
        Circle40.setFill(Paint.valueOf("DODGERBLUE")); Circle41.setFill(Paint.valueOf("DODGERBLUE"));
        Circle42.setFill(Paint.valueOf("DODGERBLUE")); Circle43.setFill(Paint.valueOf("DODGERBLUE"));
        Circle44.setFill(Paint.valueOf("DODGERBLUE")); Circle45.setFill(Paint.valueOf("DODGERBLUE"));
        Circle50.setFill(Paint.valueOf("DODGERBLUE")); Circle51.setFill(Paint.valueOf("DODGERBLUE"));
        Circle52.setFill(Paint.valueOf("DODGERBLUE")); Circle53.setFill(Paint.valueOf("DODGERBLUE"));
        Circle54.setFill(Paint.valueOf("DODGERBLUE")); Circle55.setFill(Paint.valueOf("DODGERBLUE"));
    }
}