import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTable;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class s4 extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public s4() {
		setLayout(null);
		
		table = new JTable();
		table.setBounds(264, 55, -198, -36);
		add(table);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Usuario voce nao informou o campo data!"); 
			}
		});
		btnNewButton.setBounds(22, 75, 117, 29);
		add(btnNewButton);

	}

}
