package myrmidonChess;

import java.awt.*;
import javax.swing.*;

public class GUI {
	
	private JFrame frame;

	// Launch the application
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	// Create the application
	public GUI() {
		initialize();
	}
	
	// Initialize the contents of the frame
	private void initialize() {
		frame = new JFrame("Myrmidon Chess");
		frame.setBounds(100, 100, 568, 431);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));
		
		// Create a split pane
		JSplitPane splitPane = new JSplitPane();
		frame.getContentPane().add(splitPane);
		
		// Insert chess board panel to the left of split pane
		splitPane.setLeftComponent(Board.insertPanel());
		
		// Insert player and game information to the right of split pane
		// ******** TO-DO ********
		// THIS IS JUST A STUB //
		JPanel information = new JPanel();
		information.setLayout(new BoxLayout(information, BoxLayout.Y_AXIS));
		splitPane.setRightComponent(information);
		information.add(new JLabel("Player 1"));
		information.add(new JLabel("Player 2"));
		information.add(new JLabel("Game Time: 00:00:00"));
		information.add(new JLabel("Current Turn: Player 1"));
		// THIS IS JUST A STUB //
		// ******** TO-DO ********
		
		// Insert JMenuBar
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu gameMenu = new JMenu("Game");
		menuBar.add(gameMenu);
		gameMenu.add(new JMenuItem("New Game"));
		gameMenu.add(new JMenuItem("Save Game"));
		gameMenu.add(new JMenuItem("Resign"));
		gameMenu.add(new JMenuItem("Exit"));
		
		JMenu helpMenu = new JMenu("Help");
		menuBar.add(helpMenu);
		helpMenu.add(new JMenuItem("Tutorial"));
	}
}
