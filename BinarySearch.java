import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BinarySearch extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BinarySearch frame = new BinarySearch();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BinarySearch() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 205, 170));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Binary Search");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(153, 11, 158, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lb1 = new JLabel("Enter Five Numbers");
		lb1.setForeground(new Color(0, 0, 205));
		lb1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lb1.setBounds(10, 57, 158, 20);
		contentPane.add(lb1);
		
		JTextArea ta1 = new JTextArea();
		ta1.setBounds(196, 57, 207, 22);
		contentPane.add(ta1);
		
		JLabel lb2 = new JLabel("Enter Key To Search");
		lb2.setForeground(new Color(0, 0, 205));
		lb2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lb2.setBounds(10, 101, 176, 20);
		contentPane.add(lb2);
		
		JTextArea ta2 = new JTextArea();
		ta2.setBounds(196, 101, 207, 22);
		contentPane.add(ta2);
		
		JLabel lb3 = new JLabel("Results");
		lb3.setForeground(new Color(0, 0, 205));
		lb3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lb3.setBounds(117, 150, 59, 20);
		contentPane.add(lb3);
		
		JTextArea ta3 = new JTextArea();
		ta3.setBounds(196, 150, 207, 22);
		contentPane.add(ta3);
		
		JButton jb1 = new JButton("Binary Search");
		jb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic for Binary search to find key
				String sentence=ta1.getText();
				int key=Integer.valueOf(ta2.getText());
				String arr[]=sentence.split(" ");
				String result="Key not found";
				int low=0;
				int high=arr.length-1;
				int mid;
				while(low<=high)
				{
				mid=(low+high)/2;
				if(key==Integer.valueOf(arr[mid]))
				{
				result="Key found @ index "+mid;
				break;
				}
				else if(key>Integer.valueOf(arr[mid]))
				{
				low=mid+1;
				}
				else
				{
				high=mid-1;
				}
				}
				ta3.setText(result);
			}
		});
		jb1.setBackground(new Color(173, 216, 230));
		jb1.setFont(new Font("Tahoma", Font.BOLD, 18));
		jb1.setForeground(new Color(255, 182, 193));
		jb1.setBounds(143, 216, 168, 31);
		contentPane.add(jb1);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

}
