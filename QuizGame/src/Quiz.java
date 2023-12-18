import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Quiz implements ActionListener{
	
	String[] questions = 	{
								"Which company created Java?", 
								"Which year was Java created?",
								"What was Java original called?",
								"Who is credited with creating Java?"
							};
	
	String[][] options = 	{
								{"Sun Microsystems", "Starbucks", "Microsoft", "Alphabet"},
								{"19", "1996", "1972", "1492"},
								{"Apple", "Latte", "Oak", "Koffing"},
								{"Steve Jobs", "Bill Gates", "James Gosling", "Mark Zukerberg"}
							};
	char[] answers = 		{
								'A',
								'B',
								'C',
								'D'
							};
	char guess;
	char answer;
	int index;
	int correct_guesses = 0;
	int total_questions = questions.length;
	int result;
	int seconds = 10;
	
	JFrame frame = new JFrame();
	JTextField textfield = new JTextField();
	JTextArea textarea = new JTextArea();
	JButton buttonA = new JButton();
	JButton buttonB = new JButton();
	JButton buttonC = new JButton();
	JButton buttonD = new JButton();
	JLabel answer_labelA = new JLabel();
	JLabel answer_labelB = new JLabel();
	JLabel answer_labelC = new JLabel();
	JLabel answer_labelD = new JLabel();
	JLabel time_label = new JLabel();
	JLabel seconds_left = new JLabel();
	JTextField number_right = new JTextField();
	JTextField percentage = new JTextField();
	
	public Quiz() {
		
	}
	
	public void nextQuestion() {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
	public void displayAnswer() {
		
	}
	
	public void results() {
		
	}
	
}
