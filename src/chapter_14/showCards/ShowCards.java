package chapter_14.showCards;

import javafx.application.Application;
import javafx.scene.Scene;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

import javax.swing.filechooser.FileView;


import java.io.File;
import java.util.ArrayList;

public class ShowCards extends Application {

    @Override
    public void start(Stage primaryStage) {
        ArrayList<String> cards = new ArrayList<>();

        for (int i = 0; i < 52; i++) {
            cards.add(String.valueOf(i + 1));
        }

        java.util.Collections.shuffle(cards);

        TilePane root = new TilePane();
        Scene scene = new Scene(root, 600, 800);



        int x = 0;


        while(x<54) {
            File[] file = new File[54]("C:/Users/Anders/Desktop/Cards/NumberedCards/" + cards.get(0) + ".png");
            Image[] image = new Image[54](file.toURI().toString(), 75, 100, false, false);
//Todo 06.11.2018 code arrays to be shown as images on scene

            ImageView iv = new ImageView(image);

            root.getChildren().add(iv);


            primaryStage.setTitle("Exercise14_8");
            primaryStage.setScene(scene);
            primaryStage.show();

            x++;

        }
    }



    public static void main(String[] args) {
        launch(args);
    }

}
