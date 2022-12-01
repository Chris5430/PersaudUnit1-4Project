package com.example.persaudunit14project;


import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Dimension2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.event.Event;
import java.util.Date;


import java.io.IOException;

public class HelloApplication extends Application {
    static int scoreT = 0;




    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Label score = new Label("Score: " + scoreT);
        Runnable countdown = ()->{
            while(true) {
                try{Thread.sleep(100);}catch(InterruptedException a){System.out.println(a);}
                scoreT -= 1;
               // score.setText("Score: " + scoreT);
            }

        };

        Thread thread = new Thread(countdown);
        Rectangle rect1 = new Rectangle(140,400, Color.SADDLEBROWN);
        rect1.setX(120);
        rect1.setY(80);
        Rectangle rect2 = new Rectangle(140, 400, Color.SADDLEBROWN);
        rect2.setX(480);
        rect2.setY(80);
        Rectangle rect3 = new Rectangle(720, 100, Color.GREEN);
        Button easy = new Button();
        easy.setText("Easy");
        Button normal = new Button();
        normal.setText("Normal");
        Button hard = new Button();
        hard.setText("Hard");
        Image alonzo = new Image("C:\\Users\\BT_3W2_31\\Desktop\\Alonzo.PNG");
        ImageView view = new ImageView(alonzo);
        view.setX(225);
        view.setY(225);
        view.setFitWidth(225);
        view.setFitHeight(255);
        Group root = new Group(rect1, rect2, rect3, easy, normal, hard, view);
        easy.setTranslateX(180);
        easy.setTranslateY(60);
        normal.setTranslateX(360);
        normal.setTranslateY(60);
        hard.setTranslateX(540);
        hard.setTranslateY(60);

        Scene scene = new Scene(root, 720, 480, Color.BLACK);
        stage.setTitle("Choose a difficulty");

        stage.setScene(scene);
        stage.show();
        Label youWin = new Label("You win!!");
        youWin.setTranslateX(160);
        youWin.setTranslateY(90);
        Button menu = new Button("Return to menu");
        menu.setTranslateX(360);
        menu.setTranslateY(400);
        youWin.setFont(new Font("Arial", 90));
        Group winGroup = new Group(rect1, rect2, rect3, youWin, menu);
        Scene win = new Scene(winGroup, 720,480, Color.GREEN);
        easy.setOnAction(e->{
            System.out.println("Easy");



            thread.start();
            Group root1 = new Group(rect1, rect2, rect3, score, view);
            Color color;
            Alonzo alonzo1 = new Alonzo(1, true, score);
            if(alonzo1.getDayOrNight()){
                color = Color.DARKCYAN;
            }else{
                color = Color.BLACK;
            }
            Scene easyMode = new Scene(root1, 720, 480, color);
            stage.setScene(easyMode);
            view.setFitHeight(alonzo1.getY());
            view.setFitWidth(alonzo1.getX());
            view.setOnMouseClicked(a->{
                if(a.getX() > view.getX() && a.getX() < view.getX() + view.getFitWidth() && a.getY() > view.getY() && a.getY() < view.getY() + view.getFitHeight()){
                    scoreT += 10;
                    score.setText("Score: " + scoreT);
                    view.setX((Math.random() * (720 - view.getFitWidth())));
                    view.setY((Math.random() * (480 - view.getFitHeight())));
                    if(scoreT >= 300){
                        scoreT = 0;
                        stage.setScene(win);
                        thread.stop();

                        menu.setOnAction(c->{
                            stage.setScene(scene);
                        });
                    }
                }
            });

        });
        normal.setOnAction(b->{
            System.out.println("Normal");
            //score.setTranslateX(-300);
            // score.setTranslateY(-200);
            Group root1 = new Group(rect1, rect2, rect3, score, view);
            Color color;
            Alonzo alonzo1 = new Alonzo(2, true, score);
            if(alonzo1.getDayOrNight()){
                color = Color.DARKCYAN;
            }else{
                color = Color.BLACK;
            }
            Scene normalMode = new Scene(root1, 720, 480, color);
            stage.setScene(normalMode);
            view.setFitHeight(alonzo1.getY());
            view.setFitWidth(alonzo1.getX());
            view.setOnMouseClicked(a->{
                if(a.getX() > view.getX() && a.getX() < view.getX() + view.getFitWidth() && a.getY() > view.getY() && a.getY() < view.getY() + view.getFitHeight()){
                    scoreT += 10;
                    score.setText("Score: " + scoreT);
                    view.setX((Math.random() * (720 - view.getFitWidth())));
                    view.setY((Math.random() * (480 - view.getFitHeight())));
                    if(scoreT >= 300){
                        scoreT = 0;
                        stage.setScene(win);
                        menu.setOnAction(e->{
                            stage.setScene(scene);
                        });
                    }
                }
            });
        });
        hard.setOnAction(c->{
            System.out.println("Hard");
            //score.setTranslateX(-300);
            // score.setTranslateY(-200);
            Group root1 = new Group(rect1, rect2, rect3, score, view);
            Color color;
            Alonzo alonzo1 = new Alonzo(4, false, score);
            if(alonzo1.getDayOrNight()){
                color = Color.DARKCYAN;
            }else{
                color = Color.BLACK;
            }
            Scene hardMode = new Scene(root1, 720, 480, color);
            stage.setScene(hardMode);
            view.setFitHeight(alonzo1.getY());
            view.setFitWidth(alonzo1.getX());
            view.setOnMouseClicked(a->{
                if(a.getX() > view.getX() && a.getX() < view.getX() + view.getFitWidth() && a.getY() > view.getY() && a.getY() < view.getY() + view.getFitHeight()){
                    scoreT += 10;
                    score.setText("Score: " + scoreT);
                    view.setX((Math.random() * (720 - view.getFitWidth())));
                    view.setY((Math.random() * (480 - view.getFitHeight())));
                    if(scoreT >= 300){
                        scoreT = 0;
                        stage.setScene(win);
                        menu.setOnAction(e->{
                           stage.setScene(scene);
                        });
                    }

                }
            });
        });


    }




    public static void main(String[] args) {
        launch();

    }
}