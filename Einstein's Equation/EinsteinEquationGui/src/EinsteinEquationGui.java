import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;

import java.util.Scanner;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class EinsteinEquationGui {

	protected Shell shell;
	private Text txtMass;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			EinsteinEquationGui window = new EinsteinEquationGui();
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
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setBounds(10, 24, 226, 15);
		lblNewLabel.setText("Please enter the mass of the object below:");
		
		Label lblEnergy = new Label(shell, SWT.NONE);
		lblEnergy.setBounds(10, 177, 247, 15);
		lblEnergy.setText("The energy is:");
		
		txtMass = new Text(shell, SWT.BORDER);
		txtMass.setBounds(10, 61, 76, 29);
		
		Button btnCalculate = new Button(shell, SWT.NONE);
		btnCalculate.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
		
				// assigns the user's answer to a variable
				double m = Double.parseDouble(txtMass.getText());
				// calculates the answer utilizing the equation
				double speedOfLight = (double) Math.pow(10,8);
				double c = 2.998 * speedOfLight;
				double cSquared = Math.pow(c ,2);
				double energy = m * cSquared;
				lblEnergy.setText("The energy is: " + energy );
				
			}
		});
		btnCalculate.setBounds(11, 115, 155, 25);
		btnCalculate.setText("Calculate the Energy");
		
		

	}
}
