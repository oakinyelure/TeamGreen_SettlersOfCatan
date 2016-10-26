package game;

import gui.GameWindow;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.SwingUtilities;

import board.DevCard;
import gui.PlayerRegistration;

/**
 * Created by Olusegun on 9/27/2016.
 * This is the entry point of the Game.
 */
public class GameRunner {
    private static Player currentPlayer;
    private static int numberPlayers;
    private static int index = 0;
    private static ArrayList<Player> players = new ArrayList<Player>();
    private static Game game;
    private static Player winner;
    public static ArrayList<String> names;

    public static void main(String[] args) {
        players.add(new Player("A",Color.RED));
        players.add(new Player("B",/*(String)names.userNames.get(1),*/Color.LIGHT_GRAY));
        players.add(new Player("C",/*(String)names.userNames.get(2),*/Color.GREEN));
        players.add(new Player("D",/*String)names.userNames.get(3),*/Color.YELLOW));

        numberPlayers = players.size();

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                GameWindow tmp = new GameWindow(players);
                game = tmp.getBoard().getGame();
            }
        });
    }


    public static Player getCurrentPlayer() {
        return currentPlayer;
    }

    public static void nextPlayer() {
        currentPlayer = players.get((index + 1) % 4);
        index = (index + 1) % 4;
    }

    public static void prevPlayer() {
        currentPlayer = players.get((index - 1) % 4);
        index = (index - 1) % 4;
    }

    public static void setFirstPlayer() {
        currentPlayer = players.get(0);
    }

    public static void setWinner(Player p) {
        winner = p;
    }

    public static Player getWinner() {
        return winner;
    }

    public static int getNumbPlayers() {
        return numberPlayers;
    }

    public static Player getPlayer(int i) {
        return players.get(i);
    }
}
