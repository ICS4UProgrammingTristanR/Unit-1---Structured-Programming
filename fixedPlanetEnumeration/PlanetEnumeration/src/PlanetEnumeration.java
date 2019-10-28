import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class PlanetEnumeration {
	public enum Planet {
	    MERCURY, VENUS, EARTH, MARS,JUPITER,
	    SATURN, URANUS, NEPTUNE;
	}

	

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			PlanetEnumeration window = new PlanetEnumeration();
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
		
		List lstPlanets = new List(shell, SWT.BORDER);
		lstPlanets.setTouchEnabled(true);
		lstPlanets.setItems(new String[] {});
		lstPlanets.setBounds(25, 86, 96, 107);
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setBounds(10, 29, 286, 20);
		lblNewLabel.setText("Click on the planet you would like to visit:");
		
		Button btnEarth = new Button(shell, SWT.NONE);
		btnEarth.setTouchEnabled(true);
		btnEarth.setBounds(292, 143, 90, 30);
		btnEarth.setText("Just Earth");
		
		Button btnProcess = new Button(shell, SWT.NONE);
		btnProcess.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				for (Planet singlePlanet : Enum.GetValues(typeof(Planet)))
				{
					this.lstPlanets.Items.Add(Convert.ToString(singlePlanet));
				}
				
				// determine what you selected
				String selectedValue;
				int planetNumber;
				Planet thePlanetSelected;
				
				selectedValue = Convert.ToString(this.lstPlanets.SelectedItem);
				thePlanetSelected = (Planet) Enum.Parse(typeof(Planet) , selectValue , true);
				planetNumber = (int) (thePlanetSelected);
				
				MessageBox.Show("You would like to go to" + selectedValue + ", planet #" + planetNumber, "Enum Planet");
			}
		});
		btnProcess.setBounds(31, 213, 90, 30);
		btnProcess.setText("Process");

	}
}
