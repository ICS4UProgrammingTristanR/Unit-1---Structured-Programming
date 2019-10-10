import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class MinAndMaxGui {
public int minNumber = 1000000;
public int maxNumber = -1;
public int [] allNumberArray;
public void getMin (int[] numbersArray)
{
	for (int partArray = 0 ; partArray < numbersArray.length; partArray ++  )
	if (numbersArray[partArray] < minNumber )
	{
		minNumber = numbersArray[partArray];
	}
	
}

public void getMax (int[] numbersArray)
{
	for (int partArray = 0 ; partArray < numbersArray.length; partArray ++  )
	if (numbersArray[partArray] > maxNumber )
	{
		maxNumber = numbersArray[partArray];
	}
	
}
	protected Shell shlMixandmax;
	private Text txtNumber;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MinAndMaxGui window = new MinAndMaxGui();
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
		shlMixandmax.open();
		shlMixandmax.layout();
		while (!shlMixandmax.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlMixandmax = new Shell();
		shlMixandmax.setSize(450, 300);
		shlMixandmax.setText("MixAndMax");
		
		Button btnGenerate = new Button(shlMixandmax, SWT.NONE);
		btnGenerate.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
			}
		});
		btnGenerate.setBounds(21, 26, 107, 73);
		btnGenerate.setText("Generate \r\nNumber");
		
		Label lblMin = new Label(shlMixandmax, SWT.NONE);
		lblMin.setBounds(21, 122, 55, 15);
		lblMin.setText("--");
		
		Label lblMax = new Label(shlMixandmax, SWT.NONE);
		lblMax.setBounds(21, 168, 55, 15);
		lblMax.setText("--");
		
		txtNumber = new Text(shlMixandmax, SWT.BORDER);
		txtNumber.setBounds(302, 26, 111, 204);

	}
}
