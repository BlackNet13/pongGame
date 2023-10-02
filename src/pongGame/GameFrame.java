package pongGame;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class GameFrame extends JFrame { //it's the frame for the min/max screen and close button, holds the game panel
	
	GamePanel panel;
	
	GameFrame(){ //constructor
		panel = new GamePanel();
		this.add(panel);
		this.setTitle("Pong Game");
		this.setResizable(false);
		this.setBackground(Color.black);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack(); //fit the gameframe according to the game panel
		this.setVisible(true);
		this.setLocationRelativeTo(null); //sets location of screen to center
	}

}
