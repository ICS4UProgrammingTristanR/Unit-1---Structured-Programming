package RockPaperScissors;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.wb.swt.SWTResourceManager;

public class RockPaperScissors {
	// declare public variables
	public boolean playerRock = false;
	public boolean playerPaper = false;
	public boolean playerScissors = false;
	public boolean computerRock = false;
	public boolean computerPaper = false;
	public boolean computerScissors = false;
	public String game;
	public int playerScore = 0;
	public int computerScore = 0;
	


	protected Shell shlRockpaperscissors;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			RockPaperScissors window = new RockPaperScissors();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlRockpaperscissors.open();
		shlRockpaperscissors.layout();
		while (!shlRockpaperscissors.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlRockpaperscissors = new Shell();
		shlRockpaperscissors.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
		shlRockpaperscissors.setSize(450, 300);
		shlRockpaperscissors.setText("RockPaperScissors");
		
		Group grbPlayerChoice = new Group(shlRockpaperscissors, SWT.NONE);
		grbPlayerChoice.setBackground(SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
		grbPlayerChoice.setText("Player's Choice");
		grbPlayerChoice.setBounds(0, 10, 222, 85);
		
		Button btnPlayerRock = new Button(grbPlayerChoice, SWT.RADIO);
		btnPlayerRock.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// acknowledges the player chose rock
				 playerRock = true;
				 playerPaper = false;
				 playerScissors = false;

			}
		});
		btnPlayerRock.setBounds(10, 22, 90, 16);
		btnPlayerRock.setText("Rock");
		
		Button btnPlayerPaper = new Button(grbPlayerChoice, SWT.RADIO);
		btnPlayerPaper.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// acknowledges the player chose paper

				 playerRock = false;
				 playerPaper = true;
				 playerScissors = false;
			}
		});
		btnPlayerPaper.setBounds(10, 44, 90, 16);
		btnPlayerPaper.setText("Paper");
		
		Button btnPlayerScissors = new Button(grbPlayerChoice, SWT.RADIO);
		btnPlayerScissors.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// acknowledges the player chose scissors

				 playerRock = false;
				 playerPaper = false;
				 playerScissors = true;
			}
		});
		btnPlayerScissors.setBounds(10, 66, 90, 16);
		btnPlayerScissors.setText("Scissors");
		

		Label lblGame = new Label(shlRockpaperscissors, SWT.NONE);
		lblGame.setBackground(SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
		lblGame.setBounds(228, 10, 196, 15);
		lblGame.setText("The game is a:");
		
		Group grpPlay = new Group(shlRockpaperscissors, SWT.NONE);
		grpPlay.setBackground(SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
		grpPlay.setText("Play");
		grpPlay.setBounds(0, 189, 222, 72);
		
		Label lblPlayerScore = new Label(grpPlay, SWT.NONE);
		lblPlayerScore.setBounds(10, 24, 82, 15);
		lblPlayerScore.setText("Player Score:");
		
		Label lblComputerScore = new Label(grpPlay, SWT.NONE);
		lblComputerScore.setText("Computer's Score:");
		lblComputerScore.setBounds(10, 45, 110, 15);
		
		Button btnNext = new Button(grpPlay, SWT.NONE);
		
		Button btnPlay = new Button(grpPlay, SWT.NONE);
		btnPlay.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
			
			// generates a random number to determine the computer's choice
				int randomChoice = (int)(Math.random() * 3 + 1);
				
				grbPlayerChoice.setEnabled(false);
				btnPlay.setEnabled(false);
				btnNext.setEnabled(true);
				
				if (randomChoice == 1 )
				{
					// find the choice of the computer
					computerRock = true;
					computerPaper = false;
					computerScissors = false;

					
				}
				if (randomChoice == 2 )
				{
					// find the choice of the computer
					computerRock = false;
					computerPaper = true;
					computerScissors = false;

					
				}
				if (randomChoice == 3 )
				{
					// find the choice of the computer
					computerRock = false;
					computerPaper = false;
					computerScissors = true;

					
				}
				
				//checks the choices of the players to see who won
				if (playerRock == true && computerRock == true)
				{
					game = "draw";
				}
				if (playerRock == true && computerPaper == true)
				{
					game = "Loss";
					computerScore ++;
				}
				if (playerRock == true && computerScissors == true)
				{
					game = "Win";
					playerScore ++;

				}
				
				if (playerPaper == true && computerRock == true)
				{
					game = "Win";
					playerScore ++;

				}
				if (playerPaper == true && computerPaper == true)
				{
					game = "draw";
				}
				if (playerPaper == true && computerScissors == true)
				{
					game = "Loss";
					computerScore ++;

				}
				if (playerScissors == true && computerRock == true)
				{
					game = "Loss";
					computerScore ++;

				}
				if (playerScissors == true && computerPaper == true)
				{
					game = "win";
					playerScore ++;
				}
				if (playerScissors == true && computerScissors == true)
				{
					game = "draw";
				}
				
				
				// displays wheter you won or lost
				lblGame.setText("The game is a : " + game);
				
				
				
			}
		});
		btnPlay.setBounds(137, 14, 75, 25);
		btnPlay.setText("Play");
		
		
		// function for "next" button
		btnNext.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				btnNext.setEnabled(false);
				btnPlay.setEnabled(true);
				grbPlayerChoice.setEnabled(true);
				lblPlayerScore.setText("Player Score:" + playerScore);
				lblComputerScore.setText("Computer Score:" + computerScore);
			}
		});
		btnNext.setEnabled(false);
		btnNext.setBounds(137, 47, 75, 25);
		btnNext.setText("Next");
		
		
		
		Group grpComputersChoice = new Group(shlRockpaperscissors, SWT.NONE);
		grpComputersChoice.setBackground(SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
		grpComputersChoice.setBounds(0, 101, 222, 89);
		grpComputersChoice.setText("Computer's Choice");
		
		Button btnComputerScissors = new Button(grpComputersChoice, SWT.RADIO);
		btnComputerScissors.setEnabled(false);
		btnComputerScissors.setGrayed(true);
		btnComputerScissors.setLocation(10, 63);
		btnComputerScissors.setSize(90, 16);
		btnComputerScissors.setText("Scissors");
		
		Button btnComputerPaper = new Button(grpComputersChoice, SWT.RADIO);
		btnComputerPaper.setEnabled(false);
		btnComputerPaper.setGrayed(true);
		btnComputerPaper.setLocation(10, 41);
		btnComputerPaper.setSize(90, 16);
		btnComputerPaper.setText("Paper");
		
		Button btnComputerRock = new Button(grpComputersChoice, SWT.RADIO);
		btnComputerRock.setEnabled(false);
		btnComputerRock.setGrayed(true);
		btnComputerRock.setLocation(10, 20);
		btnComputerRock.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnComputerRock.setSize(90, 16);
		btnComputerRock.setText("Rock");
		

	}
}
