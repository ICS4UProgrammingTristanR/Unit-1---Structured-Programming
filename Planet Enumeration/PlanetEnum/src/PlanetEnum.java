import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.swt.widgets.Tree;

public class PlanetEnum {
	public static enum Planet 
	{    
	    MERCURY ,
	    VENUS,
	    EARTH ,
	    MARS ,
	    SATURN ,
	    URANUS,
	    NEPTUNE ;
	}
	
	 public static Planet planet;
	    
	    public void EnumTest (Planet planet) {
	        this.planet = planet;
	    }

	protected Shell shlPlanetEnumeration;
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			PlanetEnum window = new PlanetEnum();
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
		shlPlanetEnumeration.open();
		shlPlanetEnumeration.layout();
		while (!shlPlanetEnumeration.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlPlanetEnumeration = new Shell();
		shlPlanetEnumeration.setSize(450, 300);
		shlPlanetEnumeration.setText("Planet Enumeration");
		
		Label lblNewLabel = new Label(shlPlanetEnumeration, SWT.NONE);
		lblNewLabel.setBounds(10, 27, 237, 15);
		lblNewLabel.setText("Click on the planet you would like to go to.");
		
		Button btnEarth = new Button(shlPlanetEnumeration, SWT.NONE);
		btnEarth.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnEarth.setBounds(301, 118, 75, 25);
		btnEarth.setText("Just Earth");
		
		List list = new List(shlPlanetEnumeration, SWT.BORDER);
		list.setItems(new String[] {"a"});
		list.setBounds(10, 58, 224, 161);
		formToolkit.adapt(list, true, true);

	}
}
