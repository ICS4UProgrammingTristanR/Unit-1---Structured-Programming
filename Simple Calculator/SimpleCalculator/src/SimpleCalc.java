/*
 * Created by: Tristan Royer
 * Created on: Sept-2019
 * Created for: ICS4U
 * Day #6 (Simple Calculator)
 * This program calculates a value using an operation chosen by the user
*/
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class SimpleCalc {

	protected Shell shell;
	private Text firstNumber;
	private Text secondNumber;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			SimpleCalc window = new SimpleCalc();
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
		shell.setText("Simple Calc");
		
		Label lblFirstNumber = new Label(shell, SWT.NONE);
		lblFirstNumber.setBounds(21, 10, 76, 15);
		lblFirstNumber.setText("First Number");
		
		firstNumber = new Text(shell, SWT.BORDER);
		firstNumber.setBounds(21, 31, 76, 21);
		
		secondNumber = new Text(shell, SWT.BORDER);
		secondNumber.setBounds(21, 85, 76, 21);
		
		Label lblSecondNumber = new Label(shell, SWT.NONE);
		lblSecondNumber.setBounds(21, 64, 91, 15);
		lblSecondNumber.setText("Second Number");
		
		final Label lblAnswer = new Label(shell, SWT.NONE);
		lblAnswer.setText("The Answer is :");
		lblAnswer.setFont(SWTResourceManager.getFont("Stylus BT", 25, SWT.NORMAL));
		lblAnswer.setBounds(32, 181, 392, 70);
		
		Button btnMinus = new Button(shell, SWT.NONE);
		btnMinus.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// create variables
				int number1,number2;
				// try to get the values from the user
				try {
					 number1 = Integer.parseInt(firstNumber.getText());
					
					}
				catch (Exception exc)
				{
					MessageDialog.openError(shell,"Error", "bad first number");
					return;
				}
				try {
					 number2 = Integer.parseInt(secondNumber.getText());
					
					}
				catch (Exception exc)
				{
					MessageDialog.openError(shell,"Error", "bad second number");
					return;
				}
				// calculate the answer
				int answer = number1 - number2;
				lblAnswer.setText("The answer is:" + answer);
			}
		});
		btnMinus.setBounds(22, 112, 75, 25);
		btnMinus.setText("-");
		
		Button btnPlus_1 = new Button(shell, SWT.NONE);
		btnPlus_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// create variables

				int number1,number2;
				// try to get the values from the user
				try {
					 number1 = Integer.parseInt(firstNumber.getText());
					
					}
				catch (Exception exc)
				{
					MessageDialog.openError(shell,"Error", "bad first number");
					return;
				}
				try {
					 number2 = Integer.parseInt(secondNumber.getText());
					
					}
				catch (Exception exc)
				{
					MessageDialog.openError(shell,"Error", "bad second number");
					return;
				}
				// calculate the answer
				int answer = number1 + number2;
				lblAnswer.setText("The answer is:" + answer);
			}
		});
		btnPlus_1.setBounds(103, 112, 75, 25);
		btnPlus_1.setText("+");
		
		Button btnMultiply_2 = new Button(shell, SWT.NONE);
		btnMultiply_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// create variables

				int number1,number2;
				// try to get the values from the user

				try {
					 number1 = Integer.parseInt(firstNumber.getText());
					
					}
				catch (Exception exc)
				{
					MessageDialog.openError(shell,"Error", "bad first number");
					return;
				}
				try {
					 number2 = Integer.parseInt(secondNumber.getText());
					
					}
				catch (Exception exc)
				{
					MessageDialog.openError(shell,"Error", "bad second number");
					return;
				}
				// calculate the answer

				int answer = number1 * number2;
				lblAnswer.setText("The answer is:" + answer);
			}
		});
		btnMultiply_2.setBounds(184, 112, 75, 25);
		btnMultiply_2.setText("*");
		
		Button btnDivide_3 = new Button(shell, SWT.NONE);
		btnDivide_3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// create variables

				int number1,number2;
				// try to get the values from the user

				try {
					 number1 = Integer.parseInt(firstNumber.getText());
					
					}
				catch (Exception exc)
				{
					MessageDialog.openError(shell,"Error", "bad first number");
					return;
				}
				try {
					 number2 = Integer.parseInt(secondNumber.getText());
					
					}
				catch (Exception exc)
				{
					MessageDialog.openError(shell,"Error", "bad second number");
					return;
				}
				// calculate the answer

				int answer = number1 / number2;
				lblAnswer.setText("The answer is:" + answer);
			}
		});
		btnDivide_3.setBounds(265, 112, 75, 25);
		btnDivide_3.setText("/");
		
		

	}
}
