/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Alan
 */
public class FinalProject extends Application {
    
    Scene scene;
    @Override
    public void start(Stage primaryStage) {
        
        Pane titleScreen = new Pane();
        Button start = new Button();
        start.setText("START GAME");
        start.setOnAction((EventHandler<ActionEvent>) new Tutorial());
        
        StackPane root = new StackPane();
        root.getChildren().add(start);
        
        scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public class Tutorial
    {
        Tutorial()
        {
            StackPane tutorialPane = new StackPane();
            //Text Box Listing Everything
            
            //Button Bottom Right saying "READY"
            Button toPieceSelection = new Button();
            toPieceSelection.setText("READY");
            toPieceSelection.setOnAction((EventHandler<ActionEvent>) new PieceScreen());
            scene = new Scene(tutorialPane, 300, 250);
            
            
        }
    }
    
    public class PieceScreen
    {
        //            StackPane pieceScreen = new StackPane();
//            //3 Combo boxes 
            private String[] smallPieces = {"Small 1", "Small 2", "Small 3"};
            private String[] mediumPieces = {"Medium 1", "Medium 2", 
                "Medium 3"};
            private String[] largePieces = {"Large 1", "Large 2", "Large 3"};
//            
//            
//            private ImageView[] smallMovement = {
//            new ImageView("file:image/ca.gif"),
//            new ImageView("file:image/china.gif"), 
//            new ImageView("file:image/denmark.gif"), 
//            new ImageView("file:image/us.gif")};
//            private ImageView[] smallAttacks = {
//            new ImageView("file:image/ca.gif"),
//            new ImageView("file:image/china.gif"), 
//            new ImageView("file:image/denmark.gif"), 
//            new ImageView("file:image/us.gif")};
//            private ImageView[] mediumMovement = {
//            new ImageView("file:image/ca.gif"),
//            new ImageView("file:image/china.gif"), 
//            new ImageView("file:image/denmark.gif"), 
//            new ImageView("file:image/us.gif")};
//            private ImageView[] mediumAttacks = {
//            new ImageView("file:image/ca.gif"),
//            new ImageView("file:image/china.gif"), 
//            new ImageView("file:image/denmark.gif"), 
//            new ImageView("file:image/us.gif")};
//            private ImageView[] largeMovement = {
//            new ImageView("file:image/ca.gif"),
//            new ImageView("file:image/china.gif"), 
//            new ImageView("file:image/denmark.gif"), 
//            new ImageView("file:image/us.gif")};
//            private ImageView[] largeAttacks = {
//            new ImageView("file:image/ca.gif"),
//            new ImageView("file:image/china.gif"), 
//            new ImageView("file:image/denmark.gif"), 
//            new ImageView("file:image/us.gif")};
        
        // Declare and create a description pane
        private DescriptionPane descriptionPane = new DescriptionPane();
        private ComboBox<String> smallCombo = new ComboBox<>();
        private ComboBox<String> mediumCombo = new ComboBox<>();
        private ComboBox<String> largeLarge = new ComboBox<>();
        
        PieceScreen() //public void start()
        {
            StackPane piecePane = new StackPane();
            setDisplay(0);
            ObservableList<String> items = 
             FXCollections.observableArrayList(smallPieces);
            smallCombo.setOnAction(e -> setDisplay(
                    items.indexOf(smallCombo.getValue())));
            
            Button toStageSelect = new Button();
            toStageSelect.setText("READY");
            toStageSelect.setOnAction((EventHandler<ActionEvent>) new StageSelect());
            scene = new Scene(piecePane, 300, 250);
        
        }
        /** Set display information on the description pane */
        public void setDisplay(int index) 
        {
            
            //We have 3 Combo boxes within the 1 pane
//            descriptionPane.setTitle(flagTitles[index]);
//            descriptionPane.setImageView(flagImage[index]);
//            descriptionPane.setDescription(flagDescription[index]);
        }
    }
    
    public class StageSelect
    {
        DoubleLinkedList stages = new DoubleLinkedList();
        ImageView stagePreview;
        public StageSelect()
        {
            StackPane stagePane = new StackPane();
            //Title for Stage
            //ImageView displaying Stage design
            
            //Left Button
            Button left = new Button();
            left.setOnAction(e -> getPreviousStage());
            //Right Button
            Button right = new Button();
            right.setOnAction(e -> getNextStage());
            
            scene = new Scene(stagePane, 350, 250);
        }
        public void getNextStage()
        {
            //Grab stages[i+1] title
            //Grab stages[i+1] stagePreview
            
        }
        public void getPreviousStage()
        {
            //Grab stages[i-1] title
            //Grab stages[i-1] stagePreview
        }
    }
    
    public class Game
    {
        public Game()
        {
            
        }
    }
    
    public class GameManager
    {
        public GameManager()
        {
            
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}


