/*
 * ShowBorderPane.java
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
 * From the chapter 14, slide 18 for Intermediate Java, but changed to create
 * an example board for the Display.java file.
 * @author Lukas Fuller and Alan Morrison
 */

public class ShowBorderPane extends Application {
    
    @Override // Override the start method in the Application class
    
    public void start(Stage primaryStage) {
        
        // Create a border pane 
        BorderPane pane = new BorderPane();
        BorderPane pane2 = new BorderPane();

        // Create the board & TextFields
        pane.setCenter(new Board("Board")); 
        pane.setBottom(new Text("TextField"));

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("FinalProject"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

/**
 * Calls the pane, and launches it in main.
 * @param args 
 */
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
        //Remove below once the alignment is good, unless we want to see the border?
        setStyle("-fx-border-color: black");
        setPadding(new Insets(250, 500, 250, 500)); //set padding
    }
}


/**
 * Create a text field that will display information to the player.
 */
class Text extends StackPane{
    public Text(String title){
        getChildren().add(new Label(title));
        //Remove below once the alignment is good, unless we want to see the border?
        setStyle("-fx-border-color: green");
        setPadding(new Insets(10, 10, 10, 10)); //set padding
    }
}



