/*
 * Display.java
 */
package FinalProject;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Will display the main board used in the minigame as well as a text box
 * when text is required to be shown on screen.
 * @author Lukas Fuller and Alan Morrison
 */

public class Display extends Application {
    
    @Override // Override the start method in the Application class
    
    public void start(Stage primaryStage) {
        
        // Create a pane 
        BorderPane pane = new BorderPane();

        // Create the board & TextFields
        pane.setCenter(new boardProperties("Board"));
        pane.setBottom(new textProperties("TextField"));
        

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("FinalProject"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

/**
 * Calls the start method, and launches it in main.
 * @param args 
 */
public static void main(String[] args){
    launch(args);
    }
} 


/**
 * Create a board for the players to play within.
 */
class boardProperties extends StackPane {
    public boardProperties(String title) {
        getChildren().add(new Label(title));
        //Remove below once the alignment is good, unless we want to see the border?
        setStyle("-fx-border-color: black");
        setPadding(new Insets(250, 500, 250, 500));
    }
}


/**
 * Create a text field that will display information to the player.
 */
class textProperties extends StackPane{
    public textProperties(String title){
        getChildren().add(new Label(title));
        //Remove below once the alignment is good, unless we want to see the border?
        setStyle("-fx-border-color: green");
        setPadding(new Insets(10, 10, 10, 10)); 
    }
}



