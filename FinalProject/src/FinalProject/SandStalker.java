/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Alan
 */
public class SandStalker extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        GameManager gManager = new GameManager();
        Scene scene = gManager.getScene();
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

class GameManager
{
    private Scene gameScene;
    private Game game;
    GameManager()
    {
        
    }
    
    public void newGame()
    {
        
    }
    public void quit()
    {
        
    }
    public Game getGame()
    {
        return game;
    }
    public Scene getScene()
    {
        return gameScene;
    }
}

class Game
{
    Game()
    {
        
    }
    public void getBoard()
    {
        
    }
    public void nextTurn()
    {
        
    }
    public void checkForWinner()
    {
        
    }
    public void boardIsUpdated()
    {
        checkForWinner();
    }
    
}

class Board
{
    //2 boards at once. Player and Enemy board
    //movement checks the Player's board
    //Attacking checks Enemy's board
    Board()
    {
        
    }
    Board(int x, int y)
    {
        Square[][] board = new Square[x][y];
    }
}

/**
 * Dictates the properties of an individual square on the gameboard
 * @author Alan
 */
class Square
{
    
    //A square can have both an enemy and an ally on it
    enum State{EMPTY, ENEMY_OCCUPIED, ALLY_OCCUPIED};
    Square()
    {
        
    }
}

//Appearance of Pieces
class PieceAppearance
{
    //if we just want to use png/jpeg for them
   // static final Image small1 = new Image();
   // static final Image medium1 = new Image();
   // static final Image large1 = new Image();
}
