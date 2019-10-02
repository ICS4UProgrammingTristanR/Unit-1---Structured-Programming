package RockPaperScissors;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class RockPaperScissors {
	boolean playerRock = false;
	boolean playerPaper = false;
	boolean playerScissors = false;
	boolean computerRock = false;
	boolean computerPaper = false;
	boolean computerScissors = false;
	String game = ("tie");
	


	protected Shell shell;

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
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		
		Group grpPlayersChoice = new Group(shell, SWT.NONE);
		grpPlayersChoice.setText("Player's Choice");
		grpPlayersChoice.setBounds(0, 10, 222, 85);
		
		Button btnPlayerRock = new Button(grpPlayersChoice, SWT.RADIO);
		btnPlayerRock.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				 playerRock = true;
				 playerPaper = false;
				 playerScissors = false;

			}
		});
		btnPlayerRock.setBounds(10, 22, 90, 16);
		btnPlayerRock.setText("Rock");
		
		Button btnPlayerPaper = new Button(grpPlayersChoice, SWT.RADIO);
		btnPlayerPaper.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				 playerRock = false;
				 playerPaper = true;
				 playerScissors = false;
			}
		});
		btnPlayerPaper.setBounds(10, 44, 90, 16);
		btnPlayerPaper.setText("Paper");
		
		Button btnPlayerScissors = new Button(grpPlayersChoice, SWT.RADIO);
		btnPlayerScissors.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				 playerRock = false;
				 playerPaper = false;
				 playerScissors = true;
			}
		});
		btnPlayerScissors.setBounds(10, 66, 90, 16);
		btnPlayerScissors.setText("Scissors");
		
		Group grpPlay = new Group(shell, SWT.NONE);
		grpPlay.setText("Play");
		grpPlay.setBounds(0, 189, 222, 72);
		
		Label lblPlayerScore = new Label(grpPlay, SWT.NONE);
		lblPlayerScore.setBounds(10, 24, 82, 15);
		lblPlayerScore.setText("Player Score:");
		
		Label lblComputerScore = new Label(grpPlay, SWT.NONE);
		lblComputerScore.setText("Computer's Score:");
		lblComputerScore.setBounds(10, 45, 110, 15);
		
		Button btnPlay = new Button(grpPlay, SWT.NONE);
		btnPlay.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
			// generates a random number to determine the computer's choice
				int randomChoice = (int)(Math.random() * 3 + 1);
				
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
				
				if (playerRock == true && computerRock == true)
				{
					game = tie;
				}
			}
		});
		btnPlay.setBounds(137, 14, 75, 25);
		btnPlay.setText("Play");
		
		Button btnNext = new Button(grpPlay, SWT.NONE);
		btnNext.setBounds(137, 47, 75, 25);
		btnNext.setText("Next");
		
		Group grpComputersChoice = new Group(shell, SWT.NONE);
		grpComputersChoice.setBounds(0, 101, 222, 89);
		grpComputersChoice.setText("Computer's Choice");
		
		Button btnComputerScissors = new Button(grpComputersChoice, SWT.RADIO);
		btnComputerScissors.setLocation(10, 63);
		btnComputerScissors.setSize(90, 16);
		btnComputerScissors.setText("Scissors");
		
		Button btnComputerPaper = new Button(grpComputersChoice, SWT.RADIO);
		btnComputerPaper.setLocation(10, 41);
		btnComputerPaper.setSize(90, 16);
		btnComputerPaper.setText("Paper");
		
		Button btnComputerRock = new Button(grpComputersChoice, SWT.RADIO);
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
