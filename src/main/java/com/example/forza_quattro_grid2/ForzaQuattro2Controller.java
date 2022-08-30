package com.example.forza_quattro_grid2;

import javafx.fxml.FXML;
import javafx.geometry.Point2D;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


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
    private Label gameLabel = new Label();

    @FXML
    private Button PlayButton = new Button();
    public Button ResetButton = new Button();

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
        scacchiera = new ArrayList();
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
        //System.out.println(scacchiera);
        /*Circle mycircle = new Circle();
        mycircle= scacchiera.get(0).get(0);
        mycircle.setFill(Color.rgb(255,0,0));*/
        System.out.println(scacchiera.get(0).get(0));
        System.out.println(gridTabella.getWidth());
        System.out.println(gridTabella.getHeight());
    }

    public void fillCircle (int column){
        Circle c;
        int currentRow = 0;
        for(int i = RIGHE-1 ; i >= 0; i--) {
            c=scacchiera.get(column).get(i);
            if (c.getFill().equals(Paint.valueOf("DODGERBLUE"))) {
                if (giocatore.getPlayerMove() == 1) {
                    c.setFill(Paint.valueOf("RED"));
                } else {
                    c.setFill(Paint.valueOf("YELLOW"));
                }
                giocatore.ChangePlayer();
                currentRow = i;
                break;
            }
        }
       gameOver(gameEnded(COLONNE-1,RIGHE-1));
    }

/*    public void inizializzaContatori(){
        counterC0 = RIGHE-1; counterC1 = RIGHE-1; counterC2 = RIGHE-1; counterC3 = RIGHE-1; counterC4 = RIGHE-1;
        counterC5 = RIGHE-1 ; counterC6 = RIGHE-1;
    }*/

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
        PlayButton.setDisable(false);
        ResetButton.setDisable(false);
        //inizializzaContatori();
        giocatore.intializePlayer();
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
      //  System.out.println(counterC0);
/*        while (counterC0 >= 0) {
            if(giocatore.getPlayerMove() == 1) {
                C0.get(counterC0).setFill(Paint.valueOf("RED"));
                giocatore.ChangePlayer();
                break;
            }
            else{
                C0.get(counterC0).setFill(Paint.valueOf("YELLOW"));
                giocatore.ChangePlayer();
                break;
            }
        }
        updateCounterC0();*/

        fillCircle(0);
