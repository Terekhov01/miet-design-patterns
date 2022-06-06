import javax.swing.*;
import javax.swing.text.BadLocationException;

import java.awt.Font;
import java.awt.event.*;
import java.awt.FlowLayout;
public class TextEditor extends JFrame{
	JTextArea area;
	JTextArea areaResult;
	String firstText;

	public TextEditor()
	{
		super("TextEditor");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		area = new JTextArea(10, 50);
		area.setText("\t\tКошка сидела (   у   окошка    )      , \n\n    ела консервы  “Тунец в собсственном соку”  .   ..");
		area.setLineWrap(true);
		area.setWrapStyleWord(true);

		areaResult = new JTextArea(10, 50);

		JButton button = new JButton("Check text");

		JPanel contents = new JPanel();

		contents.add(new JScrollPane(area));
		contents.add(button);
		contents.add(new JScrollPane(areaResult));
		

		setContentPane(contents);

		setSize(600, 500);
		setVisible(true);

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onButton();
			}
		});
	}
	
	public void onButton() {
		int last  = area.getLineCount() - 1;
		int start = 0;
		int end = 0;
		try {
			end = area.getLineEndOffset(last);
		} catch (BadLocationException e1) {
			e1.printStackTrace();
		}
		if (end!=0) {
			firstText = area.getText().substring(start, end);
			TextResult();
		}
	}

	public void TextResult() {
		Interpreter inter;
		inter = new ComplexInterpreter();
		String result = inter.interpret(firstText);
		areaResult.setText(result);
		areaResult.setLineWrap(true);
		areaResult.setWrapStyleWord(true);
	}
}
