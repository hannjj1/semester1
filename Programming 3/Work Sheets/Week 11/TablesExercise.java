package pwindowbuilder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class TablesExercise extends JFrame
{

	private JPanel contentPane;
	private JPanel panel;
	private JTable table;
	private JScrollPane scrollPane;
	private DefaultTableModel tm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					TablesExercise frame = new TablesExercise();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TablesExercise()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(53, 35, 315, 188);
		contentPane.add(panel);
		panel.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(29, 22, 260, 155);
		panel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		tm = new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"First Name", "Last Name", "Phone"
				}
			);
		table.setModel(tm);
		drawTable();
	}
	public void drawTable()
	{
		tm.setRowCount(0);
		for (int i=0;i<150;i++)
		{
			Object[] object = new Object[3];
			object[0] = "people.get(i).getFristName()";
			object[1] = "people.get(i).getLastName()";
			object[2] = "people.get(i).getPhone()";
			//one line for each column mine is dummy data
			tm.addRow(object);
			
			
		}
	}
}