/*        PlayButton.setDisable(true);
        ResetButton.setDisable(true);*/
    }

    @FXML
    protected void onMouseRectC1Clicked(){
/*        System.out.println(counterC1);
        while(counterC1 >= 0){
            if(giocatore.getPlayerMove() == 1) {
                C1.get(counterC1).setFill(Paint.valueOf("RED"));
                giocatore.ChangePlayer();
                break;
            }
            else {
                C1.get(counterC1).setFill(Paint.valueOf("YELLOW"));
                giocatore.ChangePlayer();
                break;
            }

        }
        updateCounterC1();*/

        fillCircle(1);
/*        PlayButton.setDisable(true);
        ResetButton.setDisable(true);*/
    }

    @FXML
    protected void onMouseRectC2Clicked(){
/*        while(counterC2 >= 0){
            if(giocatore.getPlayerMove() == 1) {
                C2.get(counterC2).setFill(Paint.valueOf("RED"));
                giocatore.ChangePlayer();
                break;
            }
            else{
                C2.get(counterC2).setFill(Paint.valueOf("YELLOW"));
                giocatore.ChangePlayer();
                break;
            }
        }
        updateCounterC2();*/

        fillCircle(2);
/*        PlayButton.setDisable(true);
        ResetButton.setDisable(true);*/
    }

    @FXML
    protected void onMouseRectC3Clicked(){
/*        while(counterC3 >= 0){
            if(giocatore.getPlayerMove() == 1) {
                C3.get(counterC3).setFill(Paint.valueOf("RED"));
                giocatore.ChangePlayer();
                break;
            }
            else{
                C3.get(counterC3).setFill(Paint.valueOf("YELLOW"));
                giocatore.ChangePlayer();
                break;
            }
        }
        updateCounterC3();*/

        fillCircle(3);
/*        PlayButton.setDisable(true);
        ResetButton.setDisable(true);*/
    }

    @FXML
    protected void onMouseRectC4Clicked(){
/*        while(counterC4 >= 0){
            if(giocatore.getPlayerMove() == 1) {
                C4.get(counterC4).setFill(Paint.valueOf("RED"));
                giocatore.ChangePlayer();
                break;
            }
            else{
                C4.get(counterC4).setFill(Paint.valueOf("YELLOW"));
                giocatore.ChangePlayer();
                break;
            }
        }
        updateCounterC4();*/

        fillCircle(4);
/*        PlayButton.setDisable(true);
        ResetButton.setDisable(true);*/
    }

    @FXML
    protected void onMouseRectC5Clicked(){
/*        while(counterC5 >= 0){
            if(giocatore.getPlayerMove() == 1) {
                C5.get(counterC5).setFill(Paint.valueOf("RED"));
                giocatore.ChangePlayer();
                break;
            }
            else{
                C5.get(counterC5).setFill(Paint.valueOf("YELLOW"));
                giocatore.ChangePlayer();
                break;
            }
        }
        updateCounterC5();*/

        fillCircle(5);
/*        PlayButton.setDisable(true);
        ResetButton.setDisable(true);*/
    }

    @FXML
    protected void onMouseRectC6Clicked(){
/*        while(counterC6 >= 0){
            if(giocatore.getPlayerMove() == 1) {
                C6.get(counterC6).setFill(Paint.valueOf("RED"));
                giocatore.ChangePlayer();
                break;
            }
            else {
                C6.get(counterC6).setFill(Paint.valueOf("YELLOW"));
                giocatore.ChangePlayer();
                break;
            }

        }
        updateCounterC6();*/

        fillCircle(6);
        /*PlayButton.setDisable(true);
        ResetButton.setDisable(true);*/
    }

    @FXML
    protected void onPlayButtonClick(){
        initialize();
    }

    @FXML
    protected void onResetButtonClick(){
        initialize();
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
        Circle60.setFill(Paint.valueOf("DODGERBLUE")); Circle61.setFill(Paint.valueOf("DODGERBLUE"));
        Circle62.setFill(Paint.valueOf("DODGERBLUE")); Circle63.setFill(Paint.valueOf("DODGERBLUE"));
        Circle64.setFill(Paint.valueOf("DODGERBLUE")); Circle65.setFill(Paint.valueOf("DODGERBLUE"));
        gameLabel.setText("FORZA 4");
    }

