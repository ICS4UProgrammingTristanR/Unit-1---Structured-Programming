import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class StudentAdt {
	
	public class Student
	{
		String firstName;
		String middleName;
		String lastName;
		int grade;
		String identified;
	};
	public static Student singleStudent;

	protected Shell shell;
	private Text txtFirstName;
	private Text txtMiddleName;
	private Text txtLastName;
	private Text txtGrade;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			StudentAdt window = new StudentAdt();
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
		lblNewLabel.setBounds(10, 23, 90, 20);
		lblNewLabel.setText("First Name:");
		
		Label lblNewLabel_1 = new Label(shell, SWT.NONE);
		lblNewLabel_1.setBounds(10, 49, 105, 20);
		lblNewLabel_1.setText("Middle Name:");
		
		Label lblNewLabel_2 = new Label(shell, SWT.NONE);
		lblNewLabel_2.setBounds(10, 72, 90, 20);
		lblNewLabel_2.setText("Last Name:");
		
		txtFirstName = new Text(shell, SWT.BORDER);
		txtFirstName.setBounds(224, 20, 120, 26);
		
		txtMiddleName = new Text(shell, SWT.BORDER);
		txtMiddleName.setBounds(224, 46, 120, 26);
		
		txtLastName = new Text(shell, SWT.BORDER);
		txtLastName.setBounds(224, 72, 120, 26);
		
		Label lblNewLabel_3 = new Label(shell, SWT.NONE);
		lblNewLabel_3.setBounds(10, 98, 70, 20);
		lblNewLabel_3.setText("Grade:");
		
		Label lblNewLabel_4 = new Label(shell, SWT.NONE);
		lblNewLabel_4.setBounds(10, 142, 70, 20);
		lblNewLabel_4.setText("Identified:");
		
		txtGrade = new Text(shell, SWT.BORDER);
		txtGrade.setBounds(224, 98, 120, 26);
		
		Button btnCheck = new Button(shell, SWT.CHECK);
		btnCheck.setBounds(233, 142, 111, 20);
		
		Button btnEnter = new Button(shell, SWT.NONE);
		btnEnter.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				singleStudent.firstName = txtFirstName.getText();
				System.out.println(singleStudent.firstName);
				singleStudent.middleName = txtMiddleName.getText();
				singleStudent.lastName = txtLastName.getText();
				singleStudent.grade = Integer.parseInt(txtGrade.getText());
				
				if (btnCheck != null)
				{
					//
					singleStudent.identified = "not identified";
				}
				else 
				{
					singleStudent.identified = "identified";
				}
				
				
				
				//MessageBox.Show("" + singleStudent.firstName + singleStudent.middleName + singleStudent.lastName + " is in grade " + singleStudent.grade + " and is " + singleStudent.identified);
				
				
				
			}
		});
		btnEnter.setBounds(10, 197, 90, 30);
		btnEnter.setText("Enter");
		
		

	}
}
