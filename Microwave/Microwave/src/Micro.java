/*
 * Created by: Tristan Royer
 * Created on: Sept-2019
 * Created for: ICS4U
 * Day #7 Microwave
 * This program gets food items from the user and calculates the time it would take to cook.
*/
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
	public boolean pizzaSelected;
	public boolean subSelected;
	public boolean soupSelected;

	

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		
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
		radSub.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// assign values to booleans
				subSelected = true;
				pizzaSelected = false;
				soupSelected = false;
			}
		});
		radSub.setBounds(0, 10, 90, 16);
		radSub.setText("Sub");
		
		Button radPizza = new Button(group, SWT.RADIO);
		radPizza.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// assign values to booleans

				subSelected = false;
				pizzaSelected = true;
				soupSelected = false;
			}
		});
		radPizza.setBounds(184, 10, 90, 16);
		radPizza.setText("Pizza");
		
		Button radSoup = new Button(group, SWT.RADIO);
		radSoup.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// assign values to booleans
				subSelected = false;
				pizzaSelected = false;
				soupSelected = true;
			}
		});
		radSoup.setBounds(0, 60, 90, 16);
		radSoup.setText("Soup");
		
		Group group_1 = new Group(shell, SWT.NONE);
		group_1.setBounds(10, 148, 284, 82);
		
		Button btnOne = new Button(group_1, SWT.NONE);
		btnOne.setBounds(10, 10, 75, 25);
		btnOne.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// declare total time variable

				double totalTime ;
				
				// get the time to cook
				if (pizzaSelected == true) 
				{ 
					totalTime = 45 * 1 ;
					lblAnswer.setText("the answer is:" + totalTime) ;
				
				}
				if (subSelected == true) 
				{ 
					totalTime = 60 * 1 ;
					lblAnswer.setText("the answer is:" + totalTime) ;
				
				}
				if (soupSelected == true){
				 
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
				// declare total time variable

				double totalTime;
				// get the time to cook

				if (pizzaSelected == true) 
				{ 
					totalTime = 45 * 2 * 1.5  ;
					lblAnswer.setText("the answer is:" + totalTime) ;
				
				}
				if (subSelected == true) 
				{ 
					totalTime = 60 * 2 * 1.5 ;
					lblAnswer.setText("the answer is:" + totalTime) ;
				
				}
				if (soupSelected == true){
				 
					totalTime = 100 * 2 * 1.5 ;
					lblAnswer.setText("the answer is:" + totalTime) ;
				
				}
				
			}
		});
		btnTwo.setText("2");
		
		Button btnThree = new Button(group_1, SWT.NONE);
		btnThree.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// declare total time variable
				double totalTime;
				// get the time to cook

				if (pizzaSelected == true) 
				{ 
					totalTime = 45 * 3 * 2  ;
					lblAnswer.setText("the answer is:" + totalTime) ;
				
				}
				if (subSelected == true) 
				{ 
					totalTime = 60 * 3 * 2 ;
					lblAnswer.setText("the answer is:" + totalTime) ;
				
				}
				if (soupSelected == true){
				 
					totalTime = 100 * 3 * 2 ;
					lblAnswer.setText("the answer is:" + totalTime) ;
				
				}
			}
		});
		btnThree.setBounds(199, 10, 75, 25);
		btnThree.setText("3");
		

	}
}