/*    public boolean gameEndedV (int row, int column){
        return true;
    }

    public boolean gameEndedH (int row, int column){
        return true;
    }

    public boolean gameEndedTL (int row, int column){
        for(int i = 0; i < column-3; i++){
            for(int j = 0; j < row-3; j++){

            }
        }
        return true;
    }
    public boolean gameEndedBL (int row, int column){
        for(int i = 0; i < column-3; i++ ){
            for(int j = 0; j < row+3; i++){

            }
        }
        return true;
    }*/

    private int gameEnded(int column, int row) {
/*        List<Point2D> vertical = IntStream.rangeClosed(row - 3, row + 3)
                .mapToObj(r -> new Point2D(column, r))
                .collect(Collectors.toList());

        List<Point2D> horizontal = IntStream.rangeClosed(column - 3, column + 3)
                .mapToObj(c -> new Point2D(c, row))
                .collect(Collectors.toList());

        Point2D topLeft = new Point2D(column - 3, row - 3);
        List<Point2D> diagonal1 = IntStream.rangeClosed(0, 6)
                .mapToObj(i -> topLeft.add(i, i))
                .collect(Collectors.toList());

        Point2D botLeft = new Point2D(column - 3, row + 3);
        List<Point2D> diagonal2 = IntStream.rangeClosed(0, 6)
                .mapToObj(i -> botLeft.add(i, -i))
                .collect(Collectors.toList());

        if (checkRange(vertical) == 1 || checkRange(horizontal) == 1 || checkRange(diagonal1) == 1 || checkRange(diagonal2) == 1){
            return 1;
        }
        else if (checkRange(vertical) == 2 || checkRange(horizontal) == 2 || checkRange(diagonal1) == 2 || checkRange(diagonal2) == 2){
            return 2;
        }
        else
        return 0;
        */

        if (checkRangeV(column,row) == 1 || checkRangeH(column,row) == 1 || checkRangeTLC(column,row) == 1 || checkRangeTLR(column,row) == 1  || checkRangeBLC(column,row) == 1 || checkRangeBLR(column,row) == 1)
        {
            return 1;
        }
        else if (checkRangeV(column,row) == 2 || checkRangeH(column,row) == 2 || checkRangeTLC(column,row) == 2 || checkRangeTLR(column,row) == 2 || checkRangeBLC(column,row) == 2 || checkRangeBLR(column,row) == 2){
            return 2;
        }
        else
            return 0;
    }

    private int checkRangeV(int column, int row) {
        int chainR = 0;
        int chainY = 0;
        Circle c;
        for(int i = 0; i <= column; i++){
            chainR = 0;
            chainY = 0;
            for (int j= 0; j <= row; j++) {
                c =  scacchiera.get(i).get(j);
                if (c.getFill().equals(Paint.valueOf("RED"))) {
                    chainR++;
                   // System.out.println("CHR "+ chainR);
                    if (chainR == 4) {
                      //  System.out.println("-----" + "1");
                        return 1;
                    }
                } else {
                    chainR = 0;
                }

                if (c.getFill().equals(Paint.valueOf("YELLOW"))) {
                    chainY++;
                   // System.out.println("CHY "+ chainY);
                    if (chainY == 4) {
                     //   System.out.println("-----" + "2");
                        return 2;
                    }
                } else {
                    chainY = 0;
                }
            }
        }

     //   System.out.println("-----" + "0");
        return 0;
    }

    private int checkRangeH(int column, int row) {
        int chainR = 0;
        int chainY = 0;
        Circle c;
        for (int j= 0; j <= row; j++) {
            chainR = 0;
            chainY = 0;
            for(int i = 0; i <= column; i++){
                c =  scacchiera.get(i).get(j);
                if (c.getFill().equals(Paint.valueOf("RED"))) {
                    chainR++;
                     // System.out.println("CHR "+ chainR);
                    if (chainR == 4) {
                       //   System.out.println("-----" + "1");
                        return 1;
                    }
                } else {
                    chainR = 0;
                }

                if (c.getFill().equals(Paint.valueOf("YELLOW"))) {
                    chainY++;
                     //System.out.println("CHY "+ chainY);
                    if (chainY == 4) {
                        //   System.out.println("-----" + "2");
                        return 2;
                    }
                } else {
                    chainY = 0;
                }
            }
        }
        //   System.out.println("-----" + "0");
        return 0;
    }
    private int checkRangeTLC(int column, int row) {
        int chainR = 0;
        int chainY = 0;
        Circle c;
        for(int i = 0; i <= column-3; i++){
            int k=i;
            chainR = 0;
            chainY = 0;
            for (int j= 0; j <= row; j++) {
                c =  scacchiera.get(k).get(j);

                if (c.getFill().equals(Paint.valueOf("RED"))) {
                    chainR++;
                   // System.out.println("CHR "+ chainR);
                    if (chainR == 4) {
                    //       System.out.println("-----" + "1");
                        return 1;
                    }
                } else {
                    chainR = 0;
                }

                if (c.getFill().equals(Paint.valueOf("YELLOW"))) {
                    chainY++;
                    //System.out.println("CHY "+ chainY);
                    if (chainY == 4) {
                    //       System.out.println("-----" + "2");
                        return 2;
                    }
                } else {
                    chainY = 0;
                }
                k++;
                if(k> column){
                    break;
                }
            }
        }
        //   System.out.println("-----" + "0");
        return 0;
    }
    private int checkRangeTLR(int column, int row) {
        int chainR = 0;
        int chainY = 0;
        Circle c;
        for (int j= 1; j <= row-3; j++) {
            int k=j;
            chainR = 0;
            chainY = 0;
            for(int i = 0; i <= column; i++){
                    c =  scacchiera.get(i).get(k);
                System.out.println(i + "-" + k + "-" + c);

                if (c.getFill().equals(Paint.valueOf("RED"))) {
                    chainR++;
                    System.out.println("CHR "+ chainR);
                    if (chainR == 4) {
                       System.out.println("-----" + "1");
                        return 1;
                    }
                } else {
                    chainR = 0;
                }

                if (c.getFill().equals(Paint.valueOf("YELLOW"))) {
                    chainY++;
                   System.out.println("CHY "+ chainY);
                    if (chainY == 4) {
                        System.out.println("-----" + "2");
                        return 2;
                    }
                } else {
                    chainY = 0;
                }
                k++;
                if(k> row){
                    break;
                }
            }
        }
        return 0;
    }
    private int checkRangeBLC(int column, int row) {
        int chainR = 0;
        int chainY = 0;
        Circle c;
        for(int i = 0; i <= column-3; i++){
            int k=i;
            chainR = 0;
            chainY = 0;
            for (int j= row; j >= 0; j--) {
                c =  scacchiera.get(k).get(j);

                if (c.getFill().equals(Paint.valueOf("RED"))) {
                    chainR++;
                    //System.out.println("CHR "+ chainR);
                    if (chainR == 4) {
                    //    System.out.println("-----" + "1");
                        return 1;
                    }
                } else {
                    chainR = 0;
                }

                if (c.getFill().equals(Paint.valueOf("YELLOW"))) {
                    chainY++;
                    //System.out.println("CHY "+ chainY);
                    if (chainY == 4) {
                       // System.out.println("-----" + "2");
                        return 2;
                    }
                } else {
                    chainY = 0;
                }
                k++;
                if(k> column){
                    break;
                }
            }
        }
        return 0;
    }
    private int checkRangeBLR(int column, int row) {
        int chainR = 0;
        int chainY = 0;
        Circle c;
        for (int j= row-1; j >= row-2;j-- ) {
            int k=j;
            chainR = 0;
            chainY = 0;
            for(int i = 0; i <= column; i++){ // i||j = column; i||j < 0; i||j --;

                c =  scacchiera.get(i).get(k);
                //System.out.println(i + "-" + k + "-" + c);
                if (c.getFill().equals(Paint.valueOf("RED"))) {
                    chainR++;
                //    System.out.println("CHR "+ chainR);
                    if (chainR == 4) {
                //        System.out.println("-----" + "1");
                        return 1;
                    }
                } else {
                    chainR = 0;
                }

                if (c.getFill().equals(Paint.valueOf("YELLOW"))) {
                    chainY++;
                //    System.out.println("CHY "+ chainY);
                    if (chainY == 4) {
                //        System.out.println("-----" + "2");
                        return 2;
                    }
                } else {
                    chainY = 0;
                }
                k--;
                if(k < 0){
                    break;
                }
            }
        }
        return 0;
    }
