import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Group;

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
		

		final Label lblAnswer = new Label(shell, SWT.NONE);
		lblAnswer.setBounds(289, 236, 89, 15);
		lblAnswer.setText("--");
		
		Label lblNewLabel_1 = new Label(shell, SWT.NONE);
		lblNewLabel_1.setBounds(10, 133, 131, 15);
		lblNewLabel_1.setText("Select number of items:");
		
		Label lblNewLabel_2 = new Label(shell, SWT.NONE);
		lblNewLabel_2.setBounds(10, 236, 146, 15);
		lblNewLabel_2.setText("Total time in Microwave is:");
		
		Group group = new Group(shell, SWT.NONE);
		group.setBounds(10, 43, 284, 82);
		
		Button radSub = new Button(group, SWT.RADIO);
		radSub.setBounds(0, 10, 90, 16);
		radSub.setText("Sub");
		
		Button radPizza = new Button(group, SWT.RADIO);
		radPizza.setBounds(184, 10, 90, 16);
		radPizza.setText("Pizza");
		
		Button radSoup = new Button(group, SWT.RADIO);
		radSoup.setBounds(0, 60, 90, 16);
		radSoup.setText("Soup");
		
		Group group_1 = new Group(shell, SWT.NONE);
		group_1.setBounds(10, 148, 284, 82);
		
		Button btnOne = new Button(group_1, SWT.NONE);
		btnOne.setBounds(10, 10, 75, 25);
		btnOne.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int totalTime ;
				
				
				if (e.getSource() == radPizza) 
				{ 
					totalTime = 45 * 1 ;
					lblAnswer.setText("the answer is:" + totalTime) ;
				
				}
				if (e.getSource() == radSub) 
				{ 
					totalTime = 60 * 1 ;
					lblAnswer.setText("the answer is:" + totalTime) ;
				
				}
				if (radSoup.isChecked()){
				 
					totalTime = 100 * 1 ;
					lblAnswer.setText("the answer is:" + totalTime) ;
				
				}
				
				
				
			}
		});
		btnOne.setText("1");
		
		Button btnTwo = new Button(group_1, SWT.NONE);
		btnTwo.setBounds(107, 10, 75, 25);
		btnTwo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnTwo.setText("2");
		
		Button btnThree = new Button(group_1, SWT.NONE);
		btnThree.setBounds(199, 10, 75, 25);
		btnThree.setText("3");
		

	}
}
