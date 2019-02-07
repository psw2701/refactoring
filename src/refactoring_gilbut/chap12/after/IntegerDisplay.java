package refactoring_gilbut.chap12.after;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import refactoring_gilbut.chap12.after.Graph.GraphType;

public class IntegerDisplay extends JFrame implements ActionListener, ValueListener {

	private JPanel contentPane;
	private JButton btnIncrement;
	private JButton btnDecrement;

	private Value value;

	private JLabel lblOctal;
	private JLabel lblDecimal;
	private JLabel lblHexadecimal;

	private Graph circlePanel;
	private Graph rectPanel;

	public IntegerDisplay() {
		value = new Value(0);
		value.addListener(this);
		initComponent();
		value.addListener(circlePanel);
		value.addListener(rectPanel);
	}

	private void initComponent() {
		setTitle("IntegerDisplay");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));

		JLabel titleOctal = new JLabel("Octal:");
		contentPane.add(titleOctal);

		lblOctal = new JLabel("0");
		contentPane.add(lblOctal);

		JLabel titleDecimal = new JLabel("Decimal:");
		contentPane.add(titleDecimal);

		lblDecimal = new JLabel("0");
		contentPane.add(lblDecimal);

		JLabel titleHexadecimal = new JLabel("Hexadecimal:");
		contentPane.add(titleHexadecimal);

		lblHexadecimal = new JLabel("0");
		contentPane.add(lblHexadecimal);

		btnIncrement = new JButton("+");
		btnIncrement.addActionListener(this);
		contentPane.add(btnIncrement);

		btnDecrement = new JButton("-");
		btnDecrement.addActionListener(this);
		contentPane.add(btnDecrement);

		circlePanel = Graph.createGraph(GraphType.CIRCLE, 100, 100);
		rectPanel = Graph.createGraph(GraphType.RECTANGLE, 100, 50);

		contentPane.add(circlePanel);
		contentPane.add(rectPanel);
		pack();
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnIncrement) {
			setValue(value.getValue() + 1);
		}
		if (e.getSource() == btnDecrement) {
			setValue(value.getValue() - 1);
		}
	}

	private void setValue(int value) {
		this.value.setValue(value);
	}

	public int getValue() {
		return value.getValue();
	}

	@Override
	public void valueChanger(ValuechangeEvent e) {
		if (e.getSource() == this.value) {
			Value v = e.getSource();
			lblOctal.setText(Integer.toOctalString(v.getValue()));
			lblDecimal.setText(Integer.toString(v.getValue()));
			lblHexadecimal.setText(Integer.toHexString(v.getValue()));
		}
	}

}
