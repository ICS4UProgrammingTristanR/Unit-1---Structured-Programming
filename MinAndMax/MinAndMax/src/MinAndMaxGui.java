import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.List;

public class MinAndMaxGui {
public int minNumber = 1000000;
public int maxNumber = -1;
public int [] allNumbersArray;
public int getMin (int[] numbersArray)
{
	int minimumNumber = 999999999;
	for (int partArray = 0 ; partArray < numbersArray.length; partArray ++)
	{
	if (numbersArray[partArray] < minimumNumber )
	{
		minimumNumber = numbersArray[partArray];
	}
	}
	 return minimumNumber;
}


public int getMax (int[] numbersArray)
{
	int maximumNumber = 0;
	for (int partArray = 0 ; partArray < numbersArray.length; partArray++)
	{
	if (numbersArray[partArray] > maximumNumber )
	{
		maximumNumber = numbersArray[partArray];
	}
	}
	return maximumNumber;
	
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
		
		Label lblMin = new Label(shlMixandmax, SWT.NONE);
		lblMin.setBounds(21, 122, 164, 15);
		lblMin.setText("--");
		
		Label lblMax = new Label(shlMixandmax, SWT.NONE);
		lblMax.setBounds(21, 168, 164, 15);
		lblMax.setText("--");
		

		List lstNumbers = new List(shlMixandmax, SWT.BORDER);
		lstNumbers.setBounds(153, 31, 125, 199);
		
		txtNumber = new Text(shlMixandmax, SWT.BORDER);
		txtNumber.setBounds(302, 26, 111, 204);
		
		Button btnGenerate = new Button(shlMixandmax, SWT.NONE);
		btnGenerate.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				String outputString = "";
				allNumbersArray = new int [10];
				int randomChoice = (int)(Math.random() * 3 + 1);
				for (int counter = 0;counter < allNumbersArray.length;counter++)
				{
					allNumbersArray[counter] = (int)(Math.random() * 10 + 1);
					outputString += allNumbersArray[counter] + " \r\n";
					
				}
				txtNumber.setText(outputString);
				lstNumbers.add(outputString + "\r\n");
				maxNumber = getMax (allNumbersArray);
				minNumber = getMin (allNumbersArray);
				
				lblMin.setText ("The Max Number is :" + minNumber);
				lblMax.setText ("The Max Number is :" + maxNumber);
				
				
				
			}
		});
		btnGenerate.setBounds(21, 26, 107, 73);
		btnGenerate.setText("Generate \r\nNumber");
		
	
		
		
		

	}
}
