package gui;
import game.GameRunner;
import game.Player;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

import lib.GraphPaperLayout;

/**
 * Created by Olusegun on 9/27/2016.
 */
public class BottomBar extends JPanel{
    public ArrayList<ArrayList<KComponent>> playerComponents = new ArrayList<ArrayList<KComponent>>();

    public final static int INTERVAL = 50;
    public final static double LIGHTENING_FACTOR = .05;
    private Timer timer;

    public BottomBar() {
<<<<<<< HEAD
        setBackground(Color.WHITE);
=======
        setBackground(Color.BLACK);
>>>>>>> origin/master

        setLayout(new GraphPaperLayout(new Dimension(GameRunner.getNumbPlayers(),12)));

        //TO DO. Implement for one player at a time
        for (int i = 0; i < GameRunner.getNumbPlayers() ; i++) {
            ArrayList<KComponent> components = new ArrayList<KComponent>();
            components.add(new KComponent(new JLabel(GameRunner.getPlayer(i).getName()), new Rectangle(i,0,1,1)));
            add(components.get(0).getComponent(), components.get(0).getRectangle());
            components.get(0).getComponent().setFont(new Font("Arial",1,20));
            components.get(0).getComponent().setForeground(Color.WHITE);


            for (int k = 1; k <= 11; k++) {
                components.add(new KComponent(new JLabel(""), new Rectangle(i,k,1,1)));
<<<<<<< HEAD
                components.get(k).getComponent().setFont(new Font("Arial", 1, 20));
                components.get(k).getComponent().setForeground(Color.BLACK);
=======
                components.get(k).getComponent().setFont(new Font("Arial", 1, 18));
                //components.get(k).getComponent().setForeground(Color.WHITE);
>>>>>>> origin/master
                add(components.get(k).getComponent(), components.get(k).getRectangle());
            }

            playerComponents.add(components);
        }

        timer = new Timer(INTERVAL,
                new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        for (int i = 0; i < playerComponents.size(); i++) {
                            updatePlayer(playerComponents.get(i), GameRunner.getPlayer(i));
                        }
                    }
                });
        timer.start();

    }

	/*
	public void update(Graphics g) {
		((JLabel)brick.getComponent()).setText("Brick: " + GameRunner.currentPlayer.getNumberResourcesType("BRICK"));
		((JLabel)wool.getComponent()).setText("Wool: " + GameRunner.currentPlayer.getNumberResourcesType("WOOL"));
		((JLabel)ore.getComponent()).setText("Ore: " + GameRunner.currentPlayer.getNumberResourcesType("ORE"));
		((JLabel)grain.getComponent()).setText("Grain: " + GameRunner.currentPlayer.getNumberResourcesType("GRAIN"));
		((JLabel)lumber.getComponent()).setText("Lumber: " + GameRunner.currentPlayer.getNumberResourcesType("LUMBER"));

		add(brick.getComponent(), brick.getRectangle());
		add(wool.getComponent(), wool.getRectangle());
		add(ore.getComponent(), ore.getRectangle());
		add(grain.getComponent(), grain.getRectangle());
		add(lumber.getComponent(), lumber.getRectangle());

	}
	*/

    public void updatePlayer(ArrayList<KComponent> components, Player p){
        ((JLabel)components.get(1).getComponent()).setText("Brick: " + p.getNumberResourcesType("BRICK"));
	        ((JLabel)components.get(1).getComponent()).setForeground(Color.decode("#943126"));
        ((JLabel)components.get(2).getComponent()).setText("Wool: " + p.getNumberResourcesType("WOOL"));
	        ((JLabel)components.get(2).getComponent()).setForeground(Color.GREEN);
        ((JLabel)components.get(3).getComponent()).setText("Ore: " + p.getNumberResourcesType("ORE"));
	        ((JLabel)components.get(3).getComponent()).setForeground(Color.LIGHT_GRAY);
        ((JLabel)components.get(4).getComponent()).setText("Grain: " + p.getNumberResourcesType("GRAIN"));
<<<<<<< HEAD
    ((JLabel)components.get(3).getComponent()).setForeground(Color.decode("#B3B6B7"));
=======
	        ((JLabel)components.get(4).getComponent()).setForeground(Color.ORANGE);
>>>>>>> origin/master
        ((JLabel)components.get(5).getComponent()).setText("Lumber: " + p.getNumberResourcesType("LUMBER"));
	        ((JLabel)components.get(5).getComponent()).setForeground(Color.decode("#562318"));
        ((JLabel)components.get(6).getComponent()).setText("VP: " + p.getVictoryPoints());
            ((JLabel)components.get(6).getComponent()).setForeground(Color.BLUE);
        ((JLabel)components.get(7).getComponent()).setText("Knight: " + p.getDevCardsType("Knight"));
            ((JLabel)components.get(7).getComponent()).setForeground(Color.BLUE);
        ((JLabel)components.get(8).getComponent()).setText("Monopoly: " + p.getDevCardsType("Monopoly"));
            ((JLabel)components.get(8).getComponent()).setForeground(Color.BLUE);
        ((JLabel)components.get(9).getComponent()).setText("Year of plenty: " + p.getDevCardsType("Year of plenty"));
            ((JLabel)components.get(9).getComponent()).setForeground(Color.BLUE);
        ((JLabel)components.get(10).getComponent()).setText("Road building: " + p.getDevCardsType("Road building"));
            ((JLabel)components.get(10).getComponent()).setForeground(Color.BLUE);
        //((JLabel)components.get(11).getComponent()).setText("Victory Point: " + p.getDevCardsType("Victory Point"));
    }



}
