/*
 * Created by: Tristan Royer
 * Created on: Oct-2019
 * Created for: ICS4U
 * Day #3 (Board Foot)
 * This program takes 2 dimensions which are both 12 and displays a third dimension of 1 inch cubed.
*/
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class BoardFoot {

	protected Shell shlBoardFootDimensions;
	private Text firstDimension;
	private Text secondDimension;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			BoardFoot window = new BoardFoot();
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
		shlBoardFootDimensions.open();
		shlBoardFootDimensions.layout();
		while (!shlBoardFootDimensions.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlBoardFootDimensions = new Shell();
		shlBoardFootDimensions.setSize(450, 300);
		shlBoardFootDimensions.setText("Board Foot Dimensions");
		
		Label lblNewLabel = new Label(shlBoardFootDimensions, SWT.NONE);
		lblNewLabel.setBounds(10, 10, 121, 15);
		lblNewLabel.setText("Enter First Dimension:");
		
		firstDimension = new Text(shlBoardFootDimensions, SWT.BORDER);
		firstDimension.setBounds(137, 10, 76, 21);
		
		Label lblNewLabel_1 = new Label(shlBoardFootDimensions, SWT.NONE);
		lblNewLabel_1.setBounds(10, 49, 139, 15);
		lblNewLabel_1.setText("Enter Second Dimension :");
		
		secondDimension = new Text(shlBoardFootDimensions, SWT.BORDER);
		secondDimension.setBounds(155, 46, 76, 21);
		
		Label lblThirdDimension = new Label(shlBoardFootDimensions, SWT.NONE);
		lblThirdDimension.setBounds(103, 103, 234, 15);
		lblThirdDimension.setText("Third Dimension is:");
		
		Button btnCalculate = new Button(shlBoardFootDimensions, SWT.NONE);
		btnCalculate.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// create variables
				int number1,number2;
				// try to get the values from the user
				try {
					 number1 = Integer.parseInt(firstDimension.getText());
					if (number1 != 12)
					{
						firstDimension.setText("I am invalid");
						lblThirdDimension.setText("ensure both values are 12");

					}
					}
				catch (Exception exc)
				{
					MessageDialog.openError(shlBoardFootDimensions,"Error", "bad first number");
					return;
				}
				try {
					 number2 = Integer.parseInt(secondDimension.getText());
					 if (number2 != 12)
						{
							secondDimension.setText("I am invalid");
							lblThirdDimension.setText("ensure both values are 12");

						}
					}
				catch (Exception exc)
				{
					MessageDialog.openError(shlBoardFootDimensions,"Error", "bad second number");
					return;
				}
				
				// calculate the answer ( 1 inch cubed)
				int answer = number1 / number2;
				if (number1 == 12 && number2 == 12) {
				lblThirdDimension.setText("The answer is:" + answer + "inches ^ 3");
			     
				}
			}
		
	});
		btnCalculate.setBounds(10, 98, 75, 25);
		btnCalculate.setText("Calculate");
		
		

	}
}
