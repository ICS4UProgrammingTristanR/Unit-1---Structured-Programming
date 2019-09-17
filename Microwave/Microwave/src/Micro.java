import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Micro {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		boolean pizzaSelected;
		try {
			Micro window = new Micro();
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
		lblNewLabel.setBounds(10, 22, 111, 15);
		lblNewLabel.setText("Select Which Food:");
		
		Button btnSub = new Button(shell, SWT.NONE);
		btnSub.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				 subSelected = true;
				 pizzaSelected = false;
				 soupSelected = false;
				
				
			}
		});
		btnSub.setBounds(300, 22, 75, 25);
		btnSub.setText("Sub");
		
		Button btnPizza = new Button(shell, SWT.NONE);
		btnPizza.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				 subSelected = false;
				 pizzaSelected = true;
				 soupSelected = false;
			}
		});
		btnPizza.setBounds(10, 70, 75, 25);
		btnPizza.setText("Pizza");
		
		Button btnSoup = new Button(shell, SWT.NONE);
		btnSoup.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				 subSelected = false;
				 pizzaSelected = false;
				 soupSelected = true;
			}
		});
		btnSoup.setBounds(300, 70, 75, 25);
		btnSoup.setText("Soup");
		
		Label lblNewLabel_1 = new Label(shell, SWT.NONE);
		lblNewLabel_1.setBounds(10, 133, 131, 15);
		lblNewLabel_1.setText("Select number of items:");
		
		Button btnOne = new Button(shell, SWT.NONE);
		btnOne.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int totalTime = 0;
				
				
				if (pizzaSelected == true ) 
				{ totalTime = 45 * 1 ;
				}
				
			}
		});
		btnOne.setBounds(300, 133, 75, 25);
		btnOne.setText("1");
		
		Button btnTwo = new Button(shell, SWT.NONE);
		btnTwo.setBounds(10, 177, 75, 25);
		btnTwo.setText("2");
		
		Button btnThree = new Button(shell, SWT.NONE);
		btnThree.setBounds(300, 177, 75, 25);
		btnThree.setText("3");
		
		Label lblNewLabel_2 = new Label(shell, SWT.NONE);
		lblNewLabel_2.setBounds(10, 214, 146, 15);
		lblNewLabel_2.setText("Total time in Microwave is:");
		
		Label lblAnswer = new Label(shell, SWT.NONE);
		lblAnswer.setBounds(299, 214, 89, 15);
		lblAnswer.setText("--");

	}
}
