import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;

import java.util.Scanner;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class LoggingCompanyGUI {

	protected Shell shell;
	private Text txtLength;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			LoggingCompanyGUI window = new LoggingCompanyGUI();
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
		
		Label lblEnterTheLength = new Label(shell, SWT.NONE);
		lblEnterTheLength.setBounds(0, 28, 156, 15);
		lblEnterTheLength.setText("Enter the length of the logs:");
		
		txtLength = new Text(shell, SWT.BORDER);
		txtLength.setBounds(179, 25, 76, 21);
		
		Label lblAnswer = new Label(shell, SWT.NONE);
		lblAnswer.setBounds(10, 88, 212, 15);
		lblAnswer.setText("The Number of logs that can be held:");
		
		Button btnCalculate = new Button(shell, SWT.NONE);
		btnCalculate.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// creates a new scanner
				Scanner scanner = new Scanner( System.in );
				
				// assign the value input by the user to a+ variable
					 double length =  Double.parseDouble(txtLength.getText());				     // calculates the number of logs that can be held
					 double weight = length * 20;
					 double number_Of_Logs = 1100 / weight ;
					 // displays the number of logs.
					 lblAnswer.setText("The number of logs that can be held:" + number_Of_Logs);

			}
		});
		btnCalculate.setBounds(10, 137, 75, 25);
		btnCalculate.setText("Calculate");

	}
}
