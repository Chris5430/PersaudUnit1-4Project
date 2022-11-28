package com.example.persaudunit14project;


import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.event.Event;
import org.w3c.dom.events.MouseEvent;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
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

        EventHandler<javafx.scene.input.MouseEvent> event = new <EventHandler<javafx.event.Event>(){
            @Override
            public void handle(MouseEvent ) {
                System.out.print("event");
            }
        };
    }

    public static void main(String[] args) {
        launch();

    }
}