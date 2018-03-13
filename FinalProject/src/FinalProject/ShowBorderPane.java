/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProject;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * From the chapter 14, slide 18 for Intermediate Java.
 * @author Lukas Fuller
 */

public class ShowBorderPane extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a border pane 
    BorderPane pane = new BorderPane();
    BorderPane pane2 = new BorderPane();

    // Create the board
    pane.setCenter(new Board("Board")); 
    pane.setBottom(new Text("TextField"));
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(pane);
    primaryStage.setTitle("FinalProject"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }

public static void main(String[] args){
    launch(args);
    }
} 

/**
 * Create a board for the players to play within.
 */
class Board extends StackPane {
    public Board(String title) {
        getChildren().add(new Label(title));
        //Remove once the alignment is good, unless we want to see the border?
        setStyle("-fx-border-color: black");
        setPadding(new Insets(10, 10, 10, 10));
    }
}

class Text extends StackPane{
    public Text(String title){
        getChildren().add(new Label(title));
        setStyle("-fx-border-color: green");
        setPadding(new Insets(10, 10, 10, 10));
    }
}



