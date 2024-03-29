/*
 * Created by: Tristan Royer
 * Created on: Sept-2019
 * Created for: ICS4U
 * Day #8 Dice Game
 * This program rolls dice for the user
*/
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import java.util.Random;
public class DiceGame {

	protected Shell shlDiceGame;
	// declare globals
	public int numberOfGuesses = 0;
	private Text txtRandom;
	
	

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			DiceGame window = new DiceGame();
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
		shlDiceGame.open();
		shlDiceGame.layout();
		while (!shlDiceGame.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
			
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlDiceGame = new Shell();
		shlDiceGame.setSize(450, 300);
		shlDiceGame.setText("Dice Game");
		
		Label lblNewLabel = new Label(shlDiceGame, SWT.NONE);
		lblNewLabel.setBounds(10, 10, 223, 15);
		lblNewLabel.setText("Enter a random number between 1 and 10:");
		
		final Label lblNumberOfGuesses = new Label(shlDiceGame, SWT.NONE);
		lblNumberOfGuesses.setBounds(10, 127, 189, 15);
		lblNumberOfGuesses.setText("Number of Guesses before correct:");
		
		Label lblRandomNumber = new Label(shlDiceGame, SWT.NONE);
		lblRandomNumber.setBounds(10, 170, 110, 15);
		lblRandomNumber.setText("Random number is:");
		
		txtRandom = new Text(shlDiceGame, SWT.BORDER);
		txtRandom.setBounds(306, 10, 76, 21);
		
		
		
	
		
		
		
		Button btnGuess = new Button(shlDiceGame, SWT.NONE);
		btnGuess.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				// sets the text of the label
				lblNumberOfGuesses.setText("Number of Guesses: " + numberOfGuesses);
				// generates a new random number
				Random rndNumber = new Random();
				int unknownNumber = (rndNumber.nextInt(9) + 1);
				// gets the user's guess
				int userGuess = Integer.parseInt(txtRandom.getText());
				// sees if the user's guess was the random number
				if (userGuess == unknownNumber) {
					numberOfGuesses++;
					lblNumberOfGuesses.setText("Number of Guesses: " + numberOfGuesses);
					lblRandomNumber.setText("Random number is:" + unknownNumber);
					
					}
				
				if (userGuess != unknownNumber)
				{
					numberOfGuesses++;

					lblNumberOfGuesses.setText("Number of Guesses: " + numberOfGuesses);
					lblRandomNumber.setText("Random number is: --");
					
					
				};
				
			}
		});
		btnGuess.setBounds(10, 54, 75, 25);
		btnGuess.setText("Guess");
		
		
		
		

	}
}