/*    private int checkRange(List<Point2D> points) {
        int chainR = 0;
        int chainY = 0;
        Circle c;

        for (Point2D p : points) {
            int column = (int) p.getX();
            int row = (int) p.getY();
            System.out.println("C: "+ column + " R: " + row);

            c =  scacchiera.get(column).get(row);

            if (c.getFill().equals(Paint.valueOf("RED"))) {
                chainR++;
                if (chainR == 4) {
                    return 1;
                }
            } else {
                chainR = 0;
            }

            if (c.getFill().equals(Paint.valueOf("YELLOW"))) {
                chainY++;
                if (chainY == 4) {
                    return 2;
                }
            } else {
                chainY = 0;
            }
        }

        return 0;
    }*/

/*    Circle c;
        for(int i = RIGHE-1 ; i >= 0; i--) {
        c = scacchiera.get(column).get(i);
        if (c.getFill().equals(Paint.valueOf("DODGERBLUE"))) {
            if (giocatore.getPlayerMove() == 1) {
                c.setFill(Paint.valueOf("RED"));
            } else {
                c.setFill(Paint.valueOf("YELLOW"));
            }
            giocatore.ChangePlayer();
            break;
        }
    }*/



    private void gameOver(int winner) {
        if(winner == 1){
            PlayButton.setDisable(true);
            ResetButton.setDisable(false);
            gameLabel.setText("Il vinciotore è il giocatore 1");
            //System.out.println("Il vinciotore è il giocatore 1");
        }
        else if(winner == 2){
            PlayButton.setDisable(true);
            ResetButton.setDisable(false);
            gameLabel.setText("Il vincitore è il giocatore 2");

        }
        else
            if(checkScacchiera(COLONNE-1,RIGHE-1)){
                PlayButton.setDisable(false);
                ResetButton.setDisable(false);
                gameLabel.setText("PAREGGIO");
            }
    }


    private boolean checkScacchiera(int column, int row) {
        Circle c;
        for(int i = 0; i <= column; i++){
            for (int j= 0; j <= row; j++) {
                c =  scacchiera.get(i).get(j);
                if (c.getFill().equals(Paint.valueOf("DODGERBLUE"))) {

                        return false;
                    }

            }
        }

        return true;
    }



}