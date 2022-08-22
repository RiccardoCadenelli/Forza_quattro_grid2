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

    public void inizializzaScacchiera(){
        ArrayList<ArrayList<Circle>> scacchiera = new ArrayList();
        ArrayList<Circle> C0 = new ArrayList<>();
        C0.add(Circle00); C0.add(Circle01); C0.add(Circle02); C0.add(Circle03); C0.add(Circle04); C0.add(Circle05);
        ArrayList<Circle> C1 = new ArrayList<>();
        C1.add(Circle10); C1.add(Circle11); C1.add(Circle12); C1.add(Circle13); C1.add(Circle14); C1.add(Circle15);
        ArrayList<Circle> C2 = new ArrayList<>();
        C2.add(Circle20); C2.add(Circle21); C2.add(Circle22); C2.add(Circle23); C2.add(Circle24); C2.add(Circle25);
        ArrayList<Circle> C3 = new ArrayList<>();
        C3.add(Circle30); C3.add(Circle31); C3.add(Circle32); C3.add(Circle33); C3.add(Circle34); C3.add(Circle35);
        ArrayList<Circle> C4 = new ArrayList<>();
        C4.add(Circle40); C4.add(Circle41); C4.add(Circle42); C4.add(Circle43); C4.add(Circle44); C4.add(Circle45);
        ArrayList<Circle> C5 = new ArrayList<>();
        C5.add(Circle50); C5.add(Circle51); C5.add(Circle52); C5.add(Circle53); C5.add(Circle54); C5.add(Circle55);
        ArrayList<Circle> C6 = new ArrayList<>();
        C6.add(Circle60); C6.add(Circle61); C6.add(Circle62); C6.add(Circle63); C6.add(Circle64); C6.add(Circle65);
        scacchiera.add(C0); scacchiera.add(C1); scacchiera.add(C2); scacchiera.add(C3); scacchiera.add(C4); scacchiera.add(C5); scacchiera.add(C6);
        ArrayList<Rectangle> RectList = new ArrayList<>();
        RectList.add(RectC0); RectList.add(RectC1); RectList.add(RectC2); RectList.add(RectC3); RectList.add(RectC4); RectList.add(RectC5); RectList.add(RectC6);
        //System.out.println(scacchiera);
        /*Circle mycircle = new Circle();
        mycircle= scacchiera.get(0).get(0);
        mycircle.setFill(Color.rgb(255,0,0));*/
        System.out.println(scacchiera.get(0).get(0));
        System.out.println(gridTabella.getWidth());
        System.out.println(gridTabella.getHeight());
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
    protected void onColumnEntered(){
        //cerchioProva.setFill(Color.RED);
    }

    @FXML
    protected void onColumnExited(){
        //cerchioProva.setFill(Color.BLUE);
    }

    @FXML
    protected void  onMouseColumnClicked(){

        /*int counter = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;
        int counter5 = 0;
        int counter6 = 0;
        int counter7 = 0;

        if(firstColumn == null && counter < N_PEDINE){
            addCircle1C(Circle00);
            counter++;
        }
        else{
            addCircle1C(Circle01); addCircle1C(Circle02); addCircle1C(Circle03);
            addCircle1C(Circle04); addCircle1C(Circle05);
            counter++;
        }
        if(secondColumn == null && counter2 < N_PEDINE){
            addCircle2C(Circle10);
            counter2++;
        }
        else {
            addCircle2C(Circle11); addCircle2C(Circle12); addCircle2C(Circle13);
            addCircle2C(Circle14);addCircle2C(Circle15);
            counter2++;
        }
        if(thirdColumn == null && counter2 < N_PEDINE){
            addCircle3C(Circle20);
            counter3++;
        }
        else{
            addCircle3C(Circle21); addCircle3C(Circle22); addCircle3C(Circle23);
            addCircle3C(Circle24);addCircle3C(Circle25);
            counter3++;
        }
        if(fourthColumn == null && counter4 < N_PEDINE){
            addCircle4C(Circle30);
            counter4++;
        }
        else{
            addCircle4C(Circle31); addCircle4C(Circle32); addCircle4C(Circle33);
            addCircle4C(Circle34);addCircle4C(Circle35);
            counter4++;
        }
        if(fifthColumn == null && counter5 < N_PEDINE){
            addCircle5C(Circle40);
            counter5++;
        }
        else{
            addCircle5C(Circle41); addCircle5C(Circle42); addCircle5C(Circle43);
            addCircle5C(Circle44);addCircle5C(Circle45);
            counter5++;
        }
        if(sixthColumn == null && counter6 < N_PEDINE){
            addCircle6C(Circle50);
            counter6++;
        }
        else{
            addCircle6C(Circle51); addCircle6C(Circle52); addCircle6C(Circle53);
            addCircle6C(Circle54);addCircle6C(Circle55);
            counter6++;
        }
        if(seventhColumn == null && counter7 < N_PEDINE){
            addCircle6C(Circle60);
            counter7++;
        }
        else{
            addCircle7C(Circle61); addCircle7C(Circle62); addCircle7C(Circle63);
            addCircle7C(Circle64);addCircle7C(Circle65);
            counter7++;
        }*/
    }
}